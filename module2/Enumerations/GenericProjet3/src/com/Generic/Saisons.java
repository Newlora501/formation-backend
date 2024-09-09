package com.Generic;

import java.util.Arrays;

public enum Saisons {
    PRINTEMPS(12.1,"3 mois:Mars-Mai."),
    ETE(20.4,"3 mois:Juin-Aout. "),
    AUTOME(15.5,"3 mois:Septembre-Novembre."),
    HIVER(-6.1,"3 mois:Decembre-Fevrier.");

    private double tempMoyenne;
    private String duree;

    Saisons(double tempMoyenne, String duree) {
        this.tempMoyenne = tempMoyenne;
        this.duree = duree;
    }

    public double getTempMoyenne() {
        return tempMoyenne;
    }

    public String getDuree() {
        return duree;
    }

    @Evenement(evenement="Noel")
    public void afficherCaracteristique() {
        Saisons s = null;
        if (s==ETE) {
            System.out.println("La saison:" + this.name() + "\nTemperature moyenne:" + getTempMoyenne() + "°C; Durée:" + getDuree());
        } else {
            System.out.println(Arrays.toString(Saisons.values()));
        }

    }
}

