public enum Seasons {
    SPRING ()
    SUMMER ()
    AUTUMN ()
    WINTER ()

    private final double temp;
    private final double rain;
    private final double sun;
    Seasons(double temp, double rain, double sun) {
        this.temp = temp;
        this.rain = rain;
        this.sun = sun;
    }

    public double getTemp() {
        return temp;
    }

    public double getRain() {
        return rain;
    }

    public double getSun() {
        return sun;
    }
}