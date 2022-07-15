package com.bridgelabz;



public class GamblerSimulator {
    static int DAILY_STAKE = 100;

    static int win = 1;
    static int totalAmountWon = 0;
    static int totalAmountLost = 0;
    static int daysWon = 0;
    static int daysLost = 0;
    static int luckyDay;
    static int unluckyDay;
    static int totalStake;
    static int maxWin=0;
    static int maxLost=0;
    static int totalAmount;

    static void winCheck() {
        int result = (int) (Math.random() * 10) % 2;
        if (result == win) {
            totalStake++;
        } else {
            totalStake--;
        }
    }

    static void maxWinLostCheck() {
        for (int day = 1; day <= 20; day++) {
            totalStake=DAILY_STAKE;
            while (totalStake< 150 && totalStake > 50) {
                winCheck();
            }
            if (totalStake > 100) {
                totalAmountWon += 50;
                if(totalStake>maxWin){
                    maxWin=totalStake;
                    luckyDay=day;
                }
                System.out.println("won on day " + day + " is " + (totalStake - 100));
                daysWon++;
            }
            else {
                totalAmountLost -= 50;
                if(totalStake>maxLost){
                    maxLost=totalStake;
                    unluckyDay=day;
                }
                System.out.println("Lost on day " + day + " is " + (100 - totalStake));
                daysLost++;
            }
        }
            System.out.println("Total Amount Won in 20 Days " + totalAmountWon);
            System.out.println("Total Amount Lost in 20 Days " + totalAmountLost);
            System.out.println("No of Days Won " + daysWon);
            System.out.println("No of Days Lost " + daysLost);
            System.out.println("lucky day is "+luckyDay);
            System.out.println("unlucky day is "+unluckyDay);
            System.out.println();

    }
    static void eligibiltyCheck(){
        totalAmount=totalAmountWon+totalAmountLost;
        if(totalAmount>=100){
            System.out.println("You are in Profit,Continue for Next Month");
        }
        else {
            System.out.println("You are in Loss,Not Eligible for Next Month");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator!");
        maxWinLostCheck();
        eligibiltyCheck();
    }
}
