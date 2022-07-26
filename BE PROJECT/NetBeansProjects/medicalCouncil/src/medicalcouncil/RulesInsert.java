/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalcouncil;
import java.sql.*;
/**
 *
 * @author yogesh
 */
public class RulesInsert
{                                  //de,sm,nsm,recall,indays,refdoc,cost,sp,nsp,sd,nsd
       public boolean insertField(String de,String sm,String nsm,String recall,String indays,String refdoc,String cost,String sp,String nsp,String sd,String nsd)
      {
       try
       {
         Class.forName("com.mysql.jdbc.Driver").newInstance();

         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_fraud","root","root");

         Statement st=con.createStatement();

         String str="insert into rulesinfo values ('"+de+"','"+sm+"','"+nsm+"','"+recall+"','"+indays+"','"+refdoc+"','"+cost+"','"+sp+"','"+nsp+"','"+sd+"','"+nsd+"')";

                 int x=st.executeUpdate(str);

                 System.out.println(x);

                if(x>0)
                {
                  return true;
                }
                else
                {
                  return false;
                }

       }
       catch(Exception e)
       {
           System.out.println("Insert Data"+e);

           return false;
       }

     }

}

