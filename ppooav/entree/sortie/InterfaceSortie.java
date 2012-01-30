/*
 * Projet POO Avancée
 *
 * @author: MARANDO Aurélien
 *          OZCELIK Armen
 *          PLUTAU Perrine
 */
package ppooav.entree.sortie;

public interface InterfaceSortie <X> {
    
    void welcome();
    
    void goodBye();
    
    void request();
    
    void result(X x);
    
    void out(X x);
    
}
