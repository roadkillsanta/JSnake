import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Snake {
	public int length;
	public int foodValue;
	public ArrayList bodyPos;
	public int[][] playArea;
	public int direction;
	public Snake() {
		this(0,0,1);
	}
	public Snake(int foodValue) {
		this(0,0, foodValue);
	}
	public Snake(int boardLength, int boardWidth) {
		this(boardLength, boardWidth, 1);
	}
	public Snake(int boardLength, int boardWidth, int foodValue) {
		this.length=1;
		this.playArea=new int[boardLength][boardWidth];
		for(int i=0; i<boardWidth; i++) {
			for(int j=0; j<boardLength; j++) {
				playArea[i][j]=j;
			}
		}
		this.foodValue=foodValue;
		this.bodyPos.add(0);
	}
	public void eatFood() {
		this.length=this.length+this.foodValue;
		for(int i=0; i<foodValue; i++) {
			bodyPos.add(0);
		}
	}
	public void setDirection(String string) {
		if(string.contains("right")) {
			this.direction=1;
		}
		else if(string.contains("left")) {
			this.direction=-1;
		}
		else if(string.contains("up")) {
			this.direction=2;
		}
		else if(string.contains("down")) {
			this.direction=-2;
		}
		else {
			this.direction=0;
		}
	}
	public void move() {
		bodyPos.get(0);
	}
	public void drawSnake(Graphics2D g2) {
		for(int i = 0; i<=this.length; i++) {
			g2.setColor(Color.BLUE);
			g2.fillRect(this.playArea[0][0], this.playArea[0][0], 25, 25);  
		}
	}
}
