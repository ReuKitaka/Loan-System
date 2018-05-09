package Controlers;
import Entity.Profile;
import java.util.Date;
import Entity.Enums.YesNo;
import Entity.Enums.Status;

import Entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUser extends CustomServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user=new User();
        user.setSurname(get(req,""));
        user.setOthernames(get(req,""));
        user.setUsername(get(req,""));
        user.setPassword(get(req,""));
        user.setEmail(get(req,""));
        user.setMobileNumber(get(req,""));
        //getprbyid
        user.setProfile(new Profile(get(req,"")));
        user.setIsUserSuper(get(req,""));
        user.setStatus(Status.fromString(get(req,"")));
        user.setDateStatusChanged(new Date());
        user.setAdmin(YesNo.fromString(get(req,"")));
        user.setChangePassword(YesNo.fromString(get(req,"")));
        user.setAuthentic(false);


        super.doPost(req, resp);
    }
}
