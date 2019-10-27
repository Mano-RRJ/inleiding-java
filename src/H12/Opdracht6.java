package H12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet{
    TextField textField;
    Button knopOK;
    String tekst;
    int[] getallen = {5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7};
    int aantal;

    public void init() {
        setSize(500, 300);
        textField = new TextField(20);
        knopOK = new Button("OK");
        knopOK.addActionListener(new OkKnopActionListener());
        add(textField);
        add(knopOK);
        tekst = "";
    }

    @Override
    public void paint(Graphics g) {

        g.drawString(tekst, 50, 60);
    }
    public class OkKnopActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            aantal = 0;
            tekst = "De waarde is niet gevonden.";
            String s = textField.getText();
            int input = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
                int getal = getallen[i];
                if (input == getal){
                    aantal++;
                }
            }

            if (aantal > 0) {
                tekst = "De waarde is " + aantal + " keer gevonden.";
            }


            repaint();





        }

    }
}
