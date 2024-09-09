package com.Generic2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        VisiteMedicale visiteMed1 = new VisiteMedicale("Merveille","Gineco",TypeVisite.URGENCE,"Aujoud'hui");
        VisiteMedicale visiteMed2 = new VisiteMedicale("Junior","Ophtamologue",TypeVisite.CONSULTATION,"05 Aout");
        visiteMed1.ajouterVisite(TypeVisite.URGENCE,"Merveille");
        visiteMed2.ajouterVisite(TypeVisite.CONSULTATION,"Junior");

        Class<VisiteMedicale> classe = VisiteMedicale.class;
        for (Method method : classe.getDeclaredMethods()) {
            if (method.isAnnotationPresent(VisiteCritique.class)) {
                VisiteCritique visiteCri = method.getAnnotation(VisiteCritique.class);
                try {
                     method.invoke(visiteMed1, visiteCri.visite());
                }catch (IllegalArgumentException e){
                    System.err.println("Ereur");
                }catch (Exception e) {
                    e.printStackTrace();
                }
                if (true) {
                    System.out.println(visiteMed1.getPatientName()+ "--" + "visite:" + visiteCri.visite());
                }

            }
        }

    }
}