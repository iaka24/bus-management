
package Hibernate;


import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AdminDAO {
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
             Query query=session.createQuery("delete from Driver where driver_id=:n");
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
       
        public void giveroute(String route_id,String stop1,String stop2,String pickip)
      
    {Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        try{
            cf =new Configuration();
cf.configure();
sf=cf.buildSessionFactory();
 session =sf.openSession();
 Transaction tx=session.beginTransaction();
       Route u=new Route();
        u.setRoute_Id(route_id);
        u.setStop1(stop1);
        u.setStop2(stop1);
        u.setPickip(pickip);
       
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
public void changeroute(String route_id,String stop1,String stop2,String pickip)
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
             Query query=session.createQuery("delete from Route where Route_Id=:n");
            query.setParameter("n",route_id);
             query.executeUpdate();
                   
            Route u=new Route();
        u.setRoute_Id(route_id);
        u.setStop1(stop1);
        u.setStop2(stop2);
        u.setPickip(pickip);
         session.save(u);
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
