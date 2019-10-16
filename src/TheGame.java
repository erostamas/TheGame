import java.awt.Graphics;

import javax.swing.JFrame; 

public class TheGame extends JFrame {
	TheGame(String title) { 
        this.setSize(500,500); 
        setTitle(title); 
    }
	
	public void paint(Graphics g) {
		g.drawRect(10, 50, 100, 100);
	}

    public static void main(String[] args) {
       TheGame window = new TheGame("Hello CodeCall");
       window.setVisible(true);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
