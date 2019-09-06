package H04;


import java.awt.*;
import java.applet.*;

public class Dice extends Applet {
    @Override
    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.fillRoundRect(40,100,300,300,50,50);
        g.setColor(Color.black);
        g.fillOval(80, 140, 75, 75);
        g.fillOval(225, 140, 75, 75);
        g.fillOval(80, 280, 75, 75);
        g.fillOval(225, 280, 75, 75);
    }
}
