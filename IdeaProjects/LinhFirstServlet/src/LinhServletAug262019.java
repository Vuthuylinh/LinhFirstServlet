import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "LinhServletAug262019", urlPatterns = "/index")
public class LinhServletAug262019 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        Date today = new Date();
//
//        writer.println("<h1> Hello World </h1>");
//        writer.println("<h1>" + today + "</h1>");
//
//
//        writer.println("</html>");

        PrintWriter writer = response.getWriter();
        writer.println("<h1> Hello World </h1>");
        writer.print("<html>" +
                "<body>" +
                "<h1><p>Time : <samp id=\"hienthi\"></samp></p><h1><script>  function time(){ document.getElementById(\"hienthi\").innerHTML= new Date()} setInterval(time,1000);</script><body>" +
                "</html>");
//        writer.print("</html>");
    }
}
