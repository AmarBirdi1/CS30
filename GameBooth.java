



// for BreakAPlate application

import java.util.Random;

public class GameBooth {
 private double cost;
 private String firstPrize, consolationPrize;
 private int firstPrizesAwarded, conPrizesAwarded;
 
 

 public GameBooth(double charge, String p1, String p2) {
 cost = charge;
 firstPrize = p1;
 consolationPrize = p2;
 firstPrizesAwarded = 0;
 conPrizesAwarded = 0;
 }
 


 public String start() {
 int toss;
 int successes = 0;
 Random rand = new Random();
   
  
   for (int i = 0; i < 3; i++) { 
   toss = rand.nextInt(2);
   if (toss == 1) {
   successes += 1; 
   }
   }
   
   /* award prize */
   if (successes == 3) {
   firstPrizesAwarded += 1;
   return(firstPrize);
   } else {
   conPrizesAwarded += 1;
   return(consolationPrize);
   }
 }



 public double getCost() {
   return(cost);
 }


 public void prizesAwarded() {
   System.out.println("There have been " + firstPrizesAwarded + " first prizes awarded.");
   System.out.println(conPrizesAwarded + " consolation prizes have been awarded.");
 }
}


