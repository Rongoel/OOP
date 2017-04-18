package viergewinnt;
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame
{
 
 private JPanel pnl1, pnl2;
 private JLabel lbl1, lbl2;
 private JTextField txt1, txt2;
 private JButton btn1;


 public GameFrame()
 {
 setTitle("Vier gewinnt");
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setSize(500, 300);
 pnl1=new PaintPanel();
 pnl1.setBackground(Color.GREEN);
 add(pnl1, BorderLayout.CENTER);
 pnl2=new JPanel();
 pnl2.setBackground(new Color(220, 220, 220));
 add(pnl2, BorderLayout.SOUTH);
 
 lbl1=new JLabel("Spieler 1: ");
 pnl2.add(lbl1);
 txt1=new JTextField(10);
 pnl2.add(txt1);

 lbl2=new JLabel("Spieler 2: ");
 pnl2.add(lbl2);
 txt2=new JTextField(10);
 pnl2.add(txt2);

 btn1=new JButton("Neues Spiel");
 pnl2.add(btn1);
 setVisible(true); // als letzte Anweisung
 }
}