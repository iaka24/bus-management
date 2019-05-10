/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HP
 */
public class StudentDAO {
    public boolean checkdata(String sid, String spwd)
    {
        List<Student> list=null;
        Configuration cf=null;
        SessionFactory sf=null;
        String h="";
        Session session=null;
        try{
            cf =new Configuration();
cf.configure();
sf=cf.buildSessionFactory();
 session =sf.openSession();
 Transaction tx=session.beginTransaction();
 Query query=session.createQuery("from Student where id=:n and student_password=:m");
  query.setParameter("n",sid);
  query.setParameter("m",spwd);
 list=query.list();
 tx.commit();
 for(Student s:list)
 {
     h=s.getID()+"";
    
    }
        }catch(Exception ee)
        {
            ee.printStackTrace();
        }
         finally{
                  session.close();
        sf.close();

                 }
 if(h.equals(sid))
 {
     return true;
 }
 return false;
        }
}
