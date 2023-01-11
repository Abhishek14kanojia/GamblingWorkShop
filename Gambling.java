package com.workShop;

import java.util.Scanner;

public class Gambling {
	 int stakePerDay;
	    int betPrice = 1;
	    int minStake = 50;
	    int maxStake = 150;
	    int win = 0;
	    int loose = 0;
	    int profit = 0;

	    public void play() {
	        while (stakePerDay > minStake && stakePerDay < maxStake) 
	        {
	            int play = (int) (Math.random() * 2); 
	            switch (play) {
	                case 0: 
	                    stakePerDay += betPrice;
	                    break;

	                case 1: 
	                    stakePerDay -= betPrice;
	                    break;
	            }
	        }
	    }

	    public void gamble20Days() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter the amount of Stake:");
	        int num = scanner.nextInt();
	        for (int days = 1; days <= 20; days++) {
	            stakePerDay = num;
	            play();
	            System.out.println(" \n The player has stake of " + stakePerDay + " on day " + days);
	            int balanceDay = stakePerDay - 100; 
	            profit += balanceDay;
	            if (stakePerDay > minStake) {
	                win++; 
	            } else {
	                loose++;
	            }
	            System.out.println("The total profit or loss of the day is " + balanceDay);
	        }
	        System.out.println(" \n In total 20 days, the player has won " + win + " days and loose " + loose + " days");
	        System.out.println("The total gain amount for 20 Days is $" + profit);
	        scanner.close();
		
		}

}
