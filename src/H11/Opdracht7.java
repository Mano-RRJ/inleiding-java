package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    @Override
    public void init() {
        setSize(1920, 1080);
    }

    @Override
    public void paint(Graphics g) {
        int x = 300;
        int y = 300;
        int width = 50;
        int height = 50;

        for (int i = 1; i <51; i++) {
            g.drawOval(x, y, width, height);
            width += 10;
            height += 10;
            x -= 5;
            y -= 5;
        }
    }
}