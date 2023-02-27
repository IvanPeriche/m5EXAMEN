import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlanetaTest {    

    @Test 
    public void testPlanetaEnano()
    {     
        String nom = "saturno";
        int diametre = 1100;
        int pes = 2000;
        Planeta saturno = new Planeta(nom, diametre, pes);
        assertEquals(1, saturno.planetaEnano());
        Planeta venus = new Planeta("venus", 1800, 4000);
        assertEquals(0, venus.planetaEnano());
    }    


    @Test 
    public void testExpansio()
    {
        String nom = "jupiter";
        int diametre = 2000;
        int pes = 7500;
        Planeta jupiter = new Planeta(nom, diametre, pes);
        assertEquals (6000, jupiter.expansio);

    }

    @Test 
    public void testColisio()
    {        

        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);              

    }    
}
