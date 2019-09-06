package H04;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.orange);
        g.fillArc(20, 20, 200, 100, 270, 360);
    }
}
