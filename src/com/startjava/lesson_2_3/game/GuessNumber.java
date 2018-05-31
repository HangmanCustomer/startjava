package com.startjava.lesson_2_3.game;
import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

	private int secretNum;
	Scanner scanner = new Scanner(System.in);
	Player player01 = new Player();
	Player player02 = new Player();


	public void guessingProcess(){
		secretNum = (int) (Math.random() * 100); //присвоения числа тут, чтобы сбросилось число при перезапуске игры
		int tries = 0;
		while(true){

			System.out.print(player01.getName()+" Введите число ");
			player01.setUserNum(scanner.nextInt());
			player01.setAnswers(tries, player01.getUserNum());  //запись ответа игрока в массив через сеттер
			System.out.print(player02.getName()+" Введите число ");
			player02.setUserNum(scanner.nextInt());
			player02.setAnswers(tries, player02.getUserNum());
			tries++;

			if (player01.getUserNum() == secretNum){                    //проверка ответа игрока, флаг победы в случае угадывания
				player01.setWin(true);
			}else if (player01.getUserNum() > secretNum)
				System.out.println(player01.getName() + " указал число больше загадонного"); // подсказки
			else if (player01.getUserNum() < secretNum )
				System.out.println(player01.getName() + " указал число меньше загадонного");

			if (player02.getUserNum() == secretNum){
				player02.setWin(true);
			}else if (player02.getUserNum() > secretNum)
            System.out.println(player02.getName() + " указал число больше загадонного");
        else if (player02.getUserNum() < secretNum )
            System.out.println(player02.getName() + " указал число меньше загадонного");

			if (player01.getWin() == true && player02.getWin() == true){     // вариант ничьи
				System.out.println("Оба игрока угадали число " + secretNum + " с " + tries + " попыток");
				player01.setWin(false);
				player02.setWin(false); // сброс флагов
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
							" угадал, загаданное компьютером число " + secretNum + " с " + tries + " попыток");
					player02.setWin(false);
					break;

				}
			}
		}
}