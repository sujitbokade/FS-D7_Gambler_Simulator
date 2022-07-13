package com.bridgelabz;

import java.util.Date;

public class GamblerSimulator {
    static int DAILY_STAKE = 100;
    static int BET_PER_GAME = 1;
    static int win = 1;
    static int totalAmountWon = 0;
    static int totalAmountLost = 0;
    static int dayswon = 0;
    static int dayslost = 0;


    static void winCheck() {
        int result = (int) (Math.random() * 10) % 2;
        if (result == win) {
            DAILY_STAKE++;
        } else {
            DAILY_STAKE--;
        }
    }

    static void resignDayCheck() {
        for (int day = 1; day <= 20; day++) {
            DAILY_STAKE = 100;
            while (DAILY_STAKE < 150 && DAILY_STAKE > 50) {
                winCheck();
            }
            if (DAILY_STAKE > 100) {
                totalAmountWon += 50;
                System.out.println("won on day " + day + " is " + (DAILY_STAKE - 100));
                dayswon++;
            } else {
                totalAmountLost -= 50;
                System.out.println("Lost on day " + day + " is " + (100 - DAILY_STAKE));
                dayslost++;
            }
        }
            System.out.println("Total Amount Won in 20 Days " + totalAmountWon);
            System.out.println("Total Amount Lost in 20 Days " + totalAmountLost);
            System.out.println("No of Days Won " + dayswon);
            System.out.println("No of Days Lost " + dayslost);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator!");
        resignDayCheck();
    }
}
