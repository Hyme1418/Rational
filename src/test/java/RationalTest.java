import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract() throws Rational.Illegal {
        Rational x = new Rational(3, 4);
        Rational y = new Rational(1, 4);
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 3);
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 3);
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test(expected = Rational.Illegal.class)
    public void testDivideByZero() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(0, 1);
        x.divide(y);
    }

    @Test
    public void testEquals() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 4);
        Assert.assertTrue(x.equals(y));
    }

    @Test
    public void testCompareTo() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 3);
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Assert.assertEquals("1/2", x.toString());
    }

    @Test
    public void testSimplestForm() throws Rational.Illegal {
        Rational x = new Rational(4, 8);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }
}
