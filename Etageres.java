
import java.awt.List;
import java.util.*;

public class Etageres {
	
	private int nbMax;
	 private int nbRep=0;
	private ArrayList<Document> lis =new ArrayList<Document>(nbMax);
	Scanner sc = new Scanner(System.in);
    public Etageres(int nbMax) {
    	this.nbMax=nbMax;
    	}
    
   
    int i=0;
    private void ajouteDocument(Document doc) {
    	lis.add(i,doc);
    	i++;
    }
    
    
    
    private boolean suppDoc () {
        // TODO implement here
	   return true;  
    }
}