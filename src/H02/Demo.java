package H02;


import java.applet.Applet;
import java.awt.*;

public class Demo extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawString("Romano", 40, 40);
    }
}