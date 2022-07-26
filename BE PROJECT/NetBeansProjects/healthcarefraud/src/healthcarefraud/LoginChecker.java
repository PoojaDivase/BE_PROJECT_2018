/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package healthcarefraud;
import java.sql.*;
 

public class LoginChecker {


    public boolean checkLogin(String userid, String pass,String rfor)
    {
        boolean flag=true;

        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();

            String query="Select * from registerinfo where uid='"+userid+"'and password='"+pass+"'and registerfor='"+rfor+"'";

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
            System.out.println("Exeption in LogicChecker Class is: "+e);
            flag=false;
        }




        return flag;
    }

}
