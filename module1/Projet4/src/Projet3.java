/*Projet 3 : Calculateur d'IMC
Objectif du Projet
Développer un calculateur d'IMC qui calcule l'indice de masse corporelle et fournit une
interprétation des résultats.
Description du Programme
L'utilisateur entre son poids et sa taille. Le programme calcule l'IMC et affiche s'il est en
insuffisance pondérale, a un poids normal, est en surpoids ou obèse.
Fonctionnalités
• Saisie du poids et de la taille.
• Calcul de l'IMC.
• Affichage de l'interprétation de l'IMC.
Instructions de Développement
1. Utiliser la formule IMC : poids / (taille * taille).
2. Implémenter des if-else pour les catégories.
Extension Potentielle
• Ajouter une fonction pour convertir les unités (kg/lb, m/in).
• Fournir des conseils de santé basés sur l'IMC.*/


import java.util.Scanner;

public class Projet3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre Poids(en Kg):");
        double poids = sc.nextDouble();
        System.out.println("Entrez votre taille(en m):");
        double taille = sc.nextDouble();
        Projet3 resultat=new Projet3(poids,taille);
        System.out.println("Choisissez une option:");
        System.out.println("1.Calculer   l'indice de masse corporelle(IMC)\n2.Convertir Kg/lb , m/in");
        int n = sc.nextInt();
        if (n==1){
            calculatorImc(resultat);
        }else{
            conversionEnKg(resultat);
        }
    }

    public double poids;
    public double taille;
    public Projet3(double poids,double taille){
        this.poids=poids;
        this.taille=taille;
    }

    public static void calculatorImc(Projet3 p){
        double imc = p.poids/(p.taille*p.taille);
        if (imc<16.5){
            System.out.println("Votre IMC est:" + imc + "\nEtat de santé:Maigreur extrême – dénutrition,Insuffisance pondérale sévère.\nConseils:Vous devez consulter un medecin;\nUne prise en charge médicale est nécessaire. Si la cause de l’insuffisance pondérale est due à un problème nutritionnel, le médecin oriente la personne vers un suivi par un nutritionniste.");
        }else if(imc>16.5 && imc<=18.5){
            System.out.println("Votre IMC est:" + imc + "\nEtat de santé:Insuffisance pondérale modérée.\nConseils:Vous devez consulter un médecin qui sera à même de vous proposer des conseils diététiques en fonction de votre corpulence.");
        }else if(imc>18.5 && imc<=24.9){
            System.out.println("Votre IMC est:" + imc + "\nEtat de santé:Corpulence normale.\nConseils:Continuez de manger equilibré pour garder votre corpulence.");
        } else if (imc>24.9 && imc<=29.9){
            System.out.println("Votre IMC est:" + imc + "\nEtat de santé:Surpoids ou pré-obésité.\nConseils: Il est important de consulter un médecin. Cela peut être un généraliste ou un médecin nutritionniste.");
        }else if (imc >29.9 && imc<=34.5){
            System.out.println("Votre IMC est:" + imc + "\nEtat de santé:Obésité modérée(classe I).\nConseils: Il est important de consulter un médecin. Cela peut être un généraliste ou un médecin nutritionniste.");
        }else {
            System.out.println("Votre IMC est:" + imc + "\nEtat de santé:Obésité sévère.\nConseils:Peu importe votre situation de surpoids, nous vous conseillons de consulter un nutritionniste ou un médecin en cas d'IMC élevé.\nCe sont des experts capables de vous aider au mieux à adopter une alimentation pour la perte de poids et à limiter les risques de développer à terme des maladies cardio-vasculaires.");
        }
    }

    public static void conversionEnKg(Projet3 p){
        System.out.println("Choisissez une option:");
        System.out.println("1.Convertir  Kg en lb\n2.Convertir m en in\n3.Convertir kg-lb en m-in");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double r;
        switch (a){
            case 1:
                r = p.poids*2.205;;
                System.out.println(p.poids + "Kg=" + r + "lb");
                break;
            case 2:
                r = p.poids*39.3701;;
                System.out.println(p.poids + "m=" + r + "in");
                break;
            case 3:
                r = p.poids*86.79617 ;
                System.out.println(p.poids + "Kg-lb=" + r + "m-in");
                break;
        }

    }
}
