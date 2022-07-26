/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class NeuronLayer {

    public double [] getOutputLayer(ArrayList neurondata)
    {
        double lmat[][]=new double[neurondata.size()][neurondata.size()];
        int sub=0;

        //double mean[]=new double[lmat.length];


        for(int i=0;i<neurondata.size();i++)
             {
             ArrayList t1=(ArrayList) neurondata.get(i);

              for(int j=0;j<neurondata.size();j++)
              {
                   ArrayList t2=(ArrayList) neurondata.get(j);

                   if(i==j)
                   {
                       lmat[i][j]=0;

                   }
            else
                   {
                       NeuronDistance nd=new NeuronDistance();
                       double md=nd.getDistance(t1,t2);
                         lmat[i][j]=md;

                  }

              }

               }
       

         
         System.out.println("Neurondata Matrix of Given Neurondata");
    	    for(int i=0;i<lmat.length;i++)
    	    {
    	    	for(int j=0;j<lmat[0].length;j++)
    	    	{

    	    		System.out.print(" "+lmat[i][j]+" ");
    	    	}

    	    	System.out.println();
    	    }


  double []mean1=new double[lmat.length];
        double meanv=0.0;
        
          for(int i=0;i<lmat.length;i++)
    	    {
           double big=0;
    	    	for(int j=0;j<lmat[0].length;j++)
    	    	{
    	    		if(big<lmat[i][j])
                            big=lmat[i][j];
    	    	}
         
           mean1[i]=big;
    	    
    	    }
       
       return mean1;
    }
}


   


    




