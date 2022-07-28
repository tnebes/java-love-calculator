package hr.tnebes.test;

import hr.tnebes.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void CalculationForMartaManuelReturns91() {
        Main main = new Main("Marta", "Manuel");
        Assertions.assertEquals(main.calculateLove(), "91%");
    }

}