/*Développer une calculatrice simple qui effectue les opérations arithmétiques de base :
addition, soustraction, multiplication et division.*/

import java.util.Scanner;

public class Projet1 {
    public static void main(String[] args){
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrez les deux nombres:");
        a = scanner.nextDouble();
        b= scanner.nextDouble();

        System.out.println("Choisissez une operation:");
        System.out.println("1:Pour l'addition\n2:Pour la soustraction\n3:Pour la multiplication\n4:Pour la division\n5:Pour le modulo");
        int operation=scanner.nextInt();

        switch (operation) {
            case 1 :
                System.out.println("La somme est:"+ (a+b));
                break;
            case 2 :
                System.out.println("La difference est:"+ (a-b));
                break;
            case 3:
                System.out.println("Le produit est:"+ (a*b));
                break;
            case 4:
                if(b==0){
                    try{
                        double division= a/b;
                    } catch (ArithmeticException e){
                        System.out.println("Error:division par zero");
                    }
                }else{
                    System.out.println("La division est:"+ (a/b));
                }
                break;
            case 5:
                System.out.println("Le modulo est:"+ (a%b));
                break;

            default: System.out.println("Error:operation invalide");break;
        }
    }
}
