
package animation.effets;

import animation.Effet;
import bandeau.Bandeau;

import java.awt.Font;

public class ZoomEffet implements Effet {

    private final String message;

    public ZoomEffet(String message) {
        this.message = message;
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        Font base = bandeau.getFont();
        bandeau.setMessage(message);
        for (int i = 5; i <= 60; i += 5) {
            bandeau.setFont(new Font(base.getName(), base.getStyle(), i));
            bandeau.sleep(100);
        }
        bandeau.setFont(base);
        bandeau.sleep(500);
    }
}
