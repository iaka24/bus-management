
package Hibernate;


import static java.util.Collections.list;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class StaffDAO {
    public boolean checkdata(String sid, String spwd)
    {
        List<Staff> list=null;
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
 Query query=session.createQuery(" from Staff where sid=:n and spassword=:m");
  query.setParameter("n",sid);
  query.setParameter("m",spwd);
 list=query.list();
 tx.commit();
 for(Staff s:list)
 {
     h=s.getSId()+"";
    
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
    
public void studentdata(String fname,String Id,String phone,String address,String sroute,String spassword)
      
    {Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        try{
            cf =new Configuration();
cf.configure();
sf=cf.buildSessionFactory();
 session =sf.openSession();
 Transaction tx=session.beginTransaction();
       Student u=new Student();
        u.setName(fname);
        u.setID(Id);
        u.setStudent_Password(spassword);
        u.setPhone_Number(phone);
        u.setAddress(address);
        u.setStudent_Route(sroute);
         session.save(u);
         tx.commit();
        }
         catch(Exception ee)
        {
            ee.printStackTrace();
        }
         finally{
                  session.close();
        sf.close();

                 }
   
    
        }
     public void adddriver(String dname,String dnumber,String did,String daddress)
      
    {Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        try{
            cf =new Configuration();
cf.configure();
sf=cf.buildSessionFactory();
 session =sf.openSession();
 Transaction tx=session.beginTransaction();
       Driver u=new Driver();
        u.setDriver_Name(dname);
        u.setDriver_Id(did);
        u.setDriver_Phone_Number(dnumber);
        u.setDriver_Address(daddress);
         session.save(u);
         tx.commit();
        }
         catch(Exception ee)
        {
            ee.printStackTrace();
        }
         finally{
                  session.close();
        sf.close();

                 }
        
        }
     
      public void deletedriver(String did)
    {
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        try{
            cf=new Configuration();
            cf.configure();
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            Transaction tx=session.beginTransaction();
             Query query=session.createQuery("delete from Driver where id:n");
            query.setParameter("n",did);
            query.executeUpdate();
            tx.commit();       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
    }
        public void deletestudent(String sid)
    {
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        try{
            cf=new Configuration();
            cf.configure();
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            Transaction tx=session.beginTransaction();
             Query query=session.createQuery("delete from Student where id=:n");
            query.setParameter("n",sid);
            query.executeUpdate();
            tx.commit();       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
    }
       
}

