package H04;


import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {
    @Override
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(1000, 300, 1200, 300);
        g.drawLine(1100, 150, 1200, 300);
        g.drawLine(1100, 150, 1000, 300);
        g.drawRect(1000,300,200,200);
        g.drawOval(1075,350,50,50);
        g.drawRect(1120, 425, 40, 75);

    }
}