package Effet;

import bandeau.Bandeau;

import java.awt.*;

public class Clignotant implements Effet {

    private int delay;

    public Clignotant(int delay) {
        this.delay = delay;
    }

    @Override
    public void jouer(Bandeau b) {
        b.setMessage("Je clignote");
        Color base = b.getForeground();

        for (int i = 0; i < 5; i++) {  // 5 clignotements
            b.setForeground(base);
            b.sleep(delay);
            b.setForeground(Color.WHITE);
            b.sleep(delay);
        }

        b.setForeground(base);
    }
}
