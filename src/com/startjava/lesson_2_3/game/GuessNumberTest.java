package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class GuessNumberTest {
	public static void main(String[] args) {
		String yesOrNo = "y";
		GuessNumber guessNumber = new GuessNumber();

		while (yesOrNo.equals("y")) {

			System.out.println("++++ ---- Отгадай число ---- ++++\nДиапазон от 0 до 100\n");
			if (guessNumber.player01.getName().equals("") && guessNumber.player02.getName().equals("") ) { //проверка необходимости
				System.out.print("Введите имя игрока I ");                                              //повторно вводить имя
				guessNumber.player01.setName(guessNumber.scanner.next());
				System.out.print("Введите имя игрока II ");
				guessNumber.player02.setName(guessNumber.scanner.next());
			}
			guessNumber.guessingProcess();  // игровой процесс
			do {
				System.out.println("Хотите сыграть еще [Y/N]");
				yesOrNo = guessNumber.scanner.next();
			}
			while (yesOrNo.equals("n") && yesOrNo.equals("y"));       //проверка на повтор игры
			if (yesOrNo.equals("n")) {                                  //вывод статистики в случае завершения
				System.out.println("-------------|Статистика|------------");
				System.out.print(guessNumber.player01.getName() + ": ");
                for (int i = 0; i < guessNumber.player01.getAnswersLength(); i++)     // вывод массива ответов игроков
                    System.out.print(guessNumber.player01.getAnswers(i) + " ");       //с использованием геттера длинны массива
				System.out.println();
				System.out.print(guessNumber.player02.getName() + ": ");
                for (int i = 0; i < guessNumber.player02.getAnswersLength(); i++)
                    System.out.print(guessNumber.player02.getAnswers(i) + " ");
			}
		}
	}
}
