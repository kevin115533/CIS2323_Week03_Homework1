public class TestPieces {
	public static void main (String[] args){
		
		ChessPiece pawn = new ChessPiece();
		
		pawn.setColor("Black");
		pawn.setPosition('b',2);
		pawn.setPieceType("Pawn");
		
		System.out.println(pawn.getXPosition() + "," + pawn.getYPosition());
		System.out.println(pawn.getColor());
		System.out.println(pawn.getPieceType());
		
		System.out.println(pawn.printInfo());
		
		ChessPiece king = new ChessPiece();
		
		king.setColor("White");
		king.setPosition('d',1);
		king.setPieceType("King");
		
		System.out.println(king.getXPosition() + "," + king.getYPosition());
		System.out.println(king.getColor());
		System.out.println(king.getPieceType());
		
		System.out.println(king.printInfo());
	
		
	}
	
}