/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

//import healthcarefraud.FraudDetectionFrame;
import java.util.ArrayList;


public class FraudDetection {

    public void getFraudDEtection(ArrayList mergeneuron, ArrayList index)
    {

        String result="";

         System.out.println("Fraud Doctors Claims Are:======================================================================");
          for(int i=0;i<index.size();i++)
          {
              String in=(String) index.get(i);
              int x=Integer.parseInt(in);

              for(int j=0;j<mergeneuron.size();j++)
              {
                  if(x==j)
                  {
                     ArrayList ci=(ArrayList)mergeneuron.get(j);
                        
                      for(int k=0;k<ci.size();k++)
                      {
                      ArrayList t=(ArrayList) ci.get(k);

                      result=result+"\n"+t;
                      System.out.println("Fraud Claims "+t);
                      }
                  }
              }
          }

//         FraudDetectionFrame.jTextArea1.setText(result);


    }

}
