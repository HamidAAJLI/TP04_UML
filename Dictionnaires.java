
import java.util.*;

/**
 * 
 */
public class Dictionnaires extends Document {

    /**
     * Default constructor
     */


	public Dictionnaires(int nuEnr, String titre, String langue) {
		super(nuEnr, titre);
		this.langue = langue;
	}

	/**
     * 
     */
    private String langue;
    
    public String toString(){
    	return "Dictionnaires a pour numéro: "+this.nuEnr+" comme titre "+this.titre+" pour la langue "+this.langue+".";
    }
}