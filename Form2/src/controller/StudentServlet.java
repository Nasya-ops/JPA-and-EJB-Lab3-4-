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
@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

    @EJB
    private StudentDAO studentDAO;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentID = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("averscore");
        String operation = request.getParameter("operation");

        Student student = new Student(studentID, name, address);

        if (operation.equalsIgnoreCase("Add")) {
            studentDAO.addStudent(student);
            request.setAttribute("student", student);
        } else if (operation.equalsIgnoreCase("Edit")) {
            studentDAO.editStudent(student);
            Student searchedStudent = studentDAO.getStudent(studentID);
            request.setAttribute("student", searchedStudent);
        } else if (operation.equalsIgnoreCase("Delete")) {
            studentDAO.deleteStudent(studentID);
        } else if (operation.equalsIgnoreCase("Search")) {
            Student searchedStudent = studentDAO.getStudent(studentID);
            request.setAttribute("student", searchedStudent);
        }
        request.getRequestDispatcher("studentinfo.jsp").forward(request, response);
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
