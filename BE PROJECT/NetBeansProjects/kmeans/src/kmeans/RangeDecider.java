/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmeans;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class RangeDecider
{

    public ArrayList<Double> clusterRange(ArrayList sort)
    {
        ArrayList <Double> range=new ArrayList<Double> ();
        ArrayList range1=new ArrayList();
        ArrayList range2=new ArrayList();

//        ArrayList tmin=(ArrayList)sort.get(0);
         ArrayList tmax=(ArrayList)sort.get(sort.size()-1);

//        String s1=(String)tmin.get(10);
        double min=0.0;

        String s2=(String)tmax.get(10);
        double max=Double.parseDouble(s2);
        System.out.println("Min "+min);
        System.out.println("Max "+max);

           double dis=(max-min)/2;
           dis =Double.parseDouble(new DecimalFormat("##.##").format(dis));
           System.out.println("Distance="+dis);


           double r1=min;
           double r2=min+dis;

           double r3=r2;
           r3=r3+0.01;
           r3 =Double.parseDouble(new DecimalFormat("##.##").format(r3));


           double r4=max;
           range.add(r1);
           range.add(r2);
           range.add(r3);
           range.add(r4);


        return range;
    }

}
