public class GuessNumberTest{
	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();
		System.out.println("++++ ---- Game Start ---- ++++\nNumbers from 0 to 10\n");
		System.out.println("Set name of player I");
		guessNumber.player01.setName(guessNumber.scanner.next());
		System.out.println("Set name of player II");
		guessNumber.player02.setName(guessNumber.scanner.next());
		guessNumber.guessingProcess();
	}
}