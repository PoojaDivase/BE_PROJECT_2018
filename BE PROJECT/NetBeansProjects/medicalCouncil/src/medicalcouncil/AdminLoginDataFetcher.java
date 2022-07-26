/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalcouncil;
import java.sql.*;
/**
 *
 * @author yogesh
 */
public class AdminLoginDataFetcher
{    
    public boolean checkAdmin(String un,String ps)
    {
        boolean flag=true;
    try
    {
   Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");
    Statement st=con.createStatement();
    String query="select * from admininfo where uname='"+un+"' and pass='"+ps+"'";
    ResultSet rs=st.executeQuery(query);
    if(rs.next())
    {
   flag=true;
           }
    else
    {
        flag=false;
    }

        }
    catch(Exception e)
    {
        System.out.println("in AdminLoginDataFetcher class"+e);
        flag=false;
    }
     return flag;
    }
}
