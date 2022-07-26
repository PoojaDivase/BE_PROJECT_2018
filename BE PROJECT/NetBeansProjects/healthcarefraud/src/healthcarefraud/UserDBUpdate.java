/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package healthcarefraud;
import java.sql.*;


public class UserDBUpdate {
    
    
    public boolean updateInfo(String name, String dob, String add,String email,String mob,String uid,String pass)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();
            
            String query="Update registerinfo set name='"+name+"',dob='"+dob+"',address='"+add+"',email='"+email+"',mobile='"+mob+"',password='"+pass+"' where uid='"+uid+"'";


            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exeption in UpdateDatabase Class is: "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
    
}
