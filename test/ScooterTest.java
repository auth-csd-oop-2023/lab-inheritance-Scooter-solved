import org.junit.*;

import static org.junit.Assert.assertEquals;


public class ScooterTest {

    public ScooterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testGetPollutionScore() {
        System.out.println("getPollutionScore");
        Scooter instance = new Scooter(500, 2000);
        double expResult = 342.46;
        double result = instance.getPollutionScore();
        assertEquals(expResult, result, 0.1);
        instance = new Scooter(400, 2005);
        expResult = 273.97;
        result = instance.getPollutionScore();
        assertEquals(expResult, result, 0.1);
    }

    @Test
    public void testGetTaxes() {
        System.out.println("getTaxes");
        Scooter instance = new Scooter(500, 2000);
        double expResult = 225;
        double result = instance.getTaxes();
        assertEquals(expResult, result, 0.1);
        instance = new Scooter(400, 2005);
        expResult = 162.5;
        result = instance.getTaxes();
        assertEquals(expResult, result, 0.1);
    }

}
