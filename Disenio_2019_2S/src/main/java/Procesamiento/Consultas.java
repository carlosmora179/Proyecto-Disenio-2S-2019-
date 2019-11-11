/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesamiento;

import Conexion.Controller;
import POJOS.Hotel;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Peña
 */
public class Consultas {
    
    public static void consultaPuntuacion(){
        Session session = Controller.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query cons =  session.createQuery("from hotel h where h.Recomendado = 1");
        List<?> lista = cons.list();
        
        for(Object objeto : lista){
            
            System.out.println(objeto.toString());
            
        }
        
        
        
    }
    public static void main(String[] args) {
            
            Consultas.consultaPuntuacion();
            
        }
    
}
