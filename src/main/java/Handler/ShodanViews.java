package Handler;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.User;
import Service.UserService;
import Service.ViewService;

@WebServlet("/ShodanViews")
public class ShodanViews extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    private User user;

    public enum Role {
        GUEST,
        USER,
        WRITER,
        STOREMAN
    }

    public enum RequestedView {
        LANDING,
        NAV,
        ADMIN
    }

    protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
        System.out.println("# ShodanViews > Accesso al modulo dei ruoli");

		Connection connection = (Connection) request.getServletContext().getAttribute("databaseConnection");
		RequestedView requestedView = RequestedView.valueOf(request.getParameter("view"));

		if(request.getParameter("cookie").equals("false"))
			user = new UserService(connection).getUserBySession(request.getParameter("jsession"));
		else
			user = (User) request.getSession().getAttribute("user_metadata");

        String path = new ViewService(connection).getView(user.getRole(), requestedView);

        System.out.println("# ShodanViews > View ottenuta (" + user.getRole() + ", " + requestedView + ", " + path + ")");

        response.getWriter().println(path);
    }
}
