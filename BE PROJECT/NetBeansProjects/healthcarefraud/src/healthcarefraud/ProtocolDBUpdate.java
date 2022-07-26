/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package healthcarefraud;
import java.sql.*;


public class ProtocolDBUpdate {
    
    
    public boolean updateInfo(String dise,String sm, String nsm,String recall,String indays,String refdoc,String sc,String sp, String nsp,String sd, String nsd)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();
            
            String query="Update protocolinfo set suggesting_medicine='"+sm+"',notsuggesting_medicine='"+nsm+"',recalls='"+recall+"',recalls_periods='"+indays+"',doctor='"+refdoc+"',service_cost='"+sc+"',suggesting_procedures='"+sp+"',notsuggesting_procedures='"+nsp+"',suggesting_dietary='"+sd+"',notsuggesting_dietary='"+nsd+"' where diseases='"+dise+"'";


            
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
