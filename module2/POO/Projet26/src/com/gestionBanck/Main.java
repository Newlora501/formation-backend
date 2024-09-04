package com.gestionBanck;
import com.gestionBanck.CarteBancaire;
import com.gestionBanck.Facture;
import com.gestionBanck.SystemeDePayements;

import java.util.Scanner;

import static com.gestionBanck.CarteBancaire.validerCarte;

public class Main {
    public static void main(String[] args) {
        CarteBancaire card1 = new CarteBancaire("Lora","4556324791616125");
        System.out.println("Valid card:" + validerCarte("4556324791616125"));
        String cardNumber = card1.getCardNumber();
        if (validerCarte(cardNumber) == true) {
            System.out.println(cardNumber + " is valid.");
        } else {
            System.out.println(cardNumber + " is invalid.");
        }
        /*int n;
        System.out.println("Choissez une option:");
        System.out.println("1.Effectuer le payement\n2.Generer la facture\n3.Afficher les details\n4.Ajouter une carte" +
                "\n5.Consulter les facture\n6.Valider la transaction\n7.Generer un rapport de transaction");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n){
            case 1:
                card1.effectuerPaiement() ;
                break;
            case 2:
                Facture facture=new Facture("Lora","4556324791616125");
                facture.generateFacture();
                break;
            case 3:
                facture.afficherDetails();
                break;
            case 4:
                Utilisateur utilisateur=new Utilisateur();
                utilisateur.ajouterCarte(card1);
                break;
            case 6:
                utilisateur.consulterFactures();
                break;
            case 7:
                SystemeDePayements s1 = new SystemeDePayements("Lora","4556324791616125");
                s1.validerTransaction(card1 , card1.getMontant());
                break;

        }*/
    }
}