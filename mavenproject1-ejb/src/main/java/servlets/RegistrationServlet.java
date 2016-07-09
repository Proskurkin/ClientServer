package servlets;

import bean.UsersBean;
import com.google.gson.Gson;
import entity.User;
import org.hibernate.jpa.internal.EntityManagerImpl;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
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
    @EJB
    private UsersBean usersBean;
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
        EntityManager manager = null;

        if(firstName.isEmpty()||lastName.isEmpty()||login.isEmpty()||password.isEmpty()||confirmPassword.isEmpty()||email.isEmpty()||country.isEmpty()){
            resp.getWriter().println("BAD REQUEST");
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        else {
            User user = new User(firstName,lastName,login,password,email,country);
            String json = gson.toJson(user);
            resp.getWriter().println(json);
            resp.setStatus(HttpServletResponse.SC_OK);
            usersBean.add(user);



        }


    }
}
