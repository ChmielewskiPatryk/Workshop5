import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/smurfs")
public class ServletSmurf  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SmurfDao smurfDao = new SmurfDao();
        req.setAttribute("smurfs",smurfDao.getList());
        getServletContext().getRequestDispatcher("/smurfs.jsp").forward(req,resp);
    }
}
