/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.DAOpersona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.persona;

/**
 *
 * @author principal
 */
public class Persona extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Persona</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Persona at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String op=request.getParameter("op");
       String pagina;
       if (op.equals("nuevo")){
           pagina = "/wpersona/ingresopersona.jsp";
           RequestDispatcher dispacher = getServletContext().getRequestDispatcher(pagina);
           dispacher.forward(request, response);
       }
           
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
      persona per = new persona();
      per.setNombre(request.getParameter("nombre"));
      per.setApellido(request.getParameter("apellido"));
      per.setSexo(request.getParameter("sexo"));
      per.setEstadoCivil(request.getParameter("estado"));
      per.setEstatusNacional(Integer.parseInt(request.getParameter("nacionalidad")));
      //per.setFechaNacimiento(request.getParameter("fechaNacimiento"));
      per.setIdLugarNacimiento(Integer.parseInt(request.getParameter("lugarN")));
    
      per.setIdVecindad(Integer.parseInt(request.getParameter("vecindad")));      
      DAOpersona daop = new DAOpersona();
      daop.save(per);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
