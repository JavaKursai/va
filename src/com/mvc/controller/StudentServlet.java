package com.mvc.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.service.StudentService;
/**
 * Servlet implementation class StudentServlet
 */
@WebServlet(name="/StudentServlet", urlPatterns = "/students")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    private StudentService service = new StudentService();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("id");
        
        if(studentId != null) {
            int id = Integer.parseInt(studentId);
            
            service.getStudent(id).ifPresent(s -> request.setAttribute("student", s));
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/student.jsp");
        dispatcher.forward(request, response);
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
