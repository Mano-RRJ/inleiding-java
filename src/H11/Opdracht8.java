package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet {

    @Override
    public void init() {
        setSize(1920, 1080);
    }

    @Override
    public void paint(Graphics g) {
        int x = 1000;
        int y = 500;
        int width = 5;
        int height = 5;

        for (int i = 1; i <101; i++) {
            g.drawOval(x, y, width, height);
            width += 10;
            height += 10;
            x -= 10;
            y -= 5;
        }
    }
}