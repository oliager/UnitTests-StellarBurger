
import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;
import java.util.List;

import static org.junit.Assert.*;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class DatabaseTest {

    @Test
    public void testAvailableBunsShouldNotBeEmpty(){
        Database database = new Database();
        List<Bun> actualBuns = database.availableBuns();

        assertFalse(actualBuns.isEmpty());
    }
    @Test
    public void testAvailableBunsReturnsThreeBuns(){
        Database database = new Database();
        List<Bun> actualBuns = database.availableBuns();

        Assert.assertEquals(3, actualBuns.size());
    }
    @Test
    public void testAvailableBunsShouldContainCorrectFirstBun(){
        Database database = new Database();
        List<Bun> actualBuns = database.availableBuns();

        Assert.assertEquals("black bun", actualBuns.get(0).name);
        Assert.assertEquals(100, actualBuns.get(0).price, 0.001f);
    }
    @Test
    public void testAvailableBunsShouldContainCorrectSecondBun(){
        Database database = new Database();
        List<Bun> actualBuns = database.availableBuns();

        Assert.assertEquals("white bun", actualBuns.get(1).name);
        Assert.assertEquals(200, actualBuns.get(1).price, 0.001f);
    }

    @Test
    public void testAvailableBunsShouldContainCorrectThirdBun(){
        Database database = new Database();
        List<Bun> actualBuns = database.availableBuns();

        Assert.assertEquals("red bun", actualBuns.get(2).name);
        Assert.assertEquals(300, actualBuns.get(2).price, 0.001f);
    }

    @Test
    public void testAvailableBunsShouldBunsHavePriceMoreThan0() {
        Database database = new Database();
        List<Bun> actualBuns = database.availableBuns();
        assertTrue(actualBuns.stream().allMatch(bun -> bun.getPrice() > 0 ));
    }

    @Test
    public void testAvailableIngredientsShouldNotBeEmpty(){
        Database database = new Database();
        List<Ingredient> actualIngredients = database.availableIngredients();

        assertTrue(!(actualIngredients.isEmpty()));
    }
    @Test
    public void testAvailableIngredientsReturnsSixIngredients(){
        Database database = new Database();
        List<Ingredient> actualIngredients = database.availableIngredients();

        Assert.assertEquals(6, actualIngredients.size());
    }
    @Test
    public void testAvailableIngredientsShouldHaveSauceIngredients(){
        Database database = new Database();
        List<Ingredient> actualIngredients = database.availableIngredients();

        assertTrue(actualIngredients.stream().anyMatch(ingredient -> ingredient.getType() == SAUCE));
    }

    @Test
    public void testAvailableIngredientsShouldHaveFillingIngredients(){
        Database database = new Database();
        List<Ingredient> actualIngredients = database.availableIngredients();

        assertTrue(actualIngredients.stream().anyMatch(ingredient -> ingredient.getType() == FILLING));
    }

    @Test
    public void testAvailableIngredientsShouldHaveMoreThan0Price(){
        Database database = new Database();
        List<Ingredient> actualIngredients = database.availableIngredients();

        assertTrue(actualIngredients.stream().allMatch(ingredient -> ingredient.getPrice() > 0) );
    }
}
