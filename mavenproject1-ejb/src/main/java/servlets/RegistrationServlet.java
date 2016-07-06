package servlets;

import com.google.gson.Gson;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Евгений on 05.07.2016.
 */
@WebServlet(value = "/registration/", name ="registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("First name");
        String lastName = req.getParameter("Last name");
        String login = req.getParameter("Login");
        String password = req.getParameter("Password");
        String confirmPassword = req.getParameter("Confirm password");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        Gson gson = new Gson();

        if(firstName!="" || lastName!="" || login!="" || password!="" || confirmPassword!="" || email!="" || country!=""){
            User user = new User(firstName,lastName,login,password,email,country);
            String json = gson.toJson(user);
            resp.getWriter().println(json);

        }
        else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        }

    }
}
