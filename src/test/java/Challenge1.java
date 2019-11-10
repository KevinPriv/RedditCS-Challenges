import me.kbrewster.challenge1.Quadratic;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Challenge1 {
    @Test
    public void test1() {
        Quadratic quad1 = new Quadratic(1, 2, 3);
        assertEquals("x^2+2x+3=0", quad1.toString());
    }

    @Test
    public void test2() {
        Quadratic quad1 = new Quadratic(-3, 4, -10);
        assertEquals("-3x^2+4x-10=0", quad1.toString());
    }


    @Test
    public void test3() {
        Quadratic quad1 = new Quadratic(-1, 0, 1);
        assertEquals("-x^2+1=0", quad1.toString());
    }

}
