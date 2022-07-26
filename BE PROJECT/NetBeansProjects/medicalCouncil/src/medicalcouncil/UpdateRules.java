/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalcouncil;

import java.sql.*;

 public class UpdateRules
 	{
	public boolean updateInfo(String sm,String nsm,String recall,String indays,String refdoc,String cost,String sp,String nsp,String sd,String nsd,String de)
	{
  //Diseases, suggmedicine, notsuggmedicine, recalls, indays, refdoctor, servicecost, suggprocedures, notsuggprocedures, dietary, notdietary        
	 try
       {
         Class.forName("com.mysql.jdbc.Driver").newInstance();

         Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");
			
          Statement st=con.createStatement();

         String str="update rulesinfo set suggmedicine='"+sm+"', notsuggmedicine='"+nsm+"',recalls='"+recall+"', indays='"+indays+"',refdoctor='"+refdoc+"',servicecost='"+cost+"',suggprocedures='"+sp+"',notsuggprocedures='"+nsp+"',dietary='"+sd+"',notdietary='"+nsd+"' where Diseases='"+de+"'";

         System.out.println(str);
         
         int x=st.executeUpdate(str);

			if(x>0)
			{
				return true;
			}
			else{
				return false;
				}
		}
		catch(Exception e)
                {
                    System.out.println("Update User ="+e);
                }
		return false;
	}



	
	

		

}