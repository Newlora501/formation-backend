package com.gestionBanck;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {

    private List<CarteBancaire> cartes;
    private Facture facture;


    public  Utilisateur(){
        this.cartes=new ArrayList<>();

    }
    public void ajouterCarte(CarteBancaire carte){
        this.cartes.add(carte);
    }

    public void consulterFactures(){
        facture.afficherDetails();

    }

}
