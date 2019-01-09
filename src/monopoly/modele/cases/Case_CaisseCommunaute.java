package monopoly.modele.cases;

import monopoly.modele.Jeu;
import monopoly.modele.Joueur;
import monopoly.modele.cartes.Carte;

public class Case_CaisseCommunaute extends Case_Pioche {

    public Case_CaisseCommunaute(Case suivante) {
        super("Caisse de communauté", suivante);
    }

    @Override
    public void action(Joueur j) {
        Carte cc = Jeu.getInstance().getGestionnaireCartes().piocherCaisseCommunaute();
        cc.action(j);
        if(cc.usageImmediat()) {
            Jeu.getInstance().getGestionnaireCartes().remettreCaisseCommunaute(cc);
        }
    }

    @Override
    public ECase getType() {
        return ECase.CaisseCommunaute;
    }
}
