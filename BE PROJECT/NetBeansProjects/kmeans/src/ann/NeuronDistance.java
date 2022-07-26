/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class NeuronDistance {

     public double getDistance(ArrayList t1,ArrayList t2)
    {
                   double s=0;
                    double fact=0;


               
                 String s1=(String) t1.get(7);
                 String s2=(String) t2.get(7);

                 double x=Double.parseDouble(s1);
                 double y=Double.parseDouble(s2);

                

                if(x>y)
                    fact=x;
                else
                    fact=0;


             
                  fact =Double.parseDouble(new DecimalFormat("##.##").format(fact));

                   return fact;


   }




}
