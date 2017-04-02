package viergewinnt;
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	public GameFrame (){
	
	
	setSize(900, 900);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setBackground(Color.WHITE);
	
	JPanel pnl1=new PaintPanel();;
	pnl1.setBackground(Color.GREEN);
	add(pnl1, BorderLayout.CENTER);

	JPanel pnl2=new JPanel();
	pnl2.setBackground(new Color(50, 128, 20));
	add(pnl2, BorderLayout.SOUTH);

	JButton btn1=new JButton("Neues Spiel");
	pnl2.add(btn1);
	}
}