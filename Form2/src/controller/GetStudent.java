package controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modell.Student;
import model.ejb.StudentDAO;

/**
 *
 * @author bagnes
 */
@WebServlet(name = "GetStudent", urlPatterns = {"/GetStudent"})
public class GetStudent extends HttpServlet {
    @EJB private StudentDAO studentDAO;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");       
        Student student = studentDAO.getStudent(id);
        request.setAttribute("student", student);
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}