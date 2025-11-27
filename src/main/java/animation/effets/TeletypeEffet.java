package animation.effets;

import animation.Effet;
import bandeau.Bandeau;

public class TeletypeEffet implements Effet {

    private final String message;
    private final int delay;

    public TeletypeEffet(String message, int delayMillis) {
        this.message = message;
        this.delay = delayMillis;
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        StringBuilder courant = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            courant.append(message.charAt(i));
            bandeau.setMessage(courant.toString());
            bandeau.sleep(delay);
        }
        bandeau.sleep(500);
    }
}

