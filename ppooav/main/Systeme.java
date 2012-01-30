/*
 * Projet POO Avancée
 *
 * @author: MARANDO Aurélien
 *          OZCELIK Armen
 *          PLUTAU Perrine
 */

package ppooav.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * La classe Systeme permet d'effectuer les traitements généraux du programme 
 *  - Faut-il quitter le programme ? 
 *  - Faut-il renommer le programme ? 
 */
public class Systeme {
    private String fichierNom = "nomProgramme";
    private String fichierConditionArret = "conditionArret"; 
    
    private String nomProgramme = "";

    public Systeme() {
        // Lire les fichiers system 
        this.lireFichierNom();
    }
    
    public void analyseGenerale() {
        
    }
    
    public void fin() {
        this.ecrireFichierNom();
    }
    
    /**
     * Lire le nom du programme dans un fichier
     */
    private void lireFichierNom() {
        try {
            BufferedReader fichier_source = new BufferedReader(new FileReader(this.fichierNom));
            String chaine;

            try {
                while ((chaine = fichier_source.readLine()) != null) {
                    this.setNomProgramme(chaine);
                }
            } catch (IOException ex) {
                System.out.println("Erreur lors de la lecture du fichier.");
            }
            try {
                fichier_source.close();
            } catch (IOException ex) {
                System.out.println("Erreur lors de la fermeture du fichier.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier est introuvable !");
        }
    }
    
    /** 
     * Sauvegarde le nom du programme dans un fichier
     */
    private void ecrireFichierNom() {
        BufferedWriter fichier_source;
        try {
            fichier_source = new BufferedWriter(new FileWriter(this.fichierNom));
            
            try {
                fichier_source.write(this.getNomProgramme());
            } catch (IOException ex) {
                System.out.println("Erreur lors de l'écriture dans le fichier.");
            }
            
            try {
                fichier_source.close();
            } catch (IOException ex) {
                System.out.println("Erreur lors de la fermeture du fichier.");
            }
        } catch (IOException ex) {
            Logger.getLogger(Systeme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the nomProgramme
     */
    public String getNomProgramme() {
        return nomProgramme;
    }

    /**
     * @param nomProgramme the nomProgramme to set
     */
    public void setNomProgramme(String nomProgramme) {
        this.nomProgramme = nomProgramme;
    }
    
    
}
