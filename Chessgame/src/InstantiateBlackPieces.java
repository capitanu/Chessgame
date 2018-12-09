
public class InstantiateBlackPieces {
	public static void ibp(Chessboard cb) {
		AllPieces.pawnB = new Chessboard.Chesspiece[8];
		char row = 'a';
		for(int i = 0; i < 8; i++ ) {
			AllPieces.pawnB[i] = cb.new PawnB('b','P');
			AllPieces.pawnB[i].setColumn((byte)7);
			AllPieces.pawnB[i].setRow((char)(row + i));
			Execute.cb.setFields(AllPieces.pawnB[i]);
		}
		AllPieces.rookB = new Chessboard.Chesspiece[2];
		AllPieces.bishopB = new Chessboard.Chesspiece[2];
		AllPieces.knightB = new Chessboard.Chesspiece[2];
		AllPieces.rookB[0] = cb.new Rook('b','R');
		AllPieces.rookB[1] = cb.new Rook('b','R');
		AllPieces.bishopB[0] = cb.new Bishop('b','B');
		AllPieces.bishopB[1] = cb.new Bishop('b','B');
		AllPieces.knightB[0] = cb.new Knight('b','N');
		AllPieces.knightB[1] = cb.new Knight('b','N');
		for(int i = 0; i < 2 ; i++) {
			AllPieces.rookB[i].setColumn((byte)8);
			AllPieces.knightB[i].setColumn((byte)8);
			AllPieces.bishopB[i].setColumn((byte)8);
		}
		AllPieces.rookB[0].setRow('a');
		AllPieces.rookB[1].setRow('h');
		AllPieces.knightB[0].setRow('b');
		AllPieces.knightB[1].setRow('g');
		AllPieces.bishopB[0].setRow('c');
		AllPieces.bishopB[1].setRow('f');
		for(int i = 0; i < 2; i++)
		{
			cb.setFields(AllPieces.rookB[i]);
			cb.setFields(AllPieces.bishopB[i]);
			cb.setFields(AllPieces.knightB[i]);
			
		}
		AllPieces.queenB = cb.new Queen('b','Q');
		AllPieces.kingB = cb.new King('b','K');
		AllPieces.queenB.setColumn((byte)8);
		AllPieces.queenB.setRow('d');
		AllPieces.kingB.setColumn((byte)8);
		AllPieces.kingB.setRow('e');
		cb.setFields(AllPieces.queenB);
		cb.setFields(AllPieces.kingB);
	}

}
