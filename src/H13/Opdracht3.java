package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button Baksteenknop;
    Button Betonknop;
    Button Resetknop;
    boolean rood;
    boolean grijs;

    @Override
    public void init() {
        setSize(600, 400);
        Baksteenknop = new Button("Rode muur");
        Betonknop = new Button("Grijze muur");
        Resetknop = new Button("Reset");
        Baksteenknop.addActionListener(new BaksteenknopActionListener());
        Betonknop.addActionListener(new BetonknopActionListener());
        Resetknop.addActionListener(new ResetknopActionListener());
        add(Baksteenknop);
        add(Betonknop);
        add(Resetknop);
        rood = false;
        grijs = false;
    }

    @Override
    public void paint(Graphics g) {
        if (rood) {
            g.setColor(Color.red);
            muur(g, 50, 50, 100, 50);
            muur(g, 151, 50, 100, 50);
            muur(g, 252, 50, 100, 50);
            muur(g, 353, 50, 100, 50);
            muur(g, 0, 101, 100, 50);
            muur(g, 101, 101, 100, 50);
            muur(g, 202, 101, 100, 50);
            muur(g, 303, 101, 100, 50);
            muur(g, 404, 101, 100, 50);
            muur(g, 50, 152, 100, 50);
            muur(g, 151, 152, 100, 50);
            muur(g, 252, 152, 100, 50);
            muur(g, 353, 152, 100, 50);
            muur(g, 0, 203, 100, 50);
            muur(g, 101, 203, 100, 50);
            muur(g, 202, 203, 100, 50);
            muur(g, 303, 203, 100, 50);
            muur(g, 404, 203, 100, 50);
            muur(g, 50, 254, 100, 50);
            muur(g, 151, 254, 100, 50);
            muur(g, 252, 254, 100, 50);
            muur(g, 353, 254, 100, 50);
        }
        if(grijs){
            g.setColor(Color.gray);
            muur(g, 50, 50, 120, 60);
            muur(g, 171, 50, 120, 60);
            muur(g, 292, 50, 120, 60);
            muur(g, 413, 50, 120, 60);
            muur(g, 0, 111, 120, 60);
            muur(g, 121, 111, 120, 60);
            muur(g, 242, 111, 120, 60);
            muur(g, 363, 111, 120, 60);
            muur(g, 484, 111, 120, 60);
            muur(g, 50, 172, 120, 60);
            muur(g, 171, 172, 120, 60);
            muur(g, 292, 172, 120, 60);
            muur(g, 413, 172, 120, 60);
            muur(g, 0, 233, 120, 60);
            muur(g, 121, 233, 120, 60);
            muur(g, 242, 233, 120, 60);
            muur(g, 363, 233, 120, 60);
            muur(g, 484, 233, 120, 60);
            muur(g, 50, 294, 120, 60);
            muur(g, 171, 294, 120, 60);
            muur(g, 292, 294, 120, 60);
            muur(g, 413, 294, 120, 60);
        }
    }

    public class BaksteenknopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            rood = true;
            grijs = false;
            repaint();
        }
    }

    public class BetonknopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            rood = false;
            grijs = true;
            repaint();
        }
    }

    public class ResetknopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            rood = false;
            grijs = false;
            repaint();
        }
    }

    void muur(Graphics g, int x1, int y1, int width, int height){
            g.fillRect(x1, y1, width, height);
    }
}