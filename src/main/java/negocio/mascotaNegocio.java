/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import modelo.HibernateUtil;
import modelo.Mascota;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class mascotaNegocio {
    
     public void insert(Mascota record) {
       
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session ss = sf.openSession();
       Transaction tst = ss.beginTransaction();
       ss.save(record);
       ss.flush();
       tst.commit();
       
   }
    
    
}
