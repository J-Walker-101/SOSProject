import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class simpleCalcTest {

    @Test
   public void twoPlusTwoShouldEqualFour(){
        var calc = new Main();
        assertEquals( 4, calc.add(2, 2));
    }

    @Test
    public void twoMinusOneShouldEqualOne() {
        var calc = new Main();
        assertEquals(1, calc.subtract(2, 1));
    }
}
