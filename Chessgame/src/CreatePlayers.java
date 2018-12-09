import java.util.Random;
import java.util.Scanner;

public class CreatePlayers {
	public static String p1;
	public static char p1color;
	public static String p2;
	public static char p2color;
	@SuppressWarnings("resource")
	public static int players() throws InterruptedException {
		System.out.println("What would be the player's names?");
		Scanner in = new Scanner(System.in);
		System.out.print("Player 1: ");
		p1 = in.nextLine();
		System.out.print("Player 2: ");
		p2 = in.nextLine();
		System.out.println("Very well, " + p1 + " and " + p2 + ", ...shall we start? ");
		System.out.println(p1 + ", heads or tails?");
		String choice = in.nextLine();
		while(!choice.equals("heads") && !choice.equals("tails")) {
			System.err.println("You only have two choices...");
			choice = in.nextLine();
		}
		Thread.sleep(1000);
		Random rand = new Random();
		int rnd = rand.nextInt(2);
		Thread.sleep(1000);
		int turn;
		if (rnd == 0) {
			System.out.println("It was tails!");
			if(choice.equals("tails"))
			{
				System.out.println("It seems that " + p1 + " will play with White Pieces this turn and \n" + p2 + " will play with Black Pieces.");
				System.out.println("Good luck!");
				turn = 0;
				p1color = 'w';
				p2color = 'b';
			}
			else
			{
				System.out.println("It seems that " + p2 + " will play with White Pieces this turn and \n" + p1 + " will play with Black Pieces.");
				System.out.println("Good luck!");
				turn = 1;
				p1color = 'b';
				p2color = 'w';
			}
				
		}
		else 
		{
			System.out.println("It was heads!");
			if(choice.equals("heads"))
			{
				System.out.println("It seems that " + p1 + " will play with White Pieces this turn and \n" + p2 + " will play with Black Pieces.");
				System.out.println("Good luck!");
				turn = 0;
				p1color = 'w';
				p2color = 'b';
			}
			else
			{
				System.out.println("It seems that " + p2 + " will play with White Pieces this turn and \n" + p1 + " will play with Black Pieces.");
				System.out.println("Good luck!");
				turn = 1;
				p1color = 'b';
				p2color = 'w';
			}
				
		}
		return turn;
	}
	

}
