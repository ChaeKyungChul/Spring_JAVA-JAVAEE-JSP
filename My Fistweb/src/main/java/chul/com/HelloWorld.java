package chul.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class cron extends HttpServlet {
    //필드
    private long num;

    //메소드
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        System.out.println("doGet 실행");
    }
}