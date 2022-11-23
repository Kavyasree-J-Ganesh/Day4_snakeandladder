package com.bridgelabz;

public class SnakeAndLadder {
    static final int SNAKE=0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    public static void main(String[] args) {
       int position = 0;

       while(position < 100){
           int random = (int) Math.floor(Math.random()*10) % 7;
           int randomCondition = (int) Math.floor(Math.random()*10) %3;

           if(randomCondition == SNAKE && position - random >=0){
               position = position - random;
           } else if(randomCondition == LADDER && position+random <=100){
               position = position + random;
           }
       }

    }
}
