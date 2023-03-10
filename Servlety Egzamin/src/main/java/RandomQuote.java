import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/randomQuote")
public class RandomQuote extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sess = req.getSession();
        List<Quote> quoteList = new ArrayList<>();
        if (sess.getAttribute("quote") == null) {
//            resp.getWriter().append("Brak cytatów");
            resp.sendRedirect("brak.jsp");
        } else {
            quoteList.addAll((List<Quote>)sess.getAttribute("quote"));
            Random random = new Random();
            int rand = random.nextInt(quoteList.size());
            req.setAttribute("quote",quoteList.get(rand));
            getServletContext().getRequestDispatcher("/randomQuote.jsp").forward(req,resp);
        }

    }
}
