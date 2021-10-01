package com.company;
import java.util.Random;
import java.util.Date;

public class snakeSinglePlayer {
    public static void main(String[] args) {
        int player1Position=0;
        int diceRolled=0;
        Random rd = new Random();

        while(player1Position < 100){
            int dice = rd.nextInt(7);
            System.out.println("\nRolled dice outcome: "+dice);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            int autoChoice = rd.nextInt(3);
            diceRolled++;

            if (autoChoice==0){ 			//NO PLAY
                System.out.println("\nTURN "+diceRolled); //Number of times dice rolled
                System.out.println("NO PLAY, same position\nPosition: "+player1Position);
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
			
            else if (autoChoice==1) { 		//LADDER
                System.out.println("\nTURN "+diceRolled); //Number of times dice rolled
                System.out.println("LADDER...climbing");
				
                int dummy = player1Position; player1Position += dice; //Increment as per dice outcome

                if (player1Position>100){ player1Position=dummy; }//Limit setter for above 100

                for (int i = dummy; i <= player1Position; i++) { //loop to see Increment visually
                    System.out.print(i + " > ");
                    try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.println("\nNew position: " + player1Position);
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("\nNext Turn");
            }
			
            else if (autoChoice==2){		//SNAKE
                System.out.println("\nTURN "+diceRolled); //Number of times dice rolled
                System.out.println("SNAKE...eating");
				
                int dummy1 = player1Position; player1Position-=dice; //Decrement as per dice outcome

                if (player1Position<0){ player1Position=0; } //Limit setter for below 0

                for (int j=dummy1;j>=player1Position;j--){ //loop to see Decrement visually
                    System.out.print(j+" > ");
                    try { Thread.sleep(1200); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.println("\nNew position: "+player1Position);
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("\nNext Turn");
            }

        }
        System.out.println("WINNER");

    }
}
