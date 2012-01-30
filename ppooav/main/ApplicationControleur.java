/*
 * Projet POO Avancée
 *
 * @author: MARANDO Aurélien
 *          OZCELIK Armen
 *          PLUTAU Perrine
 */

package ppooav.main;

import java.util.ArrayList;
import ppooav.entree.sortie.InterfaceEntree;
import ppooav.entree.sortie.InterfaceSortie;

public class ApplicationControleur {
    
    /**
     * Classe ApplicationControleur
     * Fonction: Controleur général du programme
     */
    public ApplicationControleur() {
        
    }
    
    /**
     * Traitement général du programme 
     * @param l: Liste des éléments instanciés dans le Main
     */
    public void run(Systeme systeme, InterfaceEntree entree, InterfaceSortie sortie, ArrayList l) {
        String question = "";
        
        sortie.welcome();
        
        do {        
            // 0: Configuration de l'appli: si nom inconnu, demander un nom à l'utilisateur. 
            if(systeme.getNomProgramme().isEmpty()) {
                systeme.setNomProgramme((String)entree.in());
            }
            
            // 1. Demander à l'utilisateur ce qu'il veut
            sortie.request();
            question = (String)entree.in();
            
            // 2: Analyser et nettoyer... Si fin, on quitte
            sortie.out("Traitement en cours...");
            
            // 3: Si pas quitter, Cinématique de traitement
            String resultat = "Un contact trouvé.\nil fera beau demain.\nArmen Ozcelik habite 'Choisy-le-Roi'";

            // 4: Afficher les résultats
            sortie.out(resultat);
        } while(!question.contains("#FIN#"));
        
        // 5: Fin du programme
        systeme.fin();
        sortie.goodBye();
    }
}
