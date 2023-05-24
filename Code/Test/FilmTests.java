package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Cinema;
import Model.Film;

class FilmTests {

    protected Film f;
    protected Cinema c;

 
    public FilmTests(){}

    @BeforeEach
    public void setUp() {
        f= new Film("Lock, stock and two smoking barrels", "Guy Ritchie");
        c = new Cinema("UGC");
    }
    
    @Test
    public void setTitreTest(){
        f.setTitre("Shrek");
        assertEquals("Shrek", f.getTitre());
    }

    @Test
    public void setRealTest() {
        f.setRealisateur("Andrew Adamson");
        assertEquals("Andrew Adamson", f.getRealisateur());
    }
    

    @Test
    public void getTitreTest() {
        assertEquals("Lock, stock and two smoking barrels", f.getTitre());
    }
    

    @Test
    public void getRealTest() {
        assertEquals("Guy Ritchie", f.getRealisateur());
    }
    
    @Test
    public void addCinemaTest()
    {
        assertEquals(f.getListeCinemas().size(), 0);
        c.addFilm(f);
        assertEquals(f.getListeCinemas().size(), 1);
    }
    
    @AfterEach
    public void tearDown() {}

}
