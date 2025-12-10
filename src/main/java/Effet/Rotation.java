package Effet;

import bandeau.Bandeau;

public class Rotation implements Effet {

    @Override
    public void jouer(Bandeau b) {
        for (int i = 0; i < 360; i += 10) {
            b.setMessage("Je tourne");
            b.setRotation(Math.toRadians(i));
            b.sleep(20);
        }
        b.setRotation(0);
    }
}
