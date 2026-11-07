public class Lasagna {
    private static final int EXPECTED_MINUTES = 40;
    private static final int TOTAL_LAYERS = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES;
    }
    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven()-actualMinutes;
    }
    public int preparationTimeInMinutes(int layer) {
        return layer * TOTAL_LAYERS;
    }
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
