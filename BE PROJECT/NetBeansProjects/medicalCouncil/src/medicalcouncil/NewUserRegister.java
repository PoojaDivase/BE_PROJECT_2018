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
public class NewUserRegister
{
       public boolean insertField(String fn,String ln,String dob,String id,String num,String un,String pass)
      {
       try
       {
         Class.forName("com.mysql.jdbc.Driver").newInstance();

         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");

         Statement st=con.createStatement();

         String str="insert into admininfo values ('"+fn+"','"+ln+"','"+dob+"','"+id+"','"+num+"','"+un+"','"+pass+"')";

                 int x=st.executeUpdate(str);

                 System.out.println(x);

                if(x>0)
                {
                  return true;
                }
                else
                {
                  return false;
                }

       }
       catch(Exception e)
       {
           System.out.println("Insert Data"+e);

           return false;
       }

     }

}

