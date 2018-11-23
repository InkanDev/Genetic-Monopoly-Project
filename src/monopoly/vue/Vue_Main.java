/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.vue;

import monopoly.modele.Jeu;
import static monopoly.modele.Jeu.getInstance;

/**
 *
 * @author rg686289
 */
public class Vue_Main {
    
    private boolean partieEnCours = false;
    
    public void lancerPartieClassique() throws Exception {
        
        if (!partieEnCours) {
            partieEnCours = true;
            Vue_Partie partie = new Vue_Partie();
            partie.start();
            partieEnCours = false;
        }
        
       
    }
    public void lancerPartieIAcontreIA() throws Exception{
        if(!partieEnCours) {
            partieEnCours = true;
            Jeu jeu = getInstance();
            jeu.run();
            partieEnCours = false;
        }
        
        
    }
    
}