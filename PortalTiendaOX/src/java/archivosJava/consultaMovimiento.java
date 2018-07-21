/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author julio
 */
@WebServlet(name = "consultaMovimiento", urlPatterns = {"/consultaMovimiento"})
public class consultaMovimiento extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");                        
            out.println("<head>");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'/>");
            out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/jquery-bootgrid/1.3.1/jquery.bootgrid.css'/>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js'></script>");	
            out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-bootgrid/1.3.1/jquery.bootgrid.js'></script>");   
            out.println("<script>");         
            out.println("$(document).ready( function () {");
            out.println("$('#grid-basic').bootgrid();");               
            out.println("} );");
            out.println("</script>");                        
            out.println("</head>"); 
            out.println("<body width: auto>");
            conexionPool mp = new conexionPool();                  
            Connection con = mp.ds.getConnection();
            
            try {
                Statement stm = con.createStatement();
                
                ResultSet rs = stm.executeQuery("select * from clt_tipo_movimiento");
                
                out.println("<Table id='grid-basic' class='table table-condensed table-hover table-striped'>");    
                                
                out.println("<thead>");
                out.println("<tr>");
                out.println("<th data-column-id='tipo'>Tipo</th>");
                out.println("<th data-column-id='descripcion'>Descripcion</th>");
                out.println("<th data-column-id='costo'>Costo</th>");
                out.println("</tr>");
                out.println("<div width='98%' align='center'>");
                out.println("<a href='tipoMovimiento.jsp'  align='center' title='Ir la página anterior'>REGRESAR..</a>");
                out.println("</div>");
                out.println("</thead>");
                out.println("<tbody>");
                
                while (rs.next() ){                    
                    
                    out.println("<tr>");
                    out.println("<td>"+ rs.getString("tipo") );
                    out.println("</td>");
                    out.println("<td>" + rs.getString("descripcion")) ;
                    out.println("</td>");
                    out.println("<td>" + rs.getString("costo"));
                    out.println("</td>");
                    out.println("</tr>");                    
                                                  
                }
                out.println("</tbody>");
                out.println("</Table>");
            }
            catch(SQLException ex ){
             out.print("<p>El error es: " +  ex.getMessage()  + "</p>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(consultaMovimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(consultaMovimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
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
