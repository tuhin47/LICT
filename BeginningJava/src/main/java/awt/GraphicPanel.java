package awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicPanel extends Panel {
	GraphicPanel() {
		setBackground(Color.black);
	}

	public void paint(Graphics g) {
		g.setColor(new Color(0, 255, 0)); // green
		g.setFont(new Font("Helvetica", Font.PLAIN, 16));
		g.drawString("Hello GUI World!", 30, 100);
		g.setColor(new Color(1.0f, 0, 0)); // red
		g.fillRect(30, 100, 150, 10);
	}

	/* need to place Panel in Frame or other Window */
	public static void main(String args[]) {
		Frame f = new Frame("Testing Graphics Panel");
		GraphicPanel gp = new GraphicPanel();
		f.add(gp);
		f.setSize(600, 300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

}
