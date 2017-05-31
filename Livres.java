
import java.util.*;

/**
 * 
 */
public class Livres extends Document {

    /**
     * Default constructor
     */
    

    /**
     * 
     */
    protected String auteur;

    public Livres(int nuEnr, String titre, String auteur, int nbPages) {
		super(nuEnr, titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}

	/**
     * 
     */
    protected int nbPages;
    public String toString(){
    	return "Livre a pour numéro: "+this.nuEnr+" comme titre "+this.titre+" écrite par "+this.auteur+" contient "+this.nbPages+" pages.";
    }
}