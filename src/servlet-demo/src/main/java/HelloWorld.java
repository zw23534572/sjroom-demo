import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 扩展 HttpServlet 类
 */
public class HelloWorld extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello World , Nect To Meet You: " + System.currentTimeMillis();
        System.out.println("servlet初始化……");
        super.init();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String request = req.getParameter("aa");
        // TODO Auto-generated method stub
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<h1> message:" + message + "</h1>");
        writer.write("<h1> request:" + request + "</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("servlet销毁！");
        super.destroy();
    }
}