package com.company;
import java.util.Random;
import java.util.Date;

public class snakeNladder {
    public static void main(String[] args) {
        int player1_Position=0; int player2_Position=0;
        int diceRolled=0, diceRolled2=0;
        int whoPlay = 1;
        Random rd = new Random();

        while(player1_Position < 100 || player2_Position < 100){
            if (whoPlay==1) {
                System.out.print("\nPLAYER 1 Turn...   ");
                try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                int dice = rd.nextInt(7);
                System.out.println("Rolled dice outcome: " + dice);
                try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                int autoChoice = rd.nextInt(3);
                diceRolled++;

                if (autoChoice == 0) {            //NO PLAY
                    //System.out.println("Player 1 Turn no. " + diceRolled);
                    System.out.println("\nNO PLAY, same position\nPosition: " + player1_Position);
                    try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                else if (autoChoice == 1) {        //LADDER
                    //System.out.println("Player 1 Turn no. "+ diceRolled);
                    System.out.print("\nLADDER...climbing  ");

                    int dummy = player1_Position;
                    player1_Position += dice; //Increment as per dice outcome

                    if (player1_Position > 100) {
                        player1_Position = dummy;
                    }//Limit setter for above 100

                    for (int i = dummy; i <= player1_Position; i++) { //loop to see Increment visually
                        System.out.print(i + " > ");
                        try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
                    }
                    System.out.print("\nLADDER Bonus turn  ");
                    //BONUS
                    int dice2 = rd.nextInt(7);
                    int dummy2 = player1_Position;
                    player1_Position += dice2; //Increment as per dice outcome

                    if (player1_Position > 100) {
                        player1_Position = dummy2;
                    }//Limit setter for above 100

                    for (int i = dummy2; i <= player1_Position; i++) { //loop to see Increment visually
                        System.out.print(i + " > ");
                        try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
                    }

                    System.out.println("\nNew position: " + player1_Position);
                    try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                else if (autoChoice == 2) {        //SNAKE
                    //System.out.println("Player 1 Turn no. " + diceRolled);
                    System.out.print("\nSNAKE...eating  ");

                    int dummy1 = player1_Position;
                    player1_Position -= dice; //Decrement as per dice outcome

                    if (player1_Position < 0) {
                        player1_Position = 0;
                    } //Limit setter for below 0

                    for (int j = dummy1; j >= player1_Position; j--) { //loop to see Decrement visually
                        System.out.print(j + " > ");
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("\nNew position: " + player1_Position);
                    try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
            whoPlay++;
            System.out.println("\n************");

            if (whoPlay==2) {
                System.out.print("\nPLAYER 2 Turn...    ");
                try { Thread.sleep(700); }
                catch (InterruptedException e) { e.printStackTrace(); }

                int dice = rd.nextInt(7);
                System.out.println("Rolled dice outcome: " + dice+"");
                try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                int autoChoice = rd.nextInt(3);
                diceRolled2++;

                if (autoChoice == 0) {            //NO PLAY
                    //System.out.println("Player 2 Turn no. " + diceRolled2);
                    System.out.println("\nNO PLAY, same position\nPosition: " + player2_Position);
                    try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                else if (autoChoice == 1) {        //LADDER
                    //System.out.println("Player 2 Turn no. " + diceRolled2);
                    System.out.print("\nLADDER...climbing  ");

                    int dummy = player2_Position;
                    player2_Position += dice; //Increment as per dice outcome

                    if (player2_Position > 100) {
                        player2_Position = dummy;
                    }//Limit setter for above 100

                    for (int i = dummy; i <= player2_Position; i++) { //loop to see Increment visually
                        System.out.print(i + " > ");
                        try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
                    }
                    System.out.print("\nLADDER Bonus turn  ");
                    //BONUS
                    int dice2 = rd.nextInt(7);
                    int dummy2 = player2_Position;
                    player2_Position += dice2; //Increment as per dice outcome

                    if (player2_Position > 100) {
                        player2_Position = dummy2;
                    }//Limit setter for above 100

                    for (int i = dummy2; i <= player2_Position; i++) { //loop to see Increment visually
                        System.out.print(i + " > ");
                        try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
                    }

                    System.out.println("\nNew position: " + player2_Position);
                    try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                else if (autoChoice == 2) {        //SNAKE
                    //System.out.println("Player 2 Turn no. " + diceRolled2);
                    System.out.print("\nSNAKE...eating  ");

                    int dummy1 = player2_Position;
                    player2_Position -= dice; //Decrement as per dice outcome

                    if (player2_Position < 0) {
                        player2_Position = 0;
                    } //Limit setter for below 0

                    for (int j = dummy1; j >= player2_Position; j--) { //loop to see Decrement visually
                        System.out.print(j + " > ");
                        try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
                    }

                    System.out.println("\nNew position: " + player2_Position);
                    try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
            whoPlay--;
            System.out.println("\n************");

        }
        if (player1_Position==10){ System.out.println("Player 1 is Winner");
            System.out.println("No. of times dice rolled to win are "+diceRolled); }
        else { System.out.println("Player 2 is Winner");
            System.out.println("No. of times dice rolled to win are "+diceRolled2); }

    }
}
