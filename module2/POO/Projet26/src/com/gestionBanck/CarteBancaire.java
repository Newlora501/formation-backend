package com.gestionBanck;

import java.util.function.IntUnaryOperator;

import static com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary.getPrefix;
import static jdk.internal.jimage.decompressor.CompressedResourceHeader.getSize;

public class CarteBancaire {
    private String cardNumber;
    private String nomProprietaire;
    private  double montant;



    public CarteBancaire(String nomProprietaire, String cardNumber) {
        this.nomProprietaire = nomProprietaire;
        this.cardNumber = cardNumber;
    }

    public static boolean validerCarte(String cardNumber) {
        if (! cardNumber.matches("(?=[456]|37)[0-9]{13,16}"))
            return false;
        int sum = 0;
        for (int i = cardNumber.length() - 1, pos = 1; i >= 0; i--, pos++) {
            int digit = cardNumber.charAt(i) - '0';
            sum += (pos % 2 == 1/*odd*/ ? digit : digit < 5 ? digit * 2 : digit * 2 - 9);
        }
        return (sum % 10 == 0);
    }

    public void effectuerPaiement() {
        double solde=8000;
        if (solde <= 0 && solde < getMontant()) {
            System.out.println("votre solde est inssuffisant");
        } else {
            solde -= montant;
            System.out.println("Payement de :" + getMontant() + "effectué");
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public double getMontant() {
        return montant;
    }
}