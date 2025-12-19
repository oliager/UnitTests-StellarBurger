
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.*;

public class BunTest {

    private final static float PRICE_BUN = 2.78f;

    private final static String NAME_BUN = "black bun";


    @Test
    public void testGetNameReturnsBunName(){
        Bun bun = new Bun(NAME_BUN,PRICE_BUN);
        String actualName = bun.getName();

        assertEquals(NAME_BUN, actualName);

    }
    @Test
    public void testGetNameReturnsNullWhenBunNameNull(){
        Bun bun = new Bun(null,PRICE_BUN);
        assertNull(bun.getName());
    }
    @Test
    public void testGetPriceReturnsBunPrice(){
        Bun bun = new Bun(NAME_BUN,PRICE_BUN);
        float actualPrice = bun.getPrice();

        assertEquals(PRICE_BUN, actualPrice, 0.0001f);
    }
    @Test
    public void testGetPriceReturnsNegativePriceWhenPriceIsNegative(){
        Bun bun = new Bun(NAME_BUN, -1f);
        float actualPrice = bun.getPrice();

        assertEquals(-1f, actualPrice, 0.0001f);
    }
    @Test
    public void testGetPriceReturns0PriceWhenPriceIs0(){
        Bun bun = new Bun(NAME_BUN, 0f);
        float actualPrice = bun.getPrice();

        assertEquals(0f, actualPrice, 0.0001f);
    }
}
