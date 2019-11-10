
import me.kbrewster.challenge3.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Challenge3 {
    @Test
    public void test1() {
        Polynomial polynomial = new Polynomial(new int[]{-3, 4});
        assertEquals("-3x+4=0", polynomial.toString());
    }

    @Test
    public void test2() {
        Polynomial polynomial = new Polynomial(new int[]{8, -6, -1, 1, -5, 2});
        assertEquals("8x^5-6x^4-x^3+x^2-5x+2=0", polynomial.toString());
    }


    @Test
    public void test3() {
        Polynomial polynomial = new Polynomial(new int[]{1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 8, 3});
        assertEquals("x^11-x^7+8x+3=0", polynomial.toString());
    }

}
