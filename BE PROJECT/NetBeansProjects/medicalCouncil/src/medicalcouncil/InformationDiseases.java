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

public class InformationDiseases
 {
	public ArrayList getInfo(String de)
	{
//fn, ln, dob, emailid, num, uname, pass
       ArrayList m=new ArrayList();

		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
 			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");
 			Statement stmt = Conn.createStatement();
 			String quer="select * from rulesinfo where Diseases='"+de+"'";
 			System.out.println ("==========quer============"+quer);
			ResultSet rs = stmt.executeQuery(quer);
			while(rs.next())
			{
                            String des=rs.getString("Diseases");
                            String sm=rs.getString("suggmedicine");
                            String nsm=rs.getString("notsuggmedicine");
                            String re=rs.getString("recalls");
                            String ind=rs.getString("indays");
                            String ref=rs.getString("refdoctor");
                            String cost=rs.getString("servicecost");
                              String sp=rs.getString("suggprocedures");
                            String nsp=rs.getString("notsuggprocedures");
                            String d=rs.getString("dietary");
                            String nd=rs.getString("notdietary");
                                   
                        m.add(des);
			m.add(sm);
                        m.add(nsm);
                        m.add(re);
                        m.add(ind); 
                        m.add(ref);
                        m.add(cost); 
                        m.add(sp);
                        m.add(nsp); 
                        m.add(d);
                        m.add(nd); 
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