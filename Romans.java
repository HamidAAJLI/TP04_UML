
import java.util.*;

/**
 * 
 */
public class Romans extends Livres {

    /**
     * Default constructor
     */

    public Romans(int nuEnr, String titre, String auteur, int nbPages, String prixLittr) {
		super(nuEnr, titre, auteur, nbPages);
		this.prixLittr = prixLittr;
	}

	/**
     * 
     */
    private String prixLittr;
    
    
    public String toString(){
    	return "Roman a pour numéro: "+this.nuEnr+" comme titre "+this.titre+" écrite par "+this.auteur+" contient "+this.nbPages+" pages. Il a gangé comme prix "+this.prixLittr+".";
    }
}