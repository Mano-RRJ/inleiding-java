package H08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    Button OkKnop;
    Button ResetKnop;
    Label label;
    TextField tekstvak;
    String s;
    double getal;
    double btwbedrag = 1.21;


    public void init() {

        OkKnop = new Button("OK");
        ResetKnop = new Button("Reset");
        label = new Label("type hier");
        tekstvak = new TextField("", 30);
        add(tekstvak);
        add(OkKnop);
        add(ResetKnop);
        add(label);
        OkKnop.addActionListener(new OkKnopActionListener());
        ResetKnop.addActionListener(new ResetKnopActionListener());

    }

    public void paint(Graphics g) {
        g.drawString("" + (getal*btwbedrag), 150, 75);
    }

    class OkKnopActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            label.setText(s);
            getal = Double.parseDouble(s);
            repaint();

        }
    }

    class ResetKnopActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            label.setText("");
            repaint();

        }
    }
}