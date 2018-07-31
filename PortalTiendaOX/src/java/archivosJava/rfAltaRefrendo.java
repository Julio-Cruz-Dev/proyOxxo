/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosJava;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author julio
 */
@WebServlet(name = "rfAltaRefrendo", urlPatterns = {"/rfAltaRefrendo"})
public class rfAltaRefrendo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet rfAltaRefrendo</title>");            
            out.println("</head>");            
            out.println("<a href='rfAltaRefrendo.jsp'  align='center' title='Ir la página anterior'>REGRESAR..</a>");
            out.println("<body>");
                
            java.lang.String nombre = request.getParameter("nombre");
            java.lang.String aPaterno = request.getParameter("amaterno"); 
            java.lang.String aMaterno = request.getParameter("apaterno");
            java.lang.String telefono = request.getParameter("telefono");
            java.lang.String placas = request.getParameter("placas");
            
            String res= altaRefrendo(nombre,aPaterno,aMaterno,telefono,placas);
            
            if (!"Vacio".equals(res)){
                out.print("<p>registros guardados</p>");
            }
            else{
                out.print("<p>"+ res +"</p>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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

    private static String altaRefrendo(java.lang.String nombre, java.lang.String aPaterno, java.lang.String aMaterno, java.lang.String telefono, java.lang.String placas) {
        refrendo.WSAltaRefrendo_Service service = new refrendo.WSAltaRefrendo_Service();
        refrendo.WSAltaRefrendo port = service.getWSAltaRefrendoPort();
        return port.altaRefrendo(nombre, aPaterno, aMaterno, telefono, placas);
    }

}
