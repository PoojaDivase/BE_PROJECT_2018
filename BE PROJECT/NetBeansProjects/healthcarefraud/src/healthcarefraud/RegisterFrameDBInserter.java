/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package healthcarefraud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class RegisterFrameDBInserter {
    
     public boolean insertRegistrationinfo(String name, String dob, String add,String email,String mob,String rfor,String uid,String pass)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();
            
            String query="Insert into registerinfo values('"+name+"','"+dob+"','"+add+"','"+email+"','"+mob+"','"+rfor+"','"+uid+"','"+pass+"')";
            
//            
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exeption in RegisterFrameDBInserter Class is: "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
    
    
}
