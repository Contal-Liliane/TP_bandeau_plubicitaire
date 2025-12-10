package Effet;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom implements Effet {

    @Override
    public void jouer(Bandeau b) {

        for (int i = 5; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, i));
            b.sleep(100);
        }

        // Retour à la taille normale
        b.setFont(new Font("Dialog", Font.PLAIN, 20));
    }
}
