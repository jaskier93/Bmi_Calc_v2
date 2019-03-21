package bmicalcv2.controller;

import bmicalcv2.models.BmiCalc;
import bmicalcv2.models.BmrCalc;
import bmicalcv2.models.PerfectWeight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    private double weight;
    private double height;

    @GetMapping("/bmicalculate")
    public String getBmr(@RequestParam double height, @RequestParam double weight, ModelMap map, @RequestParam int age,
                         @RequestParam String activity, @RequestParam(value = "gender") String gender) {


        BmiCalc bmiCalc = new BmiCalc(weight, height);
        PerfectWeight perfectWeight = new PerfectWeight(height, weight);
        map.put("description", (bmiCalc.getBmiDescription()));
        map.put("perfectWeight", perfectWeight.getPerfectWeight());
        BmrCalc bmrCalc = new BmrCalc(height, weight, age, gender, activity);
        map.put("bmr", (bmrCalc.getBmrDescription()));
        return "bmicalculate";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

}

