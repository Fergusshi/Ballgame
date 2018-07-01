import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
	
	double x = 100;
	double y = 100;
	double degree = 3.14/3;
	
	public void paint(Graphics g) {
		
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x = x + 0.5 * Math.cos(degree);
		y = y + 0.5 * Math.sin(degree);
		
		if(y>500-40-30 || y < 40+30) {
			 degree = -degree;
		}
		if(x < 0+30 || x > 856-40-30) {
			degree = 3.14 - degree;
		}
	}
	
	
	void launchFrame() {
		
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		while(true) {
			repaint();
			try {
			Thread.sleep(0,1);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	
	public static void main(String[] args) {
		System.out.println("I get the idea to show");
		BallGame game = new BallGame();
		game.launchFrame();
	} 

}
