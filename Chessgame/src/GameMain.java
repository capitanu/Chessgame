public class GameMain {

	public static void run() {
		int turn = 0;
		try {
			turn = CreatePlayers.players();
		}
		catch ( InterruptedException inx) {}
		boolean roll = true;
		while(roll) {
			if(turn % 2 == 0) {
				System.out.println("It is " + CreatePlayers.p1 + "'s turn: ");
				P1Turn.move(Execute.cb);
			}
			else {
				System.out.println("It is " + CreatePlayers.p2 + "'s turn: ");
				P2Turn.move(Execute.cb);
			
			}
			turn++;
		}
	}
}