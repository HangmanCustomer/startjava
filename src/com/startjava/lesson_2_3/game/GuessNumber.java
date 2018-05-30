package com.startjava.lesson_2_3.game;
import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

	private int secretNum;
	Scanner scanner = new Scanner(System.in);
	Player player01 = new Player();
	Player player02 = new Player();


	public void guessingProcess(){
		secretNum = (int) (Math.random() * 10);
		System.out.println(secretNum);
		int tries = 0;
		while(true){

			System.out.print(player01.getName()+" Spell your number ");
			player01.setUserNum(scanner.nextInt());
			player01.setAnswers(tries, player01.getUserNum());
			System.out.print(player02.getName()+" Spell your number ");
			player02.setUserNum(scanner.nextInt());
			player01.setAnswers(tries, player02.getUserNum());
			tries++;
			if (player01.getUserNum() == secretNum){
				player01.setWin(true);
			}
			if (player02.getUserNum() == secretNum){
				player02.setWin(true);
			}
			if (player01.getWin() == true && player02.getWin() == true){
				System.out.println("Both of players are win || Secret number was " + secretNum);
				player01.setWin(false);
				player02.setWin(false);
				break;
			}
			else if (player01.getWin() == true){
					System.out.println("Игрок по имени " + player01.getName() +
							" угадал, загаданное компьютером число " + secretNum + " с " + tries + " попыток");
					player01.setWin(false);
					break;
				}
			else if (player02.getWin() == true){
					System.out.println("Игрок по имени " + player02.getName() +
							" угадал, загаданное компьютером число " + secretNum + "с " + tries + " попыток");
					player02.setWin(false);
					break;

				}
			}
		}
}