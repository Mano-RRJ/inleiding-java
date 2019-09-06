package H04;


import java.applet.Applet;
import java.awt.*;

public class Nederland extends Applet {
    @Override
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(135, 150, 1000, 200);
        g.setColor(Color.white);
        g.fillRect(135, 350, 1000, 200);
        g.setColor(Color.blue);
        g.fillRect(135, 550, 1000, 200);
        g.setColor(Color.white);
        g.fillRect(135, 750, 75, 800);

    }
}