package com.Generic;
import java.lang.reflect.Method;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Saisons saison = Saisons.ETE;
        //saison.afficherCaracteristique();
        /*for (Saisons saison:Saisons.values()){
            saison.afficherCaracteristique();
        }*/

        try {

            Class<Saisons> classe = Saisons.class;
            for (Method methode : classe.getDeclaredMethods()) {
                if (methode.isAnnotationPresent(Evenement.class)) {
                    Evenement annotation = methode.getAnnotation(Evenement.class);
                    System.out.println(saison + "\nEvenement:" + annotation.evenement());
                    methode.invoke(classe.getDeclaredConstructor(new Class<?>[]{}).newInstance());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}