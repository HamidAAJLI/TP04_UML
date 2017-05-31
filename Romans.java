
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
    	return "Roman a pour num�ro: "+this.nuEnr+" comme titre "+this.titre+" �crite par "+this.auteur+" contient "+this.nbPages+" pages. Il a gang� comme prix "+this.prixLittr+".";
    }
}