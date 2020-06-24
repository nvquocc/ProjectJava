/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatecontroller;

import hibernate.dao.DAONhanSu;
import hibernate.entity.NhanSu;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quoc0
 */
@WebServlet(name = "updateNhanSu", urlPatterns = {"/updateNhanSu"})
public class updateNhanSu extends HttpServlet {

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
        DAONhanSu dao = new DAONhanSu();
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("manhanvien");
        if (id != null) { // show data before update
            NhanSu ns = dao.get(id);
            request.setAttribute("nhansu", ns);
            request.getRequestDispatcher("updateNhanSu.jsp").forward(request, response);
        } else { // request for update

            String manv = request.getParameter("txtmanv");
            String hoten = request.getParameter("txthoten");
            String ngaysinh = request.getParameter("txtngaysinh");
            String chuyennganh = request.getParameter("txtchuyennganh");
            String vitricv = request.getParameter("txtvitricv");
            String donvict = request.getParameter("txtdonvict");
            String email = request.getParameter("txtemail");
            String dt = request.getParameter("txtdt");
            String ttkhac = request.getParameter("txtthongtinkhac");
            NhanSu ns = new NhanSu(manv, hoten, ngaysinh, chuyennganh, vitricv, donvict, email, dt, ttkhac);

            dao.update(ns);

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
