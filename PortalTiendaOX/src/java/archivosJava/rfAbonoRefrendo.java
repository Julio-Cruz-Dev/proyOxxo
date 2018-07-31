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
@WebServlet(name = "rfAbonoRefrendo", urlPatterns = {"/rfAbonoRefrendo"})
public class rfAbonoRefrendo extends HttpServlet {

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
            out.println("<title>Servlet rfAbonoRefrendo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='rfAbonoReferendo.jsp'  align='center' title='Ir la página anterior'>REGRESAR..</a>");
            
                
            java.lang.String placas = request.getParameter("placas");
            double pago = Double.parseDouble( request.getParameter("pago")); 
       
            
            int res = abonoRefrendo(placas,pago);
            
            if (res==0){
                out.print("<p>"+ res +"</p>");
            }
            else{
                out.print("<p>registros guardados</p>");                    
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

    private static Integer abonoRefrendo(java.lang.String placas, double pago) {
        refrendo.WSAbonoRefrendo_Service service = new refrendo.WSAbonoRefrendo_Service();
        refrendo.WSAbonoRefrendo port = service.getWSAbonoRefrendoPort();
        return port.abonoRefrendo(placas, pago);
    }

}
