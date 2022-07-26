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

public class FetcheDiseases
 {
	public ArrayList getInfo()
	{

       ArrayList m=new ArrayList();

		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
 			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");
 			Statement stmt = Conn.createStatement();
 			String quer="select * from rulesinfo";
 			System.out.println ("==========quer============"+quer);
			ResultSet rs = stmt.executeQuery(quer);
			while(rs.next())
			{
                            String diseases=rs.getString("Diseases");                  
                                   
                               m.add(diseases);	
			}
		}

				catch(Exception e)
			{
				System.out.println("InfoFetcher in Exception="+e);
			}

                return m;

	}
 }