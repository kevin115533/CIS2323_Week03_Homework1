public class ChessPeice{
	
	private int xPos, yPos;
	private String color, type;
	
	public void setPosition(int x, int y){
		xPos = x;
		yPos = y;
	}
	
	public int getPosition(){
		return xPos, yPos;
	}
	
	public void setColor(String x){
		color = x;
	}
	
	public String getColor(){
		return color:
	}
	
	public void setPeiceType(String x){
		type = x;
	}
	
	public String getPieceType(String x){
		return type;
	}
	
	public String printInfo(){
		return "Color: " + color + "\n"
		+ "Peice : " + type + "\n"
		+ "Position: " + xPos + ", " + yPos; 
	}
}	
