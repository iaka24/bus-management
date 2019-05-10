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

    <h2> ROUTE INFORMATION TABLE </h2>

<table>
  
        <table>  
<tr>  
    <th>ROUTE ID</th>
    <th>STOP 1</th>
    <th>STOP 2</th>
    <th>PICK UP</th>
    
</tr>  

<%Configuration cff=null;
        SessionFactory ss=null;
        Session sesss=null;
        List<Route>lis=null;
        try{
            cff=new Configuration();
            cff.configure();
            ss=cff.buildSessionFactory();
             sesss =ss.openSession();
             Transaction txx=sesss.beginTransaction();
Criteria criteria=sesss.createCriteria(Route.class);
lis=criteria.list();
            txx.commit();
for(Route sbb :lis)
            { %>
              <tr>  
           
            <td><%out.print(sbb.getRoute_Id());%></td>
            <td><%out.print(sbb.getStop1());%></td>
            <td><%out.print(sbb.getStop2());%></td>
            <td><%out.print(sbb.getPickip());%></td> 
            
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
