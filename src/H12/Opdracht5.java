package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht5 extends Applet {
    Button knopOK;
    TextField tekstvak;
    Label label;
    String s, tekst;
    int[] getalen = {5, 10, 15, 20};


    public void init() {
        setSize(500, 400);
        knopOK = new Button("OK");
        knopOK.addActionListener(new OkKnopActionListener());
        tekstvak = new TextField("", 20);
        label = new Label("Type een nummer en druk op enter");
        tekst = "";
        add(label);
        add(tekstvak);
        add(knopOK);
    }

    public void paint(Graphics g) {

        g.drawString(tekst, 50, 60);
    }

    public class OkKnopActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < getalen.length; i++) {
                getalen[0] = 5;
                getalen[1] = 10;
                getalen[2] = 15;
                getalen[3] = 20;
                s = tekstvak.getText();
                int cijfer = Integer.parseInt(s);
                if (cijfer == getalen[0]) {
                    tekst = "het gatal is:" + cijfer + " en de index is 0";

                } else if (cijfer == getalen[1]) {
                    tekst = "het gatal is:" + cijfer + " en de index is 1";

                } else if (cijfer == getalen[2]) {
                    tekst = "het gatal is:" + cijfer + " en de index is 2";
                    break;
                } else if (cijfer == getalen[3]) {
                    tekst = "het gatal is:" + cijfer + " en de index is 3";
                    break;
                } else if (cijfer == getalen[4]) {
                    tekst = "het gatal is:" + cijfer + " en de index is 4";
                    break;
                } else {
                    tekst = "U nee";
                }
                repaint();


            }
        }
    }
}