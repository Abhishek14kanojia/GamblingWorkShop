package com.workShop;

import java.util.Scanner;

public class Gambling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount of stack");
		int Stake = sc.nextInt();
		System.out.println("enter the price of game");
		int betPrice = sc.nextInt();
		 int maxStake = Stake + 50 % Stake;
	     int minStake = Stake - 50 % Stake;
		
		System.out.println(Stake);
		System.out.println(betPrice);
		 while (Stake > minStake && Stake < maxStake) {
		int play = (int)(Math.random()*2);
		
		switch(play) {
		case 0:
			Stake = Stake + betPrice;
			System.out.println(Stake);
		case 1:
			Stake = Stake - betPrice;
			System.out.println(Stake);
		}
		
		}
		 System.out.println("50% stake limit :" + Stake);
		
		
		}

}
