/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fuzzy;

import java.util.ArrayList;


public class Index {


    public ArrayList getFuzzyIndex(ArrayList cluster)
    {
        ArrayList index=new ArrayList();


        for (int i=0;i<cluster.size();i++)
        {
            ArrayList temp=(ArrayList) cluster.get(i);
            String st=(String) temp.get(0);
//            System.out.println("st "+st);


            if(st.equals("HIGH"))
            {

               for(int j=1;j<temp.size();j++)
               {
                   String value=(String) temp.get(j);
                   index.add(value);

               }

            }

               if(st.equals("VERY HIGH"))
            {

               for(int j=1;j<temp.size();j++)
               {
                   String value=(String) temp.get(j);
                   index.add(value);

               }

            }


        }

        return index;

    }

}
