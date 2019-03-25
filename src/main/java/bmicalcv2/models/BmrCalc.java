package bmicalcv2.models;

import java.text.DecimalFormat;

public class BmrCalc {

    private double height;
    private double weight;
    private int age;
    private String gender;
    private String activity;

    public BmrCalc() {
    }

    public String getBmrDescription() {

        String bmrResult = "";
        double bmr = 9.99 * weight + ((6.25 * height) - (4.92 * age));

        if (gender.equals("male")) {
            bmr += 5;
        } else {
            bmr -= 161;
        }
        DecimalFormat df = new DecimalFormat("#.###");

        switch (activity) {
            case "lazy":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + df.format(1.2 * bmr) + " kalorii";
                break;

            case "low":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + df.format(1.3 * bmr) + " - " + df.format(1.4 * bmr) + " kalorii";
                break;

            case "regular":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + df.format(1.5 * bmr) + " - " + df.format(1.6 * bmr) + " kalorii";
                break;

            case "sport":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + df.format(1.7 * bmr) + " - " + df.format(1.8 * bmr) + " kalorii";
                break;

            case "pro":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + df.format(1.9 * bmr) + " - " + df.format(2.2 * bmr) + " kalorii";
                break;

            default:
                bmrResult = "Podałeś niepoprawne dane, nie można obliczyć wartości zapotrzebowania kalorycznego!";

                // return bmrResult;

        }
        return bmrResult;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public BmrCalc(double height, double weight, int age, String gender, String activity) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.activity = activity;
    }

}