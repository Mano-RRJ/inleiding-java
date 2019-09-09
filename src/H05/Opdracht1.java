package H05;


import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(20, 20, 100, 50);
        g.setColor(Color.magenta);
        g.fillRect(135,20, 100, 50);

        g.setColor(Color.black);
        g.drawOval(135, 20, 100, 50);

        g.drawOval(250, 20 ,100, 50);
        g.setColor(Color.magenta);
        g.fillArc(250, 20, 100, 50, 90, 45);

        g.setColor(Color.magenta);
        g.fillRoundRect(20, 100, 100, 50, 20, 20);

        g.fillOval(135, 100, 100, 50);

        g.setColor(Color.black);
        g.drawOval(270, 95, 60, 60);
    }
}