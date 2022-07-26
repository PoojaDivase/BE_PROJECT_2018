/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fuzzy;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class FuzzyClustering {

    public ArrayList makeCluster(ArrayList master, ArrayList range)
    {

        
           ArrayList cluster=new ArrayList();
           



           for(int i=0;i<range.size();i++)
           {
               ArrayList temp= (ArrayList) range.get(i);

                String in=(String) temp.get(0);
                String s=(String) temp.get(1);
                double min=Double.parseDouble(s);
               // System.out.println(x);

                String s1=(String) temp.get(2);
                double max=Double.parseDouble(s1);
               // System.out.println(y);

                ArrayList t1=new ArrayList();
              t1.add(in);
                
                for(int j=0;j<master.size();j++)
                {
                                        
                    ArrayList temp1=(ArrayList) master.get(j);
                    String ind=(String) temp1.get(0);
                    String value1=(String) temp1.get(1);
                    double value=Double.parseDouble(value1);

                    
                    if(value>=min&&value<=max)
                    {
                      
                       t1.add(ind);
                                    
                    }
                  
                }

                cluster.add(t1);
                              
           }
           

           System.out.println("Fuzzy Classifying Index Are======================== ");
           for(int k=0;k<cluster.size();k++)
           {
               ArrayList temp=(ArrayList) cluster.get(k);
               System.out.println(temp);
           }

            

        return cluster;


       
    }

    


}
