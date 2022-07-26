/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medicalcouncil;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.*;

public class FetcheDoctor
 {
	public ArrayList getInfo()
	{
//fn, ln, dob, emailid, num, uname, pass
       ArrayList m=new ArrayList();

		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
 			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");
 			Statement stmt = Conn.createStatement();
 			String quer="select * from doctor_info";
 			System.out.println ("==========quer============"+quer);
			ResultSet rs = stmt.executeQuery(quer);
			while(rs.next())
			{
                            String doctor=rs.getString("username");                  
                                   
                               m.add(doctor);
	
			}
		}

				catch(Exception e)
			{
				System.out.println("InfoFetcher in Exception="+e);
			}



			return m;

	}
 }