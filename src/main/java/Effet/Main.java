package Effet;

import bandeau.Bandeau;

public class Main {

    public static void main(String[] args) {

        Bandeau b = new Bandeau();
        b.setMessage("Animation du scénario...");

        Scenario scenario = new Scenario();

        // 1. Clignoter 5 fois (et dire "Je clignote")
        scenario.ajouterEffet(new Clignotant(200), 1);

        // 2. Rotation 2 fois
        scenario.ajouterEffet(new Rotation(), 2);

        // 3. Arc-en-ciel
        scenario.ajouterEffet(new ArcEnCiel(), 1);

        // 4. Zoom après, comme demandé
        scenario.ajouterEffet(new Zoom(), 1);

        // Jouer le scénario
        scenario.jouer(b);

        b.setMessage("Terminé !");
        b.sleep(2000);
        b.close();
    }
}
