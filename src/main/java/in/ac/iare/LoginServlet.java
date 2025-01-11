package in.ac.iare;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginServlet extends HttpServlet {
  public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    String user=request.getParameter("user").trim();
    String pass=request.getParameter("pass").trim();
    if(user.equals("abc") && pass.equals("xyz")) {
      request.setAttribute("user",user);
      getServletContext().getRequestDispatcher("/LoginSuccess.jsp").forward(request, response);
    } else {
      response.sendRedirect("./LoginFailed.html");
    }
  }
}