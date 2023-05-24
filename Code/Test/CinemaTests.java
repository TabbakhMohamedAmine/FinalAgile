package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Cinema;
import Model.Film;

class CinemaTests {
	
	 protected Cinema c1;
	 protected Film f1;
	 protected Film f2;
	    
	   
	 public CinemaTests() {}

	 @BeforeEach
	 public void setUp(){
	    c1 = new Cinema("UGC");
	    Film f1 = new Film("How the Grinch stole Christmas", "Ron Howard");
	    Film f2= new Film("Lock, stock and two smoking barrels", "Guy Ritchie");
	    c1.addFilm(f1);
	    c1.addFilm(f2);
	  }

	  @Test
	  public void fixtureTest(){
	     assertEquals(2, c1.nbFilms());
	     Film film1 = new Film("Roman holiday", "William Wyler");
	     c1.addFilm(film1);
	     assertEquals(3, c1.nbFilms());
	   }
}
