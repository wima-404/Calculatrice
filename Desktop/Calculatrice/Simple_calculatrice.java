import java.util.*;

public class Simple_calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Bienvenue dans la calculatrice");
        System.out.print("Entrez le premier nombre : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez le deuxieme nombre : ");
        double b = scanner.nextDouble();

        System.out.print("Choisissez une operation : \n 1-Addition \n 2-Soustraction \n 3-Multiplication \n 4-Division \n 5-Puissance \n 6-Racine_carre \n 7-Factorielle : ");
        int operation = scanner.nextInt();

        double result;

        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Resultat : " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Resultat : " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Resultat : " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Resultat : " + result);
                } else {
                    System.out.println("Erreur : La division par zero n'est pas autorisee.");
                }
                break;
            case 5:
                result = Math.pow(a, b);
                System.out.println("Resultat : " + result);
                break;
            case 6:
                result = Math.sqrt(a);
                System.out.println("Resultat : " + result);
                break;
            case 7:
                if (a < 0 || a != (int)a) {
                    System.out.println("Erreur : La factorielle est definie uniquement pour les entiers positifs.");
                } else {
                    result = 1;
                    for (int i = 1; i <= a; i++) {
                        result *= i;
                    }
                    System.out.println("Resultat de la factorielle : " + result);
                }
                break;
            default:
                System.out.println("Operation invalide.");
        }

        scanner.close();
    }
}
