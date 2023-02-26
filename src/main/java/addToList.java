import pl.coderslab.users.User;
import pl.coderslab.users.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/user/addToList")
public class addToList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/users/addToList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        userDao.creat(user);
        resp.sendRedirect(req.getContextPath() + "/user/list");
    }
}
