/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.Respuesta;

/**
 *
 * @author julio
 */
@WebServlet(name = "altaCatProveedores", urlPatterns = {"/altaCatProveedores"})
public class altaCatProveedores extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<div width='98%' align='center'>");
            out.println("<a href='ctlProveedores.jsp'  align='center' title='Ir la página anterior'>REGRESAR..</a>");
            out.println("</div>");          
            out.println("</head>");
            out.println("<body>");
//////                        
////            conexionPool mp = new conexionPool();                    
////            Connection con = mp.ds.getConnection();
////            
////            
////                Statement stm = con.createStatement();  
////                
////                String consulta;
////                
                service.ProveedoresTelefonia proveedor = new service.ProveedoresTelefonia();
                
                proveedor.setNombre(request.getParameter("nombre"));
                proveedor.setImpuestos(Float.parseFloat(request.getParameter("impuesto")));               
                proveedor.setDescripcion(request.getParameter("descripcion"));
                
//                consulta=" insert into clt_proveedor_telefonia (nombre,descripcion,impuestos) values('" + request.getParameter("nombre") + "','";                
//                consulta= consulta + request.getParameter("descripcion") + "',";
//                consulta= consulta + request.getParameter("impuesto")+ ")";                
//                stm.executeUpdate(consulta);        
                Respuesta  res = insertaProveedor(proveedor);
                if (res.isSuccess()==true){
                    out.print("<p>registros guardados</p>");
                }else
                {
                    out.print("<p>"+ res.getMessage() +"</p>");
                }
                
          
            out.println("</body>");
            out.println("</html>");
        }catch(NumberFormatException ex){
                out.println("<p>"+ ex.getMessage()+"</p>");
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
            Logger.getLogger(altaCatProveedores.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(altaCatProveedores.class.getName()).log(Level.SEVERE, null, ex);
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

    private static Respuesta insertaProveedor(service.ProveedoresTelefonia proveedor) {
        service.WSTelefonia_Service service = new service.WSTelefonia_Service();
        service.WSTelefonia port = service.getWSTelefoniaPort();
        return port.insertaProveedor(proveedor);
    }



}
