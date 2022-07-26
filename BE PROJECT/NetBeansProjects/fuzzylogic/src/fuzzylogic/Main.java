/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fuzzylogic;

import java.util.ArrayList;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    ArrayList t1=new ArrayList();
    ArrayList t2=new ArrayList();
    ArrayList t3=new ArrayList();
    ArrayList t4=new ArrayList();
    ArrayList t5=new ArrayList();
    ArrayList t6=new ArrayList();
   
    ArrayList master=new ArrayList();

    t1.add("0");
    t1.add("0.8");
    t2.add("1");
    t2.add("0.2");
    t3.add("2");
    t3.add("0.7");
    t4.add("3");
    t4.add("0.5");
    t5.add("4");
    t5.add("0.4");
    t6.add("5");
    t6.add("0.3");
  
    master.add(t1);
    master.add(t2);
    master.add(t3);
    master.add(t4);
    master.add(t5);
    master.add(t6);
    

//    for(int i=0;i<master.size();i++)
//    {
//        ArrayList temp=(ArrayList) master.get(i);
//        System.out.println("Master Data"+temp);
//    }

    FuzzyInit rf=new FuzzyInit();
    ArrayList index=rf.getClusterIndex(master);

    }

}
