$("#roles-link").click(
    function(e) {
        if (e.target !== this)
            return;
        else {
            if($("#roles-link").hasClass("selected")) {
                $("#roles-link").removeClass("selected");
                $("#roles-items").hide();
            } else {
                $("#roles-link").addClass("selected");
                $("#roles-items").show();
            }
        }
    }
)