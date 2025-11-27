package animation;

public class EtapeScenario {
    private final Effet effet;
    private final int repetitions;

    public EtapeScenario(Effet effet, int repetitions) {
        this.effet = effet;
        this.repetitions = repetitions;
    }

    public Effet getEffet() {
        return effet;
    }

    public int getRepetitions() {
        return repetitions;
    }
}
