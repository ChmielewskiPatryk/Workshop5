import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/regex")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = req.getParameter("param");
        String regex  = "([^\\s]+(\\.(?i)(jpe?g|png|gif|bmp))$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(param);
        if (param == null) {
            resp.getWriter().append("Brak nazywy");
        }
        if (matcher.matches() == true) {
            resp.sendRedirect("https://www.google.pl/search?q=" + param);
        }else {
            resp.getWriter().append("Niepoprawne dane");
        }
    }
}
