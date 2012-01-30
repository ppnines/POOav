/*
 * Projet POO Avancée
 *
 * @author: MARANDO Aurélien
 *          OZCELIK Armen
 *          PLUTAU Perrine
 */
package ppooav.entree.sortie;

import ppooav.main.Systeme;



public class SortieCMD implements InterfaceSortie <String> {
    private final Systeme syst;
    
    public SortieCMD(Systeme syst) {
        this.syst = syst;
    }
    
    @Override
    public void out(String str){
        System.out.println(str);
    }

    @Override
    public void welcome() {
        this.out(this.syst.getNomProgramme() + " vous souhaite la bienvenue ! Posez votre question où entrez \"#FIN#\" pour quitter.");
    }

    @Override
    public void goodBye() {
        this.out("Merci et à bientot !");
    }
    
    @Override
    public void request() {
        this.out("Votre question à " + this.syst.getNomProgramme() + " : ");
    }

    @Override
    public void result(String str) {
        this.out(this.syst.getNomProgramme() + " à trouvé les résultats suivants :\n"+str);
    }
    
}
