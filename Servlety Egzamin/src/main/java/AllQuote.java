import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/allQuote")
public class AllQuote extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sess = req.getSession();
        List<Quote> quoteList = new ArrayList<>();
        if (sess.getAttribute("quote") == null) {
            resp.sendRedirect("brak.jsp");
        } else {
            quoteList.addAll((List<Quote>)sess.getAttribute("quote"));
            req.setAttribute("quote",quoteList);
            getServletContext().getRequestDispatcher("/allQuote.jsp").forward(req,resp);
        }
    }
}
