package H06;


import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int a;
    int b;
    int c;
    int uur;
    int dag;
    int jaar;

    @Override
    public void init() {
        a = 60;
        b = 24;
        c = 356;
        uur = a * a;
        dag = uur * b;
        jaar = dag * c;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hoeveel seconden zitten er in een uur?", 20, 20);
        g.drawString("60 x 60 =" + uur, 20, 40);
        g.drawString("Hoeveel seconden zitten er in een dag?", 20, 60);
        g.drawString("3600 x 24 =" + dag, 20, 80);
        g.drawString("Hoeveel seconden zitter er in een jaar?", 20, 100);
        g.drawString("86400 x 356 =" + jaar, 20, 120);
    }
}