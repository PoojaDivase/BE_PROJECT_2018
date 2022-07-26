/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmeans;

import ann.ANN;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class ProcessInitiator {

//    public static ArrayList cluster1=new ArrayList();
//    public static ArrayList cluster2=new ArrayList();

    public void initiateProcess(String path)
    {

        
            DistanceEvaluator d=new DistanceEvaluator();

           ExcelSheetReader er=new ExcelSheetReader();


           ArrayList claims=er.readExcelSheet(path);

           System.out.println("CLAIMS ARE\n");
           for(int i=0;i<claims.size();i++)
           {
               ArrayList t=(ArrayList) claims.get(i);
               System.out.println(t);
           }

             ProtocolDataExtractor pi=new ProtocolDataExtractor();

     ArrayList proto= pi.getProtocolInfoData();

        System.out.println(" \n PROTOCOL INFO \n");

//        System.out.println(t);

        for(int i=0;i<proto.size();i++)
        {
            ArrayList p= (ArrayList) proto.get(i);

                System.out.println(p);

        }


          ArrayList dist=new DistanceEvaluator().evaluateDistance(claims, proto);

          Sorter s=new Sorter();
          
           ArrayList sort= s.sortData(dist);


           System.out.println("Distance Sorted List is ====================================================================");
           for(int i=0;i<sort.size();i++)
           {
               ArrayList temp=(ArrayList) sort.get(i);
               System.out.println(temp);
           }


        ArrayList<Double> range=   new RangeDecider().clusterRange(sort);

        System.out.println("Range is "+range);

        ArrayList cluster1=new ArrayList();
        ArrayList cluster2=new ArrayList();

        for(int i=0;i<sort.size();i++)
        {
            ArrayList temp=(ArrayList) sort.get(i);

//            System.out.println(temp);

            String x1=(String) temp.get(10);
            Double x=Double.parseDouble(x1);
            Double r1=range.get(0);
            Double r2=range.get(1);
            Double r3=range.get(2);
            Double r4=range.get(3);          
             if(x>=r1&&x<=r2)
             {
                cluster1.add(temp);
             }


            else if(x>=r3&&x<=r4)
             {
                cluster2.add(temp);
             }

            
            
        }


        System.out.println("Cluster 1 is=======================================================================");
        for(int i=0;i<cluster1.size();i++)
        {
            ArrayList temp=(ArrayList) cluster1.get(i);
            System.out.println(temp);
        }

        

        System.out.println("Cluster 2 is ========================================================================");
        for(int i=0;i<cluster2.size();i++)
        {
            ArrayList temp=(ArrayList) cluster2.get(i);
            System.out.println(temp);
        }

            ANN an=new ANN();

            an.annInitiator(cluster1, cluster2);
       
    }

}
