package healthcarefraud;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import java.util.ArrayList;


public class ProtocolDataFetcher {

       
       public ArrayList getProtocolInfoData()
    {

       ArrayList db=new ArrayList();
       

        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();
            



            String query="Select *from protocolinfo";

            ResultSet rs=st.executeQuery(query);
            

            
             while(rs.next())
            {

                

             String dis=rs.getString(1);
             String sm=rs.getString(2);
             String nsm=rs.getString(3);
             String recall=rs.getString(4);
             String periodday=rs.getString(5);
             String doc=rs.getString(6);
             String sc=rs.getString(7);
             String sp=rs.getString(8);
             String nsp=rs.getString(9);
             String sd=rs.getString(10);
             String nsd=rs.getString(11);
             
 ArrayList data=new ArrayList();

              data.add(dis);
              data.add(sm);
              data.add(nsm);
              data.add(recall);
              data.add(periodday);
              data.add(doc);
              data.add(sc);
              data.add(sp);
              data.add(nsp);
              data.add(sd);
              data.add(nsd);
              db.add(data);
              
            
            }

            

        }

        catch(Exception e)
        {
            System.out.println("Exeption in ProtocolDataFetcher Class is: "+e);

        }

       return db;
    }

      
}


     
      