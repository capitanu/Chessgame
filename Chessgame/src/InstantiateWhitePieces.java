
public class InstantiateWhitePieces {
	public static void iwp(Chessboard cb) {
		AllPieces.pawnW = new Chessboard.Chesspiece[8];
		char row = 'a';
		for(int i = 0; i < 8; i++ ) {
			AllPieces.pawnW[i] = cb.new PawnW('w','P');
			AllPieces.pawnW[i].setColumn((byte)2);
			AllPieces.pawnW[i].setRow((char)(row + i));
			Execute.cb.setFields(AllPieces.pawnW[i]);
		}
		AllPieces.rookW = new Chessboard.Chesspiece[2];
		AllPieces.bishopW = new Chessboard.Chesspiece[2];
		AllPieces.knightW= new Chessboard.Chesspiece[2];
		AllPieces.rookW[0] = cb.new Rook('w','R');
		AllPieces.rookW[1] = cb.new Rook('w','R');
		AllPieces.bishopW[0] = cb.new Bishop('w','B');
		AllPieces.bishopW[1] = cb.new Bishop('w','B');
		AllPieces.knightW[0] = cb.new Knight('w','N');
		AllPieces.knightW[1] = cb.new Knight('w','N');
		for(int i = 0; i < 2 ; i++) {
			AllPieces.rookW[i].setColumn((byte)1);
			AllPieces.bishopW[i].setColumn((byte)1);
			AllPieces.knightW[i].setColumn((byte)1);
		}
		AllPieces.rookW[0].setRow('a');
		AllPieces.rookW[1].setRow('h');
		AllPieces.knightW[0].setRow('b');
		AllPieces.knightW[1].setRow('g');
		AllPieces.bishopW[0].setRow('c');
		AllPieces.bishopW[1].setRow('f');
		for(int i = 0; i < 2; i++)
		{
			cb.setFields(AllPieces.rookW[i]);
			cb.setFields(AllPieces.bishopW[i]);
			cb.setFields(AllPieces.knightW[i]);
			
		}
		AllPieces.queenW = cb.new Queen('w','Q');
		AllPieces.kingW = cb.new King('w','K');
		AllPieces.queenW.setColumn((byte)1);
		AllPieces.queenW.setRow('d');
		AllPieces.kingW.setColumn((byte)1);
		AllPieces.kingW.setRow('e');
		cb.setFields(AllPieces.queenW);
		cb.setFields(AllPieces.kingW);
	}

}
