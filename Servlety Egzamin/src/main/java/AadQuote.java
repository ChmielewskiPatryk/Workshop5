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

@WebServlet("/addQuote")
public class AadQuote extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("quote.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String quote = req.getParameter("quote");
        String author = req.getParameter("author");
        Quote quote1 = new Quote(author,quote);
        HttpSession sess = req.getSession();
        List<Quote> quoteList = new ArrayList<>();
        quoteList.add(quote1);
        if (sess.getAttribute("quote") == null) {
            sess.setAttribute("quote", quoteList);
        }else {
            quoteList.addAll((List<Quote>)sess.getAttribute("quote"));
            sess.setAttribute("quote", quoteList );
        }
        resp.sendRedirect("index.jsp");
    }
}
