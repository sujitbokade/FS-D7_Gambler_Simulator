package com.bridgelabz;

import java.util.Date;

public class GamblerSimulator {
    static int DAILY_STAKE = 100;
    static int BET_PER_GAME = 1;
    static int win=1;

    static void winCheck(){
        int result=(int)(Math.random()*10)%2;
        if(result==win){
            DAILY_STAKE++;
            System.out.println("You Win");
        }
        else {
            DAILY_STAKE--;
            System.out.println("You Loose");
        }
        System.out.println("Daily Stake = "+DAILY_STAKE);
    }

         static void resignDayCheck() {
             for (int day = 1; day <= 20; day++) {
                 System.out.println("Day :"+day);
                 while (DAILY_STAKE < 150 && DAILY_STAKE > 50) {
                     winCheck();
                 }
             }
             System.out.println("Total money after 20 days "+DAILY_STAKE);
         }
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator!");
        resignDayCheck();
    }
}
