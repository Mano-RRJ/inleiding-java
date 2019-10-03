package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    @Override
    public void init() {
        setSize(1920, 1080);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 1; i < 11; i++) {
            g.drawString("" + i * 3,50,50 + i * 20);
        }
    }
}
