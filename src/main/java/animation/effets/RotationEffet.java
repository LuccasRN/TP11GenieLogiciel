package animation.effets;

import animation.Effet;
import bandeau.Bandeau;

public class RotationEffet implements Effet {

    private final String message;

    public RotationEffet(String message) {
        this.message = message;
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        bandeau.setMessage(message);
        for (int i = 0; i <= 360; i += 15) {
            bandeau.setRotation(Math.toRadians(i));
            bandeau.sleep(50);
        }
        bandeau.setRotation(0.0);
        bandeau.sleep(500);
    }
}
