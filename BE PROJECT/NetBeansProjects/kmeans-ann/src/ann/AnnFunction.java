/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.math.*;


public class AnnFunction {


    public double getMean(ArrayList cluster)
    {
        double mean=0.0;
        double sum=0.0;

        for(int i=0;i<cluster.size();i++)
        {
            ArrayList temp=(ArrayList) cluster.get(i);
           
                    String s=(String) temp.get(10);
                    double s1=Double.parseDouble(s);
                    sum=sum+s1;
//                    System.out.println(s);
                 
                }
            
mean=sum/cluster.size();
mean =Double.parseDouble(new DecimalFormat("##.##").format(mean));
        
        return mean;
    }


     public double getSD(ArrayList cluster, double mean)
    {
        double sd=0.0;
        double sum=0.0;

        for(int i=0;i<cluster.size();i++)
        {
            ArrayList temp=(ArrayList) cluster.get(i);
            String s=(String) temp.get(10);
            Double s1=Double.parseDouble(s);
            sum=sum+Math.pow((s1-mean), 2);
        }

//        System.out.println(sum);


        double vari=sum/cluster.size();
        sd=Math.sqrt(vari);

        sd =Double.parseDouble(new DecimalFormat("##.##").format(sd));
        return sd;
    }

}
