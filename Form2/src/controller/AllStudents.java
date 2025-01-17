package controller;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ejb.StudentDAO;

/**
 *
 * @author bagnes
 */
@WebServlet(name = "AllStudents", urlPatterns = {"/AllStudents"})
public class AllStudents extends HttpServlet {
    @EJB private StudentDAO studentDAO;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List list = studentDAO.getAllStudents();
        request.setAttribute("list", list);
        request.getRequestDispatcher("index1.jsp").forward(request, response);
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
    }// </editor-fold>
}
