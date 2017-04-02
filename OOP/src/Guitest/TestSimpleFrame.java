package Guitest;
import java.awt.*;
import javax.swing.*;
public class TestSimpleFrame {
	public static void main(String [] args)	{
		
		int width; // sets frame 1 width
		int height; // sets frame 1 height
		
		width = 400; // changes width
		height = 500; // changes height
		
		
		
		/* Initializes new frame with the width and height determined above. 
		   Also sets it to be visible and having the background color.
		   JFrame.EXIT_ON_CLOSE completely terminates the program after the exit button is pressed 
		*/
		JFrame myframe; 
		myframe = new JFrame();
		myframe.setSize(width, height);
		myframe.setVisible(true);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.getContentPane().setBackground(Color.WHITE);
		
		// Initializes to new integers that will set the height of the new frame 
		int widthFrame;
		int heightFrame;
		widthFrame = myframe.getWidth();
		heightFrame = myframe.getHeight();
		
		Point location;
		location = myframe.getLocation();
		location.translate(0,(heightFrame+10));
		
		
		
		JFrame myframe2;
		myframe2 = new JFrame();
		myframe2.setSize(widthFrame, heightFrame);
		myframe2.setVisible(true);
		myframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe2.getContentPane().setBackground(Color.WHITE);
		myframe2.setLocation(location);
		
		
	
	}

	


}