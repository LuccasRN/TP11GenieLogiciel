package animation.effets;

import animation.Effet;
import bandeau.Bandeau;

import java.awt.Color;

public class ClignotantEffet implements Effet {

    private final String message;
    private final int nbClignotements;

    public ClignotantEffet(String message, int nbClignotements) {
        this.message = message;
        this.nbClignotements = nbClignotements;
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        bandeau.setMessage(message);
        Color fore = bandeau.getForeground();

        for (int i = 0; i < nbClignotements; i++) {
            bandeau.setForeground(fore);
            bandeau.sleep(200);
            bandeau.setForeground(bandeau.getBackground());
            bandeau.sleep(200);
        }

        bandeau.setForeground(fore);
        bandeau.sleep(500);
    }
}
