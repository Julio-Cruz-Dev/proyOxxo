/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Conexion.Conexion;
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
@WebServlet(name = "ServletConsRef", urlPatterns = {"/ServletConsRef"})
public class ServletConsRef extends HttpServlet {

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
            out.println("<title>Servlet ServletConsRef</title>");
            out.println("<link rel='stylesheet' type='text/css' href='css/DisenioForm.css'>");            
            out.println("</head>");
            out.println("<body>");
            
           //Conexion mp = new Conexion();
            try {
             
                double res=saldoRefrendo (request.getParameter("txtNumPlacas"));
                //out.println(res+"");
                //res=saldo(request.getParameter("txtNumTel")
                out.println("<form>");
                out.println("<p> Placa: "+request.getParameter("txtNumPlacas")+"</p>");
                out.println("<p> Su Adeudo: $ "+res+"</p>");
                out.println("<a href='index.jsp'>");
                out.println("<input type='button' value='Regresar' name='submit'/>");
                out.println("</a>");
                out.println("</form>");
           //Connection con= mp.ds.getConnection();
                 
                // ********LA FORMA DE STATEMENT CONSULTA DIRECTA ES CON LA VARIABLE (rs)******
                
//                Statement stm = con.createStatement();
//                String  sql="SELECT P.nombre, P.a_paterno, P.a_materno,R.placa,R.saldo "
//                        + "FROM dbo.tbl_persona P "
//                        + "INNER JOIN  dbo.tbl_refrendo R ON R.id_persona=P.Id "
//                        + "WHERE R.placa='"+ request.getParameter("txtNumPlacas")+"'";
//                          
//                        
//                 ResultSet rs =  stm.executeQuery(sql);
                
                
        // ******* LA FORMA DE CALLABLESTATEMENT CON PROCEDIMIENTO ALMACENADO (resul)****** 
                //CallableStatement cstm;
                //String csql="{call SP_ConsultarSaldo_Refrendo(?)}";
                //cstm=con.prepareCall(csql);  
                //cstm.setString(1,request.getParameter("txtNumPlacas"));  
        
                //ResultSet resul = cstm.executeQuery();
                
                 //String Nombre;
                 //String APaterno;
                 //String AMaterno;
                 //String Placa;
                 //Float Saldo;
                 
                 //***** LEEMOS EL RESULTADO DE LA CONSULTA (rs) O DEL SP (resul)******* 
                   // while(resul.next()){
                        //Nombre=rs.getString("nombre");
                     //   Nombre=resul.getString("nombre");
                        //APaterno=rs.getString("a_paterno");
                     //   APaterno=resul.getString("a_paterno");
                        //AMaterno=rs.getString("a_materno");
                     //   AMaterno=resul.getString("a_materno");
                        //Placa=rs.getString("placa");
                     //   Placa=resul.getString("placa");
                        //Saldo=rs.getFloat("saldo");
                     //   Saldo=resul.getFloat("saldo");
                     //   out.println("<form>");
                     //   out.println("<p> Nombre Usuario: "+Nombre+" "+APaterno+" "+ AMaterno+"</p>");
                     //   out.println("<p> Placa: "+Placa+"</p>");
                     //   out.println("<p> Su Adeudo: $ "+Saldo+"</p>");
                     //   out.println("<a href='index.jsp'>");
                     //   out.println("<input type='button' value='Regresar' name='submit'/>");
                     //   out.println("</a>");
                     //   out.println("</form>");
                     //   }
                
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


    private static double saldoRefrendo(java.lang.String placas) {
        WebServiceRefrendo.WSPagoRefrendo_Service service = new WebServiceRefrendo.WSPagoRefrendo_Service();
        WebServiceRefrendo.WSPagoRefrendo port = service.getWSPagoRefrendoPort();
        return port.saldoRefrendo(placas);
    }
    


}
