package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class GuessNumberTest {
	public static void main(String[] args) {
		String yesOrNo = "y";
		GuessNumber guessNumber = new GuessNumber();

		while (yesOrNo.equals("y")) {

			System.out.println("++++ ---- Отгадай число ---- ++++\nДиапазон от 0 до 10\n");
			if (guessNumber.player01.getName().equals("") && guessNumber.player02.getName().equals("") ) {
				System.out.print("Введите имя игрока I ");
				guessNumber.player01.setName(guessNumber.scanner.next());
				System.out.print("Введите имя игрока II ");
				guessNumber.player02.setName(guessNumber.scanner.next());
			}
			guessNumber.guessingProcess();
			do {
				System.out.println("Хотите сыграть еще [Y/N]");
				yesOrNo = guessNumber.scanner.next();
			}
			while (yesOrNo.equals("n") && yesOrNo.equals("y"));
			if (yesOrNo.equals("n")) {
				System.out.println("-------------|Статистика|------------");
				System.out.print(guessNumber.player01.getName() + ": ");
				int[] interimArray = Arrays.copyOf(guessNumber.player01.getAnswers(),guessNumber.player01.getAnswers().length);
				for(int i:interimArray)
					System.out.print(i + " ");
				System.out.print(guessNumber.player02.getName() + ": ");
				interimArray = Arrays.copyOf(guessNumber.player02.getAnswers(),guessNumber.player02.getAnswers().length);
				for(int i:interimArray)
					System.out.print(i + " ");

			}
//			else guessNumber = new GuessNumber();

		}
	}
}
