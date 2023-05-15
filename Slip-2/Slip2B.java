import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class Slip2B extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException
    {
        resp.setContentType("text/html");
        String userinfo=req.getHeader("User-Agent");
        
        PrintWriter p=resp.getWriter(); 
    } 
}

<html> 
    <body>
        <form action="http://localhost:8080/serv/NewServlet" method="get">
            Username:<input type="text" name="t1">
            <input type="submit" >
        </form>
    </body>
</html>