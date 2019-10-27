package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    TextField tekstvak;
    Button knop;
    String s, tekst;
    int[] getallen = { 5, 10, 15, 20};

    @Override
    public void init() {
        setSize(600, 400);
        tekstvak = new TextField("",25);
        knop = new Button("Ok");
        knop.addActionListener(new knopActionListener());
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 20,50);
    }
    public class knopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i <getallen.length; i++) {
                getallen[0] = 5;
                getallen[1] = 10;
                getallen[2] = 15;
                getallen[3] = 20;
                s = tekstvak.getText();
                int cijfer = Integer.parseInt(s);
                if(cijfer == getallen[0]){
                    tekst = "het getal is " + cijfer + "en de index is 0";
                }
                else if (cijfer == getallen[1]){
                    tekst = "het getal is " + cijfer + "en de index is 1";
                } else if (cijfer == getallen[2]){
                    tekst = "het getal is " + cijfer + "en de index is 2";
                } else if (cijfer == getallen[3]){
                    tekst = "het getal is " + cijfer + "en de index is 3";
                }
                else {
                    tekst = "de waarde is niet gevonden";
                }
            }
            repaint();

        }
    }
}