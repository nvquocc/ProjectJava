/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author quoc0
 */
public class HibernateUtil {

    // khai bao seesstion factory
    public static SessionFactory sessionFactory;

    public static SessionFactory buildSessionFactory() {
        try {
            //Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            System.out.println("Hibernate Configuaration loaded");
            // apply configuration property settings to StandardServicesRegistryBuilder
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            System.out.println("Hibernate serviceRegistry loaded");

            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        } catch (HibernateException ex) {
            // Make sure you log the exception as it might be swallowed
            System.err.println("Initial sessionFactory cretion failed" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getsSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }

    public static void main(String[] args) {
        System.out.println("connected");
    }
}
