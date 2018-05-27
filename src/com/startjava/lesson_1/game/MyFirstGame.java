package com.startjava.lesson_1.game;
public class MyFirstGame {
	public static void main(String[] args){
		System.out.println("Try to guess the number");
		int secretNum = 57;
		int yourNum = 94; 
		while(secretNum!=yourNum){
		if (secretNum > yourNum){
			System.out.println("Your number is less then secret number");
			yourNum++;
		}
		if (yourNum > secretNum){
			System.out.println("Your number is bigger then secret number");
			yourNum--;
		}
		// yourNum = 57;
		// System.out.println("Your new number is " + yourNum);
	}
	System.out.println("You are Win");


	
	}
}