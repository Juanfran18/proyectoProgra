/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.DAOPersona;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;

/**
 *
 * @author principal
 */
public class Personasvr extends HttpServlet {

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
        String op = request.getParameter("op");
        String pagina;
        if (op.equals("nuevo")) {
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
        Persona per = new Persona();
        per.setCui("hola5");
        per.setNombre(request.getParameter("nombre"));
        per.setApellido(request.getParameter("apellido"));
        per.setSexo(request.getParameter("sexo"));
        per.setEstadoCivil(request.getParameter("estado"));
        String d = request.getParameter("nacionalidad");
        int a;
        if (d.equals("Guatemalteco")) {
            a = 1;
            per.setEstatusNacional(a);
        } else {
            a=2;
            per.setEstatusNacional(a);
        }        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
	String dateInString = request.getParameter("fechaDeNacimiento");   
        try {            
           Date date = formatter.parse(dateInString);
           per.setFechaNacimiento(date);
        } catch (ParseException ex) {
            Logger.getLogger(Personasvr.class.getName()).log(Level.SEVERE, null, ex);
        }
        //tipo fecha
        per.setIdLugarNacimiento(Integer.parseInt(request.getParameter("lugarN")));
        per.setIdVecindad(Integer.parseInt(request.getParameter("vecindad")));
        
        DAOPersona daop = new DAOPersona();
        daop.registrar(per);
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
