package com.bridgelabz;

public class SnakeAndLadder {
    static final int SNAKE=0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    public static void main(String[] args) {
       int position = 0;
       int playCount = 0;
       int position1 = 0;

       while(position < 100 && position1 < 100){
           int random = 0;
           int randomCondition = 0;
           boolean start1 = true;
           while((start1 || LADDER == randomCondition) && position < 100){
               start1 = false;
               random = (int) Math.floor(Math.random()*10) % 7;
               randomCondition = (int) Math.floor(Math.random()*10) %3;

               if(randomCondition == SNAKE && position - random >=0){
                   position = position - random;
               } else if(randomCondition == LADDER && position+random <=100){
                   position = position + random;
               }
           }
           start1 = true;
           while((start1 || LADDER == randomCondition) && position1 <100){
               start1 = false;
               random = (int) Math.floor(Math.random()*10) % 7;
               randomCondition = (int) Math.floor(Math.random()*10) %3;

               if(randomCondition == SNAKE && position1 - random >=0){
                   position1 = position1 - random;
               } else if(randomCondition == LADDER && position1+random <=100){
                   position1 = position1 + random;
               }
           }

       }



       if(position == 100){
           System.out.println("Player 1 won");
       }else{
           System.out.println("Player 2 won");
       }

    }
}
