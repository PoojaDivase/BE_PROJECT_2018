/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class NeuronProcessor {

    public ArrayList processNeuron(ArrayList neuron)
    {
       ArrayList res=new ArrayList();
        System.out.println("=================================================================");
        for(int i=0;i<neuron.size();i++)
        {
            ArrayList t=new ArrayList();
            ArrayList cluster=(ArrayList) neuron.get(i);
//            System.out.println(cluster);

            double s1=0;
            double s2=0;
            double s3=0;
            double s4=0;
            double s5=0;
            double s6=0;
            double s7=0;
            double s8=0;
           
            for(int j=0;j<cluster.size();j++)
            {
                 ArrayList temp=(ArrayList) cluster.get(j);
                 double x=temp.size();

                 String sum1=(String) temp.get(3);
                 double sum2=Double.parseDouble(sum1);
                 s1=s1+sum2;

                 String sum3=(String) temp.get(4);
                 double sum4=Double.parseDouble(sum3);
                 s2=s2+sum4;

                  String sum5=(String) temp.get(5);
                  double sum6=Double.parseDouble(sum5);
                  s3=s3+sum6;
                  

                  String sum7=(String) temp.get(6);
                  double sum8=Double.parseDouble(sum7);
                  s4=s4+sum8;

                  String sum9=(String) temp.get(7);
                  double sum10=Double.parseDouble(sum9);
                  s5=s5+sum10;

                  String sum11=(String) temp.get(8);
                 double sum12=Double.parseDouble(sum11);
                 s6=s6+sum12;
                 
                 String sum13=(String) temp.get(9);
                 double sum14=Double.parseDouble(sum13);
                 s7=s7+sum14;
                 
                 String sum15=(String) temp.get(10);
                 double sum16=Double.parseDouble(sum15);
                 s8=s8+sum16;
                                     
            }

            double mean1=s1/cluster.size();
            String mean11=Double.toString(mean1);

            double mean2=s2/cluster.size();
            mean2 =Double.parseDouble(new DecimalFormat("##.##").format(mean2));
            String mean22=Double.toString(mean2);

            double mean3=s3/cluster.size();
            mean3 =Double.parseDouble(new DecimalFormat("##.##").format(mean3));
            String mean33=Double.toString(mean3);


            double mean4=s4/cluster.size();
            String mean44=Double.toString(mean4);

            double mean5=s5/cluster.size();
            String mean55=Double.toString(mean5);

            double mean6=s6/cluster.size();
            mean6 =Double.parseDouble(new DecimalFormat("##.##").format(mean6));
            String mean66=Double.toString(mean6);

            double mean7=s7/cluster.size();
            String mean77=Double.toString(mean7);

            double mean8=s8/cluster.size();
            mean8 =Double.parseDouble(new DecimalFormat("##.##").format(mean8));
            String mean88=Double.toString(mean8);

//              System.out.println("Sum of 3 Index Value="+s1);
//              System.out.println("Sum of 4 Index Value="+s2);
//            System.out.println("Mean 1="+mean1);
            t.add(mean11);
            t.add(mean22);
            t.add(mean33);
            t.add(mean44);
            t.add(mean55);
            t.add(mean66);
            t.add(mean77);
            t.add(mean88);
//            System.out.println(t);
            res.add(t);
             
        }
          
    
     return res;
    }

}
