import org.junit.*;

import static org.junit.Assert.assertEquals;


public class ElectricalScooterTest {

    public ElectricalScooterTest() {
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
        ElectricalScooter c = new ElectricalScooter(300, 2015, 150);
        double expResult = 123.28;
        double result = c.getPollutionScore();
        assertEquals(expResult, result, 0.1);
        c = new ElectricalScooter(100, 2018, 50);
        expResult = 41.09;
        result = c.getPollutionScore();
        assertEquals(expResult, result, 0.1);
    }


    @Test
    public void testInheritance() {
        boolean expResult = true;
        ElectricalScooter c = new ElectricalScooter(10, 20, 30);
        boolean result = (c instanceof Scooter);
        assertEquals(expResult, result);
    }


    @Test
    public void testGetTaxes() {
        System.out.println("getTaxes");
        ElectricalScooter c = new ElectricalScooter(300, 2015, 150);
        Scooter s = new Scooter(300,2015);
        double expResult = s.getTaxes() * 0.8;
        double result = c.getTaxes();
        assertEquals(expResult, result, 0.1);
        c = new ElectricalScooter(100, 2017, 50);
        s = new Scooter(50,2017);
        expResult = s.getTaxes() * 0.8;
        result = c.getTaxes();
        assertEquals(expResult, result, 0.1);
    }


}
