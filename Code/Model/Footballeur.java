package Model;

public class Footballeur {
    private int nombreStrategies;
    private int strategiesUtilises;
    private Equipe equipe;
    private String nom;

    public Footballeur(String nom) {
        nombreStrategies = 6;
        strategiesUtilises = 5;
        this.nom=nom;
    }

    public int getNombreStrategies() {
        return this.nombreStrategies;
    }

    public int getStrategiesUtilises() {
        return this.strategiesUtilises;
    }

    public int difference() {
        return this.nombreStrategies - this.strategiesUtilises;
    }

    protected void addEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    public String getNom() {
    	return this.nom;
    }
}

