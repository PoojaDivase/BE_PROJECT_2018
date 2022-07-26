/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fuzzylogic;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class FuzzyInit {

    public ArrayList getClusterIndex(ArrayList master)
    {
         ArrayList range=new ArrayList();

        double big=0.0;
        double small=0.0;

        for(int i=0;i<master.size();i++)
        {
            ArrayList temp=(ArrayList) master.get(i);
            System.out.println(temp);

            for(int j=0;j<temp.size();j++)
            {
                String score1=(String) temp.get(1);
                double score=Double.parseDouble(score1);
                if(score>big)
                {
                    big=score;
                }

           if(score<small)
                {
                      small=score;
                }
            }
        }

        System.out.println("Big Score Value="+big);
        System.out.println("Small Score Value="+small);

        double dis=big-small;
        double div=dis/5;

        System.out.println("Distance="+dis);
        System.out.println("Division="+div);


        ArrayList vl=new ArrayList();
        ArrayList l=new ArrayList();
        ArrayList m=new ArrayList();
        ArrayList h=new ArrayList();
        ArrayList vh=new ArrayList();

//        double hdiv=5*div;
//        hdiv =Double.parseDouble(new DecimalFormat("##.##").format(hdiv));

double r1=small;
double r2=0;

ArrayList fuzzycrisp=new ArrayList();

fuzzycrisp.add("VERY LOW");
fuzzycrisp.add("LOW");
fuzzycrisp.add("MEDIUM");
fuzzycrisp.add("HIGH");
fuzzycrisp.add("VERY HIGH");




        for( int i=0;i<5;i++)
        {
           if(i==0)
           {
               r1 = small;
               r2 = r1 + div;
               ArrayList temp = new ArrayList();
               r1 = Double.parseDouble(new DecimalFormat("##.##").format(r1));
               r2 = Double.parseDouble(new DecimalFormat("##.##").format(r2));

               temp.add((String) fuzzycrisp.get(i));
               temp.add(Double.toString(r1));
               temp.add((Double.toString(r2)));
               range.add(temp);
           }
 else
           {
           r1=r2+0.01;
             r2=r2+div;
          ArrayList temp = new ArrayList();
               r1 = Double.parseDouble(new DecimalFormat("##.##").format(r1));
               r2 = Double.parseDouble(new DecimalFormat("##.##").format(r2));

               temp.add((String) fuzzycrisp.get(i));
               temp.add(Double.toString(r1));
               temp.add((Double.toString(r2)));
               range.add(temp);



          }
            
          
        }

        
      

        for(int i=0;i<range.size();i++)
        {
            ArrayList temp=(ArrayList) range.get(i);
            System.out.println(temp);
        }


        FuzzyClustering fz=new FuzzyClustering();

        ArrayList cluster =fz.makeCluster(master, range);

        Index i=new Index();

        ArrayList fuzzyindex=i.getFuzzyIndex(cluster);

       System.out.println("Fraud Index Are:"+fuzzyindex);

       return fuzzyindex;
    }

}
