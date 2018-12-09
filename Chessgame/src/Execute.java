import java.util.Scanner;
import java.util.Random;
//  Field is a Nested Class because 
@SuppressWarnings("unused")
public class Execute {
	public static Chessboard cb;
	public static void main(String[] args) throws InterruptedException, Chessboard.NotValidFieldException {
		cb = new Chessboard();	
		InstantiateWhitePieces.iwp(cb); //Spawning White Pieces
		InstantiateBlackPieces.ibp(cb); //Spawning Black Pieces
		Instructions.printInstructions();
		System.out.println(cb.toString()); //Print First Board
		GameMain.run();

	}
}

