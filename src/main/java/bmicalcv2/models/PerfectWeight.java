package bmicalcv2.models;

import java.text.DecimalFormat;

public class PerfectWeight {
    private double height;
    private double weight;
    DecimalFormat df = new DecimalFormat("#.###");

    public String getPerfectWeight() {
        return "Idealna waga dla Twojego wzrostu (" + height + " cm) wynosi: " +
                df.format((0.0001 * height * height * 18.5)) + "kg - " + df.format((0.0001 * height * height * 25)) + "kg";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public PerfectWeight(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
}
