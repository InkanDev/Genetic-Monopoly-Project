/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.controleur;

import java.util.ArrayList;
import monopoly.modele.Humain;
import monopoly.modele.Jeu;
import monopoly.modele.Joueur;
import monopoly.modele.Pion;

public class Controleur_ChangementTour extends Controleur {

    ArrayList<Joueur> joueurs;
    private Jeu modele;
    public Controleur_ChangementTour(Jeu modele){
        joueurs= new ArrayList<Joueur>();
        this.modele=modele;
        InitJoueur();
        
    }
    public void InitJoueur(){
        Joueur j1 = new Humain("Yan");
        joueurs.add(j1);
        j1.choisirPion(new Pion("Canon"));

        Joueur j2 = new Humain("Ange");
        joueurs.add(j2);
        j2.choisirPion(new Pion("Cheval"));
        
    }
    
    
}
