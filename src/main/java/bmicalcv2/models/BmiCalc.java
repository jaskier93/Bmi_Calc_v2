package bmicalcv2.models;

import java.text.DecimalFormat;

public class BmiCalc {

    private double height;
    private double weight;

    public BmiCalc(double height, double weight) {
        this.weight = weight;
        this.height = height;
    }

    DecimalFormat df = new DecimalFormat("#.###");

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    public double getBmi() {
        return (double) (weight / (0.0001 * height * height));
    }

    public String getBmiDescription() {

        double bmi = (weight / (0.0001 * height * height));
        String description = "";
        if (bmi < 16) {
            description = "Jesteś wygłodzony! Twój indeks BMI wynosi jedynie: " + df.format(bmi);
        }
        if (bmi < 17 && bmi >= 16) {
            description = "Jesteś wychudzony! Twój indeks BMI wynosi jedynie: " + df.format(bmi);
        }
        if (bmi < 18.5 && bmi >= 17) {
            description = "Zacznij jeść, jesteś niedożywiony! Twój indeks BMI wynosi jedynie: " + df.format(bmi);
        }
        if (bmi >= 18.5 && bmi < 25) {
            description = "Twoja waga jest w normie, a Twój indeks BMI wynosi: " + df.format(bmi);
        }
        if (bmi < 30 && bmi >= 25) {
            description = "Masz delikatną nadwagę. Twój indeks BMI wynosi: " + df.format(bmi);
        }
        if (bmi < 35 && bmi >= 30) {
            description = "Masz otyłość pierwszego stopnia! Twój indeks BMI wynosi: " + df.format(bmi);
        }""
        if (bmi < 40 && bmi >= 35) {
            description = "Masz otyłość drugiego stopnia! Twój indeks BMI wynosi: " + df.format(bmi);
        }
        if (bmi >= 40) {
            description = "Masz ogromną nadwagę, zrób coś z tym! Twój indeks BMI wynosi: " + df.format(bmi);
        }
        return description;
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


}
