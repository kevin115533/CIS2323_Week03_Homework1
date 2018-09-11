public class ChessPiece{
	
	private int yPos;
	private char xPos;
	private String color, type;
	
	public void setPosition(char x, int y){
		xPos = x;
		yPos = y;
	}
	
	public char getXPosition(){
		return xPos;
	}
	
	public int getYPosition(){
		return yPos;
	}
	
	public void setColor(String x){
		color = x;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setPieceType(String x){
		type = x;
	}
	
	public String getPieceType(){
		return type;
	}
	
	public String printInfo(){
		return "Color: " + color + "\n"
		+ "Piece : " + type + "\n"
		+ "Position: " + xPos + yPos; 
	}
}	
