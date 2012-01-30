/*
 * Projet POO Avancée
 *
 * @author: MARANDO Aurélien
 *          OZCELIK Armen
 *          PLUTAU Perrine
 */
package ppooav.entree.sortie;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntreeCMD implements InterfaceEntree <String>{

    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    
    @Override
    public String in() {
        try {
            return stdin.readLine();
        } catch (Exception e) {
            errorOnInput(e, "string");
            return null;
        }
    }
    
    private static void errorOnInput(Exception e, String msg) {
        System.out.println("Error on reading: " + msg + ":" + e );
    }
}
