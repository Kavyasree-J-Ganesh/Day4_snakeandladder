package com.bridgelabz;

public class SnakeAndLadder {
    static final int SNAKE=0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    public static void main(String[] args) {
       int position1 = 0;      //player 1 position1
       int playCount = 0;
       int position2 = 0;     //player 2 position

       while(position1 < 100 && position2 < 100){
           int random = 0;              // Rolled die value (1 to 6)
           int randomCondition = 0;     // Snake or ladder or no-play (1 to 3)
           boolean start1 = true; // For the first roll after the second player chance
           // System.out.println("Player-1 Chance");
           // System.out.println("Player-1 position1: " + position1);
           // System.out.println("Player-2 Position: " + position2);
           while((start1 || LADDER == randomCondition) && position1 < 100){        // Player 1
               start1 = false;         // another chance will come if the player gets ladder
               random = (int) Math.floor(Math.random()*10) % 6 + 1;
               randomCondition = (int) Math.floor(Math.random()*10) %3;

               
               if(randomCondition == SNAKE && position1 - random >=0){
                   // System.out.println("Player-1 got " + random + " and snake." + "Moving back by " + random + " steps");
                   position1 = position1 - random;
               } else if(randomCondition == LADDER && position1+random <=100){
                  // System.out.println("Player-1 got " + random + " and ladder." + "Moving forward by " + random + " steps and 1 more chance");
                   position1 = position1 + random;
               } else {
                   //System.out.println("Player-1 got No-play option.No movement");
               }
           }
           start1 = true;     // first play of player 2 after player 1 chance
           //System.out.println("Player-2 Chance");

           while((start1 || LADDER == randomCondition) && position2 <100){    // player 2
               start1 = false;
               random = (int) Math.floor(Math.random()*10) % 6 + 1;
               randomCondition = (int) Math.floor(Math.random()*10) %3;

               if(randomCondition == SNAKE && position2 - random >=0){
                   // System.out.println("Player-2 got " + random + " and snake." + "Moving back by " + random + " steps");
                   position2 = position2 - random;
               } else if(randomCondition == LADDER && position2+random <=100){
                   position2 = position2 + random;
                   // System.out.println("Player-2 got " + random + " and ladder." + "Moving forward by " + random + " steps and 1 more chance");
               } else {
                   //System.out.println("Player-1 got No-play option.No movement");
               }
           }

       }
       System.out.println("Player-1 position: " + position1);
       System.out.println("Player-2 Position: " + position2);
       if(position1 == 100){
           System.out.println("Player 1 won");
       }else{
           System.out.println("Player 2 won");
       }
    }
}
