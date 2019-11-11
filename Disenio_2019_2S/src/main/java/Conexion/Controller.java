package Conexion;

import Conexion.*;
import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author daparo
 */
public class Controller {
    
        public static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure("/conexion/hibernate.cfg.xml").buildSessionFactory();
            
            
             System.out.println("session Factory = "+sessionFactory.toString()+" current session="+sessionFactory.getCurrentSession()+
                    " collection="+sessionFactory.getAllCollectionMetadata()+" collection="+sessionFactory.getStatistics());
            
            
        } catch (HibernateException ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
