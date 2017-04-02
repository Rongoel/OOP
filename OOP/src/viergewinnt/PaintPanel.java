package viergewinnt;

import java.awt.*;
import javax.swing.*;


public class PaintPanel extends JPanel {
	@Override
	public void paint(Graphics gr)
	{
	    super.paint(gr);
	    gr.fillOval(40, 70, 40, 40);
	    
	    super.paint(gr);
	    gr.fillRect(90, 100, 50, 50);
	}
}