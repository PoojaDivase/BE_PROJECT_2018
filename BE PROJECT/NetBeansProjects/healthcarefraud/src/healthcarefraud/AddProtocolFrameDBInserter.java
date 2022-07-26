/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package healthcarefraud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class AddProtocolFrameDBInserter {
    
     public boolean insertProtocolinfo(String dis, String sm, String nsm,String recall,String indays,String refdoc,String sc,String sp, String nsp,String sd, String nsd)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();
            
            String query="Insert into protocolinfo values('"+dis+"','"+sm+"','"+nsm+"','"+recall+"','"+indays+"','"+refdoc+"','"+sc+"','"+sp+"','"+nsp+"','"+sd+"','"+nsd+"')";
            
//            
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exeption in AddProtocolFrameDBInserter Class is: "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
    
    
}
