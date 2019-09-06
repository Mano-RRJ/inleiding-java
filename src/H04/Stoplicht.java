package H04;

import java.applet.*;
import java.awt.*;


public class Stoplicht extends Applet {
    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(20, 20, 150, 300);
        g.setColor(Color.red);
        g.fillOval(50, 30, 90, 90);
        g.setColor(Color.orange);
        g.fillOval(50, 125, 90, 90);
        g.setColor(Color.green);
        g.fillOval(50, 220, 90, 90);
    }
}

