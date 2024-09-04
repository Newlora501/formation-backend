package com.gestionBanck;


public class Facture extends CarteBancaire{

    public Facture(String nomProprietaire,String cardNumber) {
        super(nomProprietaire,cardNumber);
    }

    public  void generateFacture(){
        System.out.println("Le montant Total a payer est:$"+ getMontant());

    }

    public void afficherDetails(){
        getNomProprietaire();
        generateFacture();
        System.out.println("Vous avez 10 jours pour regler votre facture");

    }

}
