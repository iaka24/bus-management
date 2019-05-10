/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class AdminServlet extends HttpServlet {

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
             String fname=request.getParameter("firstname");
            String id=request.getParameter("id");
            String phone=request.getParameter("phone");
             String address=request.getParameter("address");
             String sroute=request.getParameter("sroute");
            String spassword=request.getParameter("spassword");
            String dname=request.getParameter("dname");
             String dnumber=request.getParameter("dnumber");
            String did=request.getParameter("did");
            String daddress=request.getParameter("daddress");
            String sid=request.getParameter("sid");
            String route_id=request.getParameter("route_id");
            String stop1=request.getParameter("stop1");
            String stop2=request.getParameter("stop2");
            String pickip=request.getParameter("pickip");
            
          
            String test=request.getParameter("test");
            AdminDAO stu=new AdminDAO();
            if(test.equals("addS"))
            {
                 stu.studentdata(fname,id,phone,address,sroute,spassword);
         }
             if(test.equals("addD"))
            {
            stu.adddriver(dname,dnumber,did,daddress);}
            if(test.equals("deleteD"))
            {
            stu.deletedriver(did);}
            if(test.equals("deleteS"))
            {
            stu.deletestudent(sid);}
            /*if(test.equals("changeR"))
            {
                 System.out.println("chk ds");
            stu.changeroute(route_id,stop1,stop2,pickip);}*/
            if(test.equals("giveR"))
            {
                 System.out.println("chk ds");
            stu.giveroute(route_id,stop1,stop2,pickip);}
            
           response.sendRedirect("admin-dashborad.jsp");
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

}
