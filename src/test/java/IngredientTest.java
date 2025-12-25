import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {
    private final static String SAUCE_NAME = "ketchup";
    private final static float SAUCE_PRICE = 1.4f;
    private final static String FILLING_NAME = "fish";
    private final static float FILLING_PRICE = 1.4f;
    private final static float DELTA = 0.0001f;

    @Test
    public void testGetPriceReturnsPrice(){
        Ingredient ingredient = new Ingredient(SAUCE, SAUCE_NAME, SAUCE_PRICE);
        float actualPrice = ingredient.getPrice();

        assertEquals(SAUCE_PRICE, actualPrice, DELTA);
    }
    @Test
    public void testGetPriceReturnsNegativeWhenPriceIsNegative(){
        Ingredient ingredient = new Ingredient(SAUCE, SAUCE_NAME, -1f);
        float actualPrice = ingredient.getPrice();

        assertEquals(-1f, actualPrice, DELTA);
    }

    @Test
    public void testGetPriceReturns0WhenPriceIs0(){
        Ingredient ingredient = new Ingredient(SAUCE, SAUCE_NAME, 0);
        float actualPrice = ingredient.getPrice();

        assertEquals(0, actualPrice, DELTA);
    }
    @Test
    public void testGetNameReturnsNameOfIngredient(){
        Ingredient ingredient = new Ingredient(SAUCE, SAUCE_NAME, SAUCE_PRICE);
        String actualName = ingredient.getName();

        assertEquals(SAUCE_NAME, actualName);
    }
    @Test
    public void testGetNameReturnsNullWhenNameOfIngredientIsNull(){
        Ingredient ingredient = new Ingredient(SAUCE, null, SAUCE_PRICE);

        Assert.assertNull(ingredient.getName());
    }

    @Test
    public void testGetTypeReturnsSauceWhenTypeIsSauce(){
        Ingredient ingredient = new Ingredient(SAUCE, SAUCE_NAME, SAUCE_PRICE);

        Assert.assertEquals(SAUCE, ingredient.getType());
    }

    @Test
    public void testGetTypeReturnsFillingWhenTypeIsFilling(){
        Ingredient ingredient = new Ingredient(FILLING, FILLING_NAME, FILLING_PRICE);

        Assert.assertEquals(FILLING, ingredient.getType());
    }
}
