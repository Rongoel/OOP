package viergewinnt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class PaintPanel extends JPanel implements MouseListener {
	
	
    // sets the size of the Circle and the CircleGrid
	Circle c=new Circle(50, 60, 40);
	CircleGrid cg=new CircleGrid (5,10,30);

	
	// paints the Circles
	@Override
	public void paint(Graphics gr)
	{
	    super.paint(gr);
	    cg.draw(gr);
	    
	   	   
	}
	
	// adds a Mouse listener
	public PaintPanel() {
		addMouseListener(this);
	}
	
	// sets what happens if the mouse is Pressed
	public void mousePressed(MouseEvent evt){
		int x=evt.getX();
		int y=evt.getY();
		if (c.clicked(x,y))
			c.setFill(Color.BLUE);
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		
	}
	
	
}