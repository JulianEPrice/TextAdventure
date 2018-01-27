import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Render extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("This is some text", 25, 25);
	}
	
}
