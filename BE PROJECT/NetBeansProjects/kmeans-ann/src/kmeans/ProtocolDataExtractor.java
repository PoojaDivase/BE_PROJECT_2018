package kmeans;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class ProtocolDataExtractor {

       
       public ArrayList getProtocolInfoData()
    {

      
       ArrayList data= new ArrayList();

        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();
            



            String query="Select *from protocolinfo";
           

            ResultSet rs=st.executeQuery(query);
            

            
             while(rs.next())
            {
 ArrayList row=new ArrayList();

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


             dis=dis.toLowerCase();
             sm=sm.toLowerCase();
             nsm=nsm.toLowerCase();
             recall=recall.toLowerCase();
             periodday=periodday.toLowerCase();
             doc=doc.toLowerCase();
             sc=sc.toLowerCase();
             sp=sp.toLowerCase();
             nsp=nsp.toLowerCase();
             sd=sd.toLowerCase();
             nsd=nsd.toLowerCase();



              row.add(dis);
              row.add(sm);
              row.add(nsm);
              row.add(recall);
              row.add(periodday);
              row.add(doc);
              row.add(sc);
              row.add(sp);
              row.add(nsp);
              row.add(sd);
              row.add(nsd);




             data.add(row);

            }


        }

        catch(Exception e)
        {
            System.out.println("Exeption in ProtocolDataExtractor Class is: "+e);

        }

       return data;
    }

      
}


     
      