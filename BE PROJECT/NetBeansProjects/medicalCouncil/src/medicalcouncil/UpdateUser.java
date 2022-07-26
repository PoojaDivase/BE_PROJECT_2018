/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalcouncil;

import java.sql.*;

 public class UpdateUser
 	{
	public boolean updateInfo(String fn,String ln,String emailid,String num,String pass,String uname)
	{
  //fn, ln, dob, emailid, num, uname, pass          
	 try
       {
         Class.forName("com.mysql.jdbc.Driver").newInstance();

         Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");
			
          Statement st=con.createStatement();

         String str="update admininfo set fn='"+fn+"', ln='"+ln+"',emailid='"+emailid+"', num='"+num+"',pass='"+pass+"' where uname='"+uname+"'";

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