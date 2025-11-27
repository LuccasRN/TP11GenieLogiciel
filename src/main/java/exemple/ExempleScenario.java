package exemple;

import animation.Scenario;
import animation.effets.ClignotantEffet;
import animation.effets.RotationEffet;
import animation.effets.TeletypeEffet;
import animation.effets.ZoomEffet;
import bandeau.Bandeau;

public class ExempleScenario {

    public static void main(String[] args) {
        new ExempleScenario().demo();
    }

    public void demo() {
        Bandeau bandeau = new Bandeau();
        bandeau.setMessage("Préparation du scénario...");
        bandeau.sleep(1000);

        Scenario scenario = new Scenario();

        scenario.ajouterEffet(new TeletypeEffet("Bienvenue sur le bandeau !", 100), 1);
        scenario.ajouterEffet(new ClignotantEffet("Ça clignote !", 5), 3);
        scenario.ajouterEffet(new ZoomEffet("Zoom sur le texte !"), 1);
        scenario.ajouterEffet(new RotationEffet("Rotation du texte !"), 2);

        scenario.jouer(bandeau);

        bandeau.setMessage("Terminé !");
        bandeau.sleep(2000);
        bandeau.close();
    }
}
