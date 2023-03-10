import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class HomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cookieName = req.getParameter("cookie");
        Cookie[] myCookies = req.getCookies();
        if (cookieName == null) {
            resp.sendRedirect("homepage.jsp");
        }
        for (Cookie c : myCookies) {
//            kurde nie widze jak to obejść
//            już sobie sprawdziłe rozwiązanie
            if (cookieName.equals(c.getName())){
                resp.sendRedirect("witaj.jsp");
            }else {
                resp.sendRedirect("homepage.jsp");

            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String akc = req.getParameter("akcpetuje");
        if (akc.equalsIgnoreCase("akceptuje")) {
            Cookie myCookie = new Cookie("cookie","akceptuje");
            myCookie.setMaxAge(85422221);
            resp.addCookie(myCookie);
            resp.sendRedirect("witaj.jsp");
        }else {
            resp.sendRedirect("nieWitaj.jsp");
        }
    }
}
