/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmeans;


public class ProtocolAnalysis {

    public double medicineAnalysis(String medicine1, String medicine2)
    {
         double score=0.0;
         int count=0;

         String str1[]=medicine1.split(",");


         for(int i=0;i<str1.length;i++)
         {
             String st=str1[i];
             if(medicine2.contains(st))
             {
                 count++;
             }
         }

         score=(double)count/str1.length;
        score=1-score;
         return score;
    }


     public double recallAnalysis(String recall1, String recall2)
    {
       int r1=Integer.parseInt(recall1);
       int r2=Integer.parseInt(recall2);

       double score=(double)r1/r2;

         return score;
    }

      public double recallperiodAnalysis(String recallperiod1, String recallperiod2)
    {
       int r1=Integer.parseInt(recallperiod1);
       int r2=Integer.parseInt(recallperiod2);

       double score=(double)r2/r1;


         return score;
    }

       public int refdoctorAnalysis(String refdoctor1, String refdoctor2)
    {
          int score=0;
         


          if(refdoctor1.equals(refdoctor2))
          {
              score=0;
          }
         if(!refdoctor1.equals(refdoctor2))
          {
           score=1;
          }

      if(refdoctor1.equals("none"))
          {
        score=0;
         }

          return score;
    }


        public double servicecostAnalysis(String scost1, String scost2)
    {
          double score=0.0;

          double sc1=Double.parseDouble(scost1);
          double sc2=Double.parseDouble(scost2);
          
          score=Math.abs(sc1/sc2);
//          score=Math.abs(1-score);

          return score;
    }


         public double sproceedureAnalysis(String sprocedure1, String sprocedure2)
    {
         double score=0.0;
         int count=0;

         String str1[]=sprocedure1.split(",");

          if(sprocedure1.equals("none"))
             {
                 score=0.0;
             }
 else
          {

         for(int i=0;i<str1.length;i++)
         {
             String st=str1[i];
             if(sprocedure2.contains(st))
             {
                 count++;
             }

            
         }

         score=(double)count/str1.length;
        score=1-score;

        }
         return score;
    }

         public double sdietaryAnalysis(String sdietary1, String sdietary2)
    {
         double score=0.0;
         int count=0;
         String str1[]=sdietary1.split(",");

         if(sdietary1.equals("none"))
             {
                 score=0.0;
         }

         else
    {
         for(int i=0;i<str1.length;i++)
         {
             String st=str1[i];
             if(sdietary2.contains(st))
             {
                 count++;
             }

             }

         score=(double)count/str1.length;
        score=1-score;
    }
         return score;
    }



    

}
