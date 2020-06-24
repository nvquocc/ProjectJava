/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.dao;

import hibernate.entity.NhanSu;
import hibernate.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author quoc0
 */
public class DAONhanSu {
    // lấy tất cả dữ liệu ở bảng phòng
    public List<NhanSu> getNhanSu() {
        // lấy đối tượng session
        Session session = HibernateUtil.getsSessionFactory().openSession();
        // thực thi truy vấn database
        List list = session.createCriteria(NhanSu.class).list();
        // đóng kết nối
        session.close();
        return list;
    }

    public List<NhanSu> orderByASC() {
        String sql = "select* from NhanSu ";
        // lấy đối tượng session
        Session session = HibernateUtil.getsSessionFactory().openSession();
        /// thực thi truy vấn database
        List list = session.createQuery(sql).list();
        // đóng kết nối
        session.close();
        return list;
    }

    public NhanSu get(String id) {
        // lấy đối tượng session
        Session session = HibernateUtil.getsSessionFactory().openSession();
        // thực thi truy vấn database
        NhanSu ns = (NhanSu) session.get(NhanSu.class, id);
        // đóng kết nối
        session.close();
        return ns;
    }

    public void delete(String manv) {
        Session session = HibernateUtil.getsSessionFactory().openSession();
        Transaction beginTransaction = session.beginTransaction();
        try {
            NhanSu ns = (NhanSu) session.get(NhanSu.class, manv);
            session.delete(ns);
            
            beginTransaction.commit();
        } catch (Exception e) {
            //khi có lỗi khôi phục lại dữ liệu người dùng
            beginTransaction.rollback();// rollback khôi phục lại dữ liệu người dùng
        } finally {
            session.close();
        }
    }

    // transistion :cái dữ liệu sẽ được khôi phục lại dữ liệu
    public void create(NhanSu ns) {
        Session session = HibernateUtil.getsSessionFactory().openSession();
        Transaction beginTransaction = session.beginTransaction();
        try {
            // truy vấn database
            session.save(ns);
            beginTransaction.commit();
        } catch (Exception e) {
            beginTransaction.rollback();
        } finally {
            // thực thi truy vấn datavase, theo tác trên model
            // đóng kết nối
            session.close();
        }
    }

    public void update(NhanSu ns) {
        Session session = HibernateUtil.getsSessionFactory().openSession();
        Transaction beginTransaction = session.beginTransaction();
        try {
            // truy vấn database
            session.update(ns);
            beginTransaction.commit();
        } catch (Exception e) {
            beginTransaction.rollback();
        } finally {
            // đóng kết nối
            session.close();
        }
    }
}
