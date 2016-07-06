package servlets;

import com.google.gson.Gson;
import entity.User;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Евгений on 05.07.2016.
 */
@WebServlet(value = "/signIn/", name = "signIn")
public class SignInServlet extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        out.println("<html>");
//        out.println("<body>");
//        out.println("<h1>Hello1 Servlet Get</h1>");
//        out.println("</body>");
//        out.println("</html>");
//    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String login = req.getParameter("Login");
        String pass = req.getParameter("Pass");

        if (login.isEmpty() ||  pass.isEmpty()) {
            resp.setContentType("text/html;charset=utf-8");
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            }

        else {
            User user = new User(login,pass);
            Gson gson = new Gson();
            String json = gson.toJson(user);
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Hello Servlet POST</h1>");
            out.println(login);
            out.println(pass);
            out.println("</body>");
            out.println("</html>");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().println(json);
            resp.setStatus(HttpServletResponse.SC_OK);
            }
    }
}
