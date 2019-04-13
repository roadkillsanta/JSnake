// Graphics Panel
// Written by: Mr. Swope
// Date: February 10th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel implements KeyListener{
	private Snake snake = new Snake();
	public GraphicsPanel(){
		setPreferredSize(new Dimension(500, 500));
        this.setFocusable(true);			// for keylistener
		this.addKeyListener(this);
		Thread gameThread=new Thread();
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.GRAY);
		g2.fillRect(0, 0, 500, 500);
	}


	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			// move right
			case KeyEvent.VK_RIGHT:
				snake.setDirection("right");
				break;
			//move left
			case KeyEvent.VK_LEFT:
				snake.setDirection("left");
				break;
			//
			case KeyEvent.VK_UP:
				snake.setDirection("up");
				break;
			case KeyEvent.VK_DOWN:
				snake.setDirection("down");
				break;
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
