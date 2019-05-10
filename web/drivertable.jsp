<%@page import="org.hibernate.Criteria"%>
<%@page import="Hibernate.Route"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="java.util.List"%>
<%@page import="Hibernate.Driver"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<h2>DRIVER INFORMATION TABLE</h2>

<table>
  
        <table>  
<tr>  
    <th>DRIVER NAME</th>
    <th>DRIVER PHONE NUMBER</th>
    <th>DRIVER ID</th>
    <th>DRIVER ADDRESS</th>
    
</tr>  

<%Configuration cff=null;
        SessionFactory ss=null;
        Session sesss=null;
        List<Driver>lis=null;
        try{
            cff=new Configuration();
            cff.configure();
            ss=cff.buildSessionFactory();
             sesss =ss.openSession();
             Transaction txx=sesss.beginTransaction();
Criteria criteria=sesss.createCriteria(Driver.class);
lis=criteria.list();
            txx.commit();
for(Driver sbb :lis)
            { %>
              <tr>  
           
            <td><%out.print(sbb.getDriver_Name());%></td>
            <td><%out.print(sbb.getDriver_Phone_Number());%></td>
            <td><%out.print(sbb.getDriver_Id());%></td>
            <td><%out.print(sbb.getDriver_Address());%></td> 
            
</tr>
<%}}catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            sesss.close();
            ss.close();
        }%>
</table>  


</body>
</html>
