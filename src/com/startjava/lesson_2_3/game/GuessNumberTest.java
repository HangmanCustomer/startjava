package com.startjava.lesson_2_3.game;
public class GuessNumberTest{
	public static void main(String[] args) {
		String yesOrNo = "y";
		while(yesOrNo.equals("y")){
		GuessNumber guessNumber = new GuessNumber();
		System.out.println("++++ ---- Game Start ---- ++++\nNumbers from 0 to 10\n");
		System.out.println("Set name of player I");
		guessNumber.player01.setName(guessNumber.scanner.next());
		System.out.println("Set name of player II");
		guessNumber.player02.setName(guessNumber.scanner.next());
		guessNumber.guessingProcess();
			do {
				System.out.println("Do you wonna play again [Y/N]");
				yesOrNo = guessNumber.scanner.next();
				}
				while (yesOrNo.equals("n") && yesOrNo.equals("y"));
				}
			}
	}
