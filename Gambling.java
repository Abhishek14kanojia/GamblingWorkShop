package com.workShop;

import java.util.Scanner;

public class Gambling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount of stack");
		int Stack = sc.nextInt();
		System.out.println("enter the price of game");
		int betPrice = sc.nextInt();
		
		System.out.println(Stack);
		System.out.println(betPrice);
		
		int play = (int)(Math.random()*2);
		
		switch(play) {
		case 0:
			Stack = Stack + betPrice;
			System.out.println(Stack);
		case 1:
			Stack = Stack - betPrice;
			System.out.println(Stack);
		}
		
		}

}
