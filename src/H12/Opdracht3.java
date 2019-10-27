package H12;

import javachallenge.Opdracht2;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    TextField [] tekstvak;
    int[] cijfers;
    Button knop;

    @Override
    public void init() {
        setSize(600, 400);

        tekstvak = new TextField[5];
        cijfers = new int[5];
        knop = new Button("sort");
        add(knop);
        knop.addActionListener( new knopActionListener());
        for (int i = 0; i <tekstvak.length; i++) {
            tekstvak[i] = new TextField ("",10);
            add(tekstvak[i]);
        }
    }
    public class knopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i <tekstvak.length; i++) {
                String s = tekstvak[i].getText();
                int input = Integer.parseInt(s);
                cijfers[i] = input;
            }
            Arrays.sort(cijfers);
            for (int i = 0; i <cijfers.length ; i++) {
                tekstvak[i].setText(String.valueOf(cijfers[i]));
            }
        }
    }
}