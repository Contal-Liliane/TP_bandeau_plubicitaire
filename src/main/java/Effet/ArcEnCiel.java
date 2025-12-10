package Effet;

import bandeau.Bandeau;

import java.awt.*;

public class ArcEnCiel implements Effet {

    @Override
    public void jouer(Bandeau b) {
        Color[] couleurs = {
                Color.RED, Color.ORANGE, Color.YELLOW,
                Color.GREEN, Color.BLUE, new Color(75,0,130),
                new Color(148,0,211)
        };

        for (Color c : couleurs) {
            b.setForeground(c);
            b.setMessage("Arc-en-ciel !");
            b.sleep(500);
        }
    }
}
