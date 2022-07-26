/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmeans;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class DistanceEvaluator
{

    public ArrayList evaluateDistance(ArrayList claims,ArrayList proto)
    {
ArrayList dist=new ArrayList();

String nmscore="";
String nrecall="";
String nrperiod="";
String nrefdoctor="";
String nscost="";
String nsprocedure="";
String nsdietary="";

     
    for(int i=0;i<claims.size();i++)
    {
        ArrayList temp1=(ArrayList) claims.get(i);

        String disease1=(String) temp1.get(3);
        ArrayList ntemp=new ArrayList();
        double sum=0.0;

         for(int j=0;j<proto.size();j++)
        {
            ArrayList temp2=(ArrayList) proto.get(j);
            String disease2=(String) temp2.get(0);
            
            if(disease1.equals(disease2))
            {
                String medicine1=(String) temp1.get(4);
                String medicine2=(String) temp2.get(1);

                ProtocolAnalysis pa=new ProtocolAnalysis();
                double mscore=pa.medicineAnalysis(medicine1, medicine2);
                sum=sum+mscore;
               
//                System.out.println(sum);
                nmscore=Double.toString(mscore);

                

//                System.out.print(mscore+"  ");


                
                String recall1=(String)temp1.get(5);
                String recall2=(String)temp2.get(3);

               double recall=pa.recallAnalysis(recall1, recall2);
               sum=sum+recall;
               recall =Double.parseDouble(new DecimalFormat("##.##").format(recall));
               nrecall=Double.toString(recall);
               

               
//               System.out.print(recall+" ");


               String recallperiod1=(String)temp1.get(6);
                String recallperiod2=(String)temp2.get(4);

               double recallperiod=pa.recallperiodAnalysis(recallperiod1, recallperiod2);
               sum=sum+recallperiod;
               recallperiod =Double.parseDouble(new DecimalFormat("##.##").format(recallperiod));
               nrperiod=Double.toString(recallperiod);
               
//
//               System.out.print(recallperiod+" ");

               String refdoctor1=(String)temp1.get(7);
                String refdoctor2=(String)temp2.get(5);
                
              int refdoctor=pa.refdoctorAnalysis(refdoctor1, refdoctor2);
              sum=sum+(double)refdoctor;
              nrefdoctor=Integer.toString(refdoctor);
              
              
//              System.out.print(refdoctor+" ");


              String scost1=(String)temp1.get(8);
                String scost2=(String)temp2.get(6);

                double scost=pa.servicecostAnalysis(scost1, scost2);
                sum=sum+scost;
               scost =Double.parseDouble(new DecimalFormat("##.##").format(scost));
               nscost=Double.toString(scost);
               
               
//                System.out.print(scost+" ");

                 String sprocedure1=(String)temp1.get(9);
                String sprocedure2=(String)temp2.get(7);

                double sprocedure=pa.sproceedureAnalysis(sprocedure1, sprocedure2);
                 sum=sum+sprocedure;
                nsprocedure=Double.toString(sprocedure);
               
               
//                System.out.print(sprocedure+" ");


                String sdietary1=(String)temp1.get(10);
                String sdietary2=(String)temp2.get(9);

                double sdietary=pa.sdietaryAnalysis(sdietary1, sdietary2);
                sum=sum+sdietary;
                nsdietary=Double.toString(sdietary);
                
                
//                System.out.print(sdietary+" ");

            }
        }

        System.out.println();

        sum =Double.parseDouble(new DecimalFormat("##.##").format(sum));

        String ss=Double.toString(sum);
        String claimid=(String) temp1.get(0);
        String dname=(String) temp1.get(1);
        String pname=(String) temp1.get(2);
        ntemp.add(claimid);
        ntemp.add(dname);
        ntemp.add(pname);
        ntemp.add(nmscore);
        ntemp.add(nrecall);
        ntemp.add(nrperiod);
        ntemp.add(nrefdoctor);
        ntemp.add(nscost);
        ntemp.add(nsprocedure);
        ntemp.add(nsdietary);
        ntemp.add(ss);
        dist.add(ntemp);

        System.out.println(ntemp);

    }


return dist;
    }
}
