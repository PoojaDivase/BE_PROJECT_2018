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

public class RulesInformationFetcher
 {
	public ArrayList getInfo(String uname)
	{
//fn, ln, dob, emailid, num, uname, pass
       ArrayList m=new ArrayList();

		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
 			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");
 			Statement stmt = Conn.createStatement();
 			String quer=("select * from admininfo where uname='"+uname+"'");
 			System.out.println ("==========quer============"+quer);
			ResultSet rs = stmt.executeQuery(quer);
			if(rs.next())
			{
                            String fn=rs.getString("fn");
                            String ln=rs.getString("ln");
                            String dob=rs.getString("dob");
                            String id=rs.getString("emailid");
                            String num=rs.getString("num");
                            String un=rs.getString("uname");
                            String pass=rs.getString("pass");
                                   
                        m.add(fn);
			m.add(ln);
                        m.add(dob);
                        m.add(id);
                        m.add(num); 
                        m.add(un);
                        m.add(pass); 
                        System.out.println(m);
			}
		}

				catch(Exception e)
			{
				System.out.println("InfoFetcher in Exception="+e);
			}



			return m;

	}
 }