package H12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdracht2 extends Applet {
    Button [] knoppie;

    @Override
    public void init() {
        knoppie = new Button [25];
        for (int i = 0; i <knoppie.length; i++) {
            knoppie[i] = new Button ("" +i);
            add(knoppie[i]);
        }
    }
}