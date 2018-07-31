/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Conexion.Conexion;
import WebServices.RespuestaSaldo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
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
 * @author tazj13857
 */
@WebServlet(name = "ServletConsTel", urlPatterns = {"/ServletConsTel"})
public class ServletConsTel extends HttpServlet {

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
            out.println("<title>Servlet ServletConsTel</title>");  
            out.println("<link rel='stylesheet' type='text/css' href='css/DisenioForm.css'>");
            out.println("</head>");
            out.println("<body>");
            
//                 Conexion mp = new Conexion();
          try {
//                Connection con= mp.ds.getConnection();
//                 
//                Statement stm = con.createStatement();
//                String  sql="SELECT P.nombre, P.a_paterno, P.a_materno, P.telefono,PT.nombre Telefonia, T.saldo "
//                          + "FROM dbo.tbl_persona P "
//                          + "INNER JOIN dbo.tbl_telefonia T ON T.id_persona=P.Id "
//                          + "LEFT JOIN dbo.clt_proveedor_telefonia PT ON PT.id=T.id_proveedor "
//                          + "WHERE P.telefono='"+ request.getParameter("txtNumTel")+"'";
//                        
//                 ResultSet rs =  stm.executeQuery(sql);
                
                WebServices.RespuestaSaldo res= new WebServices.RespuestaSaldo();
                res=saldo(request.getParameter("txtNumTel"));
                
                if(res.getRespuesta().isSuccess()==true) {
                //out.println("<p> Su Saldo: $ "+res.getSaldo()+"</p>");
                out.println("<form>");
                out.println("<p> Nombre Usuario: "+res.getNombre()+" "+res.getApepaterno()+" "+ res.getApematerno()+"</p>");
                out.println("<p> Telefonia: "+ res.getTelefonia()+"</p>");
                out.println("<p> Telefono: "+res.getTelefono()+"</p>");
                out.println("<p> Su Saldo: $ "+res.getSaldo()+"</p>");
                out.println("<a href='index.jsp'>");
                out.println("<input type='button' value='Regresar' name='submit'/>");
                out.println("</a>");
                out.println("</form>");
                }
                else {
                out.println("<p>"+res.getRespuesta().getMessage()+"</p>");
            }
        

        
//                 String Nombre;
//                 String APaterno;
//                 String AMaterno;
//                 String Telefono;
//                 String Telefonia;
//                 Float Saldo;
//                 
//                    while(rs.next()){
//                        Nombre=rs.getString("nombre");
//                        APaterno=rs.getString("a_paterno");
//                        AMaterno=rs.getString("a_materno");
//                        Telefono=rs.getString("telefono");
//                        Telefonia=rs.getString("Telefonia");
//                        Saldo=rs.getFloat("saldo");
//                        out.println("<form>");
//                        out.println("<p> Nombre Usuario: "+Nombre+" "+APaterno+" "+ AMaterno+"</p>");
//                        out.println("<p> Telefonia: "+Telefonia+"</p>");
//                        out.println("<p> Telefono: "+Telefono+"</p>");
//                        out.println("<p> Su Saldo: $ "+Saldo+"</p>");
//                        out.println("<a href='index.jsp'>");
//                        out.println("<input type='button' value='Regresar' name='submit'/>");
//                        out.println("</a>");
//                        out.println("</form>");
//                        }
                
            } catch (Exception ex) {
                Logger.getLogger(ServletConsTel.class.getName()).log(Level.SEVERE, null, ex);
            out.println("<p> No se conecto </p>");
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

   

    private static RespuestaSaldo saldo(java.lang.String noCel) {
        WebServices.WSTelefonia_Service service = new WebServices.WSTelefonia_Service();
        WebServices.WSTelefonia port = service.getWSTelefoniaPort();
        return port.saldo(noCel);
    }

}
