/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmeans;

import java.util.ArrayList;


public class Sorter {


    public ArrayList sortData(ArrayList ali)
    {

for(int i=0;i<(ali.size()-1);i++)// bubble sort
{
    for( int j=i+1;j<ali.size();j++)
    {

        ArrayList m=new ArrayList();
         ArrayList h=new ArrayList();

         m=(ArrayList)ali.get(i);

         String a1=(String) m.get(10);
         double a=Double.parseDouble(a1);


          h=(ArrayList)ali.get(j);
          String b1=(String) h.get(10);
          double b=Double.parseDouble(b1);

         if(a>=b)
         {
            ali.set(i,h);
            ali.set(j, m);
         }

    }

}

return ali;
    }

}
