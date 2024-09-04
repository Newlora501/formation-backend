import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args){
        //1. Créez un programme qui trouve le minimum et le maximum d'un tableau d'entiers.
        int[] arr = {3, 6,-2, 1, 9, -13, 0, 16, 27, 21,-23,4};
        int max = arr[0];    //on suppose que c'est le premier element
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]<min) {
                min = arr[i];
            }else if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Le minimum est:" + min);
        System.out.println("Le maximum est:" + max);

        // 2. Créez un programme pour calculer l’aire d’un rectangle donné sa longueur et sa largeur.
        double L=85, l=35;
        System.out.println("2)Calcul de l'aire du rectangle");
        System.out.println("La longeur = " + L);
        System.out.println("La largeur = " + l);
        System.out.println("L'aire = " + (L*l));
        signedunombre();
    }
    //3.Fonction pour vérifier si un nombre est positif, négatif ou nul.
    public static void  signedunombre(){
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Entrez un  nombre pour trouver le signe: ");
        a = scanner.nextInt();
        if (a>0){
            System.out.println("Le nombre " + a + " " + "est positif");
        }else if(a<0) {
            System.out.println("Le nombre " + a + "  " + "est negatif");
        }
        else{
            System.out.println("Error");
        }
    }
}