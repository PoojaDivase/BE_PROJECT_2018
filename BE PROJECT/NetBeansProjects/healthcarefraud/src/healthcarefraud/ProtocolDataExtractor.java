package healthcarefraud;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import java.util.ArrayList;


public class ProtocolDataExtractor {

       
       public ArrayList getProtocolInfoData(String dise)
    {

       ArrayList disease=new ArrayList();

        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcarefraud","root","root");
            Statement st=conn.createStatement();
            



            String query="Select *from protocolinfo where diseases='"+dise+"'";

            ResultSet rs=st.executeQuery(query);
            

            
             if(rs.next())
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
             


              disease.add(dis);
              disease.add(sm);
              disease.add(nsm);
              disease.add(recall);
              disease.add(periodday);
              disease.add(doc);
              disease.add(sc);
              disease.add(sp);
              disease.add(nsp);
              disease.add(sd);
              disease.add(nsd);
              


            }


        }

        catch(Exception e)
        {
            System.out.println("Exeption in ProtocolDataExtractor Class is: "+e);

        }

       return disease;
    }

      
}


     
      