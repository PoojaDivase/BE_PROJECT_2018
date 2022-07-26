/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.util.ArrayList;


public class MergeNeuron {


    public ArrayList getMergeNeuron(ArrayList neuron1, ArrayList neuron2)
    {

        ArrayList mergeneuron= new ArrayList();



        for(int i=0;i<neuron1.size();i++)
            {
                ArrayList temp1=(ArrayList) neuron1.get(i);
                mergeneuron.add(temp1);

            }



            for(int i=0;i<neuron2.size();i++)
            {
                ArrayList temp1=(ArrayList) neuron2.get(i);
                  mergeneuron.add(temp1);

            }
        System.out.println("Merge Neuron Are=========================================");
        for(int i=0;i<mergeneuron.size();i++)
        {
            ArrayList temp=(ArrayList) mergeneuron.get(i);
            System.out.println(temp);
        }

        return mergeneuron;
    }

}
