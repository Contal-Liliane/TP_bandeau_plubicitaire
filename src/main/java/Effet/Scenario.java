package Effet;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {

    private final ArrayList<EtapeEffet> etapes = new ArrayList<>();

    public void ajouterEffet(Effet e, int repetitions) {
        etapes.add(new EtapeEffet(e, repetitions));
    }

    public void jouer(Bandeau b) {
        for (EtapeEffet etape : etapes) {
            for (int i = 0; i < etape.repetitions; i++) {
                etape.effet.jouer(b);
            }
        }
    }
}
