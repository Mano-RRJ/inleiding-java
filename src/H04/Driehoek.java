package H04;


import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {
    @Override
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(500, 800, 1500, 800);
        g.drawLine(1000, 65, 1500, 800);
        g.drawLine(1000, 65, 500, 800);

    }
}