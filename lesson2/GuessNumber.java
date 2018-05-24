import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

	private int secretNum = (int) (Math.random() * 10);
	Scanner scanner = new Scanner(System.in);
	Player player01 = new Player();
	Player player02 = new Player();

	public void guessingProcess(){
		System.out.println(secretNum);
		while(true){
			System.out.println(player01.getName()+" Spell your number");
			player01.setUserNum(scanner.nextInt());
			System.out.println(player02.getName()+" Spell your number");
			player02.setUserNum(scanner.nextInt());
			if (player01.getUserNum() == secretNum){
				player01.setWin(true);
			}
			if (player02.getUserNum() == secretNum){
				player02.setWin(true);
			}
			if (player01.getWin() == true && player02.getWin() == true){
				System.out.println("Both of players is win || Secret number was " + secretNum);
				break;
			}
			else if (player01.getWin() == true){
					System.out.println(player01.getName()+ " is the Winner!!!! || Secret number was " + secretNum);
					break;
				}
			else if (player02.getWin() == true){
					System.out.println(player02.getName()+ " is the Winner!!!! || Secret number was " + secretNum);
					break;

				}
			}
		}
}