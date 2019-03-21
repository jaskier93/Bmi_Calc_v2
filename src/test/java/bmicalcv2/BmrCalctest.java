package bmicalcv2;

import bmicalcv2.models.BmrCalc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BmrCalctest {
@Test
    public void testGetBmr(){
    BmrCalc bmrCalc = new BmrCalc(178,85,26, "male", "lazy");

     assertEquals(("Twoje zapotrzebowanie kaloryczne wynosi: 2206,476 kalorii"),
             bmrCalc.getBmrDescription());
    }
}
