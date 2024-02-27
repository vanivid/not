import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
public class Rando implements ActionListener
{
      JFrame f;
      JButton b;
      public Rando()
      {
            f = new JFrame();
            b = new JButton("Click");
            b.setBounds(200,80,90,70);
            f.setSize(500,500);
            f.setVisible(true);
            f.setDefaultCloseOperation(3);
            f.setLayout(null);
            f.add(b);
            b.addActionListener(this);
     }
      public void actionPerformed(ActionEvent e)
      {
            int r = (int) (Math.random()*255);
            int b = (int) (Math.random()*255);
            int g = (int) (Math.random()*255);
            Color c = new Color(r,g,b);
            f.getContentPane().setBackground(c);

      }
      public static void main(String[] args)
      {
            new Rando();
      }
}
