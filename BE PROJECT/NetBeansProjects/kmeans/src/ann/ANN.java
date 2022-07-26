/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;
import fuzzy.FuzzyInit;
import java.util.ArrayList;
import java.lang.*;
import java.text.DecimalFormat;


public class ANN {


public void annInitiator(ArrayList cluster1,  ArrayList cluster2)
    {

   
              ArrayList neuron1=new ArrayList();
              ArrayList neuron2=new ArrayList();
              

              AnnFunction af=new AnnFunction();

             double mean1= af.getMean(cluster1);
             System.out.println("Mean1="+mean1);


             double sd1=af.getSD(cluster1, mean1);
             System.out.println("Standard Deviation1="+sd1);


             double mean2=af.getMean(cluster2);
             System.out.println("Mean2="+mean2);


             double sd2=af.getSD(cluster2, mean2);
             System.out.println("Standard Deviation1="+sd2);


             double r1=mean1-sd1;
             r1 =Double.parseDouble(new DecimalFormat("##.##").format(r1));
             double r2=mean1+sd1;
             double r3=mean2-sd2;
             r3 =Double.parseDouble(new DecimalFormat("##.##").format(r3));
             double r4=mean2+sd2;
             

             System.out.println("Neuron 1 Range 1="+r1);
             System.out.println("Neuron 1 Range 2="+r2);
             System.out.println("Neuron 2 Range 1="+r3);
             System.out.println("Neuron 2 Range 2="+r4);

                 ArrayList data1=new ArrayList();
                 ArrayList data2=new ArrayList();
                 ArrayList data3=new ArrayList();

             for(int i=0;i<cluster1.size();i++)
             {
                 
                 ArrayList temp=(ArrayList) cluster1.get(i);
               
                String s=(String) temp.get(10);
                 double sum=Double.parseDouble(s);

                 if (sum >= r1 && sum <= r2)
                 {

                          data1.add(temp);
                 }

              else if (sum < r1)
                 {

                     data2.add(temp);
                 }

                 else if(sum > r2)
                 {
                     data3.add(temp);
                 }

                 

              }
                
                 neuron1.add(data1);

                 if(data2.size()!=0)
                 neuron1.add(data2);
                 if(data3.size()!=0)
                 neuron1.add(data3);

             System.out.println("Neuron 1================================================================");

              for(int i=0;i<neuron1.size();i++)
        {
            ArrayList t=(ArrayList)neuron1.get(i);
            System.out.println(t);
        }



                 ArrayList data4=new ArrayList();
                 ArrayList data5=new ArrayList();
                 ArrayList data6=new ArrayList();


             for(int i=0;i<cluster2.size();i++)
             {

                 ArrayList temp=(ArrayList) cluster2.get(i);

                String s=(String) temp.get(10);
                 double sum=Double.parseDouble(s);

                 if (sum >= r3 && sum <= r4)
                 {

                          data4.add(temp);
                 }

              else if (sum < r3)
                 {

                     data5.add(temp);
                 }

                 else if(sum > r4)
                 {
                     data6.add(temp);
                 }



              }

                 neuron2.add(data4);

                 if(data5.size()!=0)
                 neuron2.add(data5);

                 if(data5.size()!=0)
                 neuron2.add(data6);

             System.out.println("Neuron 2================================================================");

              for(int i=0;i<neuron2.size();i++)
        {
            ArrayList t=(ArrayList)neuron2.get(i);
            System.out.println(t);
        }


             MergeNeuron mn=new MergeNeuron();
             ArrayList mergeneuron=mn.getMergeNeuron(neuron1, neuron2);
             NeuronProcessor np=new NeuronProcessor();
            ArrayList pn1= np.processNeuron(neuron1);


             System.out.println("Processed Neuron 1");
            


             ArrayList neurondata=new ArrayList();

            for(int i=0;i<pn1.size();i++)
            {
                ArrayList temp1=(ArrayList) pn1.get(i);
                neurondata.add(temp1);
                System.out.println(temp1);
            }


            ArrayList pn2= np.processNeuron(neuron2);

            System.out.println("Processed Neuron 2");

            for(int i=0;i<pn2.size();i++)
            {
                ArrayList temp1=(ArrayList) pn2.get(i);
                  neurondata.add(temp1);
                System.out.println(temp1);
            }


            System.out.println("\n\n Nueron Merged Data is \n ");
            
               for(int i=0;i<neurondata.size();i++)
            {
                ArrayList temp1=(ArrayList) neurondata.get(i);

                System.out.println(temp1);
            }




            NeuronLayer nl=new NeuronLayer();

          double mean[]=  nl.getOutputLayer(neurondata);

          ArrayList ns=new ArrayList();


          System.out.println("ANN Score Value");
          for(int i=0;i<mean.length;i++)

             
          {

               double d=mean[i];

               ArrayList t=new ArrayList();
               t.add(Integer.toString(i));
               t.add(Double.toString(d));
               ns.add(t);
//              System.out.println("tt "+t);
          }



          FuzzyInit rf=new FuzzyInit();
          ArrayList index=rf.getClusterIndex(ns);

          FraudDetection fd=new FraudDetection();

          fd.getFraudDEtection(mergeneuron, index);


        }



             
               





}

       

