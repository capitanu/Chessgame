import java.util.Scanner;
public class P1Turn {
	@SuppressWarnings("resource")
	public static void move(Chessboard cb) {
		Scanner in = new Scanner(System.in);
		String currSpot;
		int currRow = 0;
		int currCol = 0;
		boolean inCheck = true;
		System.out.println("Input the piece you want to move: ");
		currSpot = in.nextLine();
		while( inCheck == true ) {
			if(currSpot.equals("rr"))
				move(cb);
			inCheck = false;
			currRow = currSpot.charAt(0) - 97;
			currCol = Character.getNumericValue(currSpot.charAt(1)) - 1;
			if(!Character.isLowerCase(currSpot.charAt(0))) {
				System.out.println("Input Mismatch");
				currSpot = in.nextLine();
				inCheck = true;
				continue;
			}
			if(!Character.isDigit(currSpot.charAt(1)))	{
				System.out.println("Input Mismatch");
				currSpot = in.nextLine();
				inCheck = true;
				continue;
			}
			if(cb.fields[currRow][currCol].getPiece() == null) {
				System.out.println("There is no piece there");
				inCheck = true;
				currSpot = in.nextLine();
				continue;
			}

			if(cb.fields[currRow][currCol].getPiece().getColor() != CreatePlayers.p1color) {
				System.out.println("That one is not yours");
				currSpot = in.nextLine();
				inCheck = true;
			}
		}
		String nextSpot;
		char nextRow = 'a';
		byte nextCol = 1;
		int inextCol, inextRow;
		inCheck = true;
		System.out.println("Input the spot you want the " + cb.fields[currRow][currCol].getPiece().toString() +" to move to: ");
		nextSpot = in.nextLine();
		while(inCheck) {
			if(nextSpot.equals("rr"))
				move(cb);
			inCheck = false;
			nextRow = nextSpot.charAt(0);
			nextCol =(byte)Character.getNumericValue(nextSpot.charAt(1));
			inextRow = nextRow - 97;
			inextCol = nextCol - 1;
			if(!Character.isLowerCase(currSpot.charAt(0))) {
				System.out.println("Input Mismatch");
				nextSpot = in.nextLine();
				inCheck = true;
				continue;
			}
			if(!Character.isDigit(currSpot.charAt(1)))	{
				System.out.println("Input Mismatch");
				nextSpot = in.nextLine();
				inCheck = true;
				continue;
			}
			if(cb.fields[inextRow][inextCol].getPiece() != null)
				if(cb.fields[inextRow][inextCol].getPiece().getColor() == CreatePlayers.p1color)
				{
					System.out.println("You can not take your own pieces out.");
					inCheck = true;
					nextSpot = in.nextLine();
					continue;
				}
			cb.fields[currRow][currCol].getPiece().markReachableFields();
			if( cb.fields[currRow][currCol].getPiece().getName() == 'P') {
				if(cb.fields[currRow][currCol + 1].getPiece() != null)
					cb.fields[currRow][currCol + 1].unmark();
				if(cb.fields[currRow + 1][currCol + 1].getPiece() != null) {
					if(cb.fields[currRow + 1][currCol + 1].getPiece().getColor() == CreatePlayers.p2color)
						cb.fields[currRow + 1][currCol + 1].mark();
				}
				if(cb.fields[currRow - 1][currCol + 1].getPiece() != null) {
					if(cb.fields[currRow - 1][currCol + 1].getPiece().getColor() == CreatePlayers.p2color)
						cb.fields[currRow - 1][currCol + 1].mark();
				}
			}
			if(!cb.fields[inextRow][inextCol].toString().equals("xx") && cb.fields[inextRow][inextCol].getPiece().getColor() != CreatePlayers.p2color &&
					cb.fields[inextRow][inextCol].getPiece().getName() != 'P') {
				System.out.println("You can not move there");
				inCheck = true;
				nextSpot = in.nextLine();
				continue;
			}

		}
		cb.fields[currRow][currCol].getPiece().unmarkReachableFields();
		if( cb.fields[currRow][currCol].getPiece().getName() == 'P') {
			if(cb.fields[currRow + 1][currCol + 1].getPiece() != null) {
				if(cb.fields[currRow + 1][currCol + 1].getPiece().getColor() == CreatePlayers.p2color)
					cb.fields[currRow + 1][currCol + 1].unmark();
			}
			if(cb.fields[currRow - 1][currCol + 1].getPiece() != null) {
				if(cb.fields[currRow - 1][currCol + 1].getPiece().getColor() == CreatePlayers.p2color)
					cb.fields[currRow - 1][currCol + 1].unmark();
			}
		}
		try {
			cb.fields[currRow][currCol].getPiece().moveTo(nextRow, nextCol);
		}
		catch ( Exception e) {}

		System.out.println(cb.toString());
	}
}
