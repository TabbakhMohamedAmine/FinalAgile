package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Equipe;
import Model.Footballeur;

class EquipeTests {

    public EquipeTests(){}
    
    @Test
    public void test_add_equipe(){
        Equipe e = new Equipe();
        Footballeur f = new Footballeur("Amine");
        e.addFootballeur(f);
        assertEquals(e.getSize(),1);
    }
    
    @Test
    public void testverifyDifference(){
        Equipe e = new Equipe();
        Footballeur f1 = new Footballeur("Amine");
        Footballeur f2 = new Footballeur("Romain");
        e.addFootballeur(f1);
        e.addFootballeur(f2);;
        assertEquals(e.verifyDifference(),2);
    }
    
    @BeforeEach
    public void setUp(){}

    @AfterEach
    public void tearDown(){}

}
