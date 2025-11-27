package animation;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {

    private final List<EtapeScenario> etapes = new ArrayList<>();

    
    public void ajouterEffet(Effet effet, int repetitions) {
        if (repetitions <= 0) {
            throw new IllegalArgumentException("Le nombre de répétitions doit être > 0");
        }
        etapes.add(new EtapeScenario(effet, repetitions));
    }

    public void jouer(Bandeau bandeau) {
        for (EtapeScenario etape : etapes) {
            for (int i = 0; i < etape.getRepetitions(); i++) {
                etape.getEffet().appliquer(bandeau);
            }
        }
    }
}
