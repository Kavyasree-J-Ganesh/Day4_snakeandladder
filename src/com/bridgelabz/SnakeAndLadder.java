package com.bridgelabz;

public class SnakeAndLadder {
    
    public static void main(String[] args) {
       int position = 0;

       int random = (int) Math.floor(Math.random()*10) % 7;
       System.out.println(random);
    }
}
