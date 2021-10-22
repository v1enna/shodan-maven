package Model;

public class Role {

    private int user_id;
    private String role_name;

    public Role(int user_id, String role_name) {
        this.user_id = user_id;
        this.role_name = role_name;
    }
    
    public int getUserId() {
        return user_id;
    }

    public String getRoleName() {
        return role_name;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public void setRoleName(String role_name) {
        this.role_name = role_name;
    }

}
