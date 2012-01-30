/*
 * Projet POO Avancée
 *
 * @author: MARANDO Aurélien
 *          OZCELIK Armen
 *          PLUTAU Perrine
 */

// Liste des packages
// Principal: 
package ppooav.main; 

// Modules: 
import ppooav.entree.sortie.*;


// Plugins: 


// Imports: 
import java.util.ArrayList;

public class Main {

    /**
     * Le Main instancie les différents composants du programme:
     *  - Modules (Entrée, Sortie, Nettoyeur)
     *  - Plugins (Répertoire, Calendrier, etc...) 
     * Evolution possible: Instanciation dynamique des différents éléments du programme à partir d'un fichier de config
     * @param args 
     */
    public static void main(String[] args) {
   
        // Instanciation du Controleur principal
        ApplicationControleur app = new ApplicationControleur();
        Systeme syst              = new Systeme();        
        
        // Déclaration des Modules
        InterfaceEntree entree = new EntreeCMD();
        InterfaceSortie sortie = new SortieCMD(syst);
        
        // Déclaration des Plugins
        
        
        // Ajout des éléments à une ArrayList pour envoi au controleur
        ArrayList l = new ArrayList(); 
        
        app.run(syst, entree, sortie, l);
        
    }
}
