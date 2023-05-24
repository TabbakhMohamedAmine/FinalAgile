package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Footballeur;

class FootballeurTests {

    public FootballeurTests(){}
    
    @Test
    public void testDifference(){
        Footballeur testeur = new Footballeur("Romain");
        assertEquals(testeur.difference(),1);
    }
     @Test
    public void testGetgetnombrestrategies(){
        Footballeur testeur = new Footballeur("Amine");
        assertEquals(testeur.getNombreStrategies(),6);
    }
     @Test
    public void testGetgetstrategiesutilises(){
        Footballeur testeur = new Footballeur("Edouard");
        assertEquals(testeur.getStrategiesUtilises(),5);
    }

    @BeforeEach
    public void setUp(){}

    @AfterEach
    public void tearDown(){}

}
