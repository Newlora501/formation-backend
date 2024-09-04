package com.gestionBanck;

public class SystemeDePayements  extends CarteBancaire{

    public SystemeDePayements(String nomProprietaire, String cardNumber) {
        super(nomProprietaire, cardNumber);
    }

    public void validerTransaction(CarteBancaire carte ,double montant){
        System.out.println("voulez vous effectuer le payement de:$" + getMontant() + "yes ou no?");
        boolean a;
        if (a=true){
            carte.validerCarte(getCardNumber());
            carte.effectuerPaiement();
        }else {
            System.out.println("La transaction n'a pas été effectuée" );
        }

    }

    public void genererRapport(){
        System.out.println("Le payement de :$"+getMontant()+ "a été effectué avec succes");

    }
}
