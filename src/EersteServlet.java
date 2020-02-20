import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Dynamische pagina</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Test</h1>");
        out.println("<a href='index.html'>Home</a>");
        out.println("<p id=dynamisch>");
        out.println((int)(Math.random()*101));
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
