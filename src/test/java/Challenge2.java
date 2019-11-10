import me.kbrewster.challenge2.Quadratic;
import me.kbrewster.challenge2.Quadroot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Challenge2 {
    @Test
    public void test1() {
        Quadratic quad1 = new Quadroot(6, 9).getQuadratic();
        assertEquals("x^2-15x+54=0", quad1.toString());
    }

    @Test
    public void test2() {
        Quadratic quad1 = new Quadroot(-80,0).getQuadratic();
        assertEquals("x^2+80x=0", quad1.toString());
    }


    @Test
    public void test3() {
        Quadratic quad1 = new Quadroot(7,-7).getQuadratic();
        assertEquals("x^2-49=0", quad1.toString());
    }

}
