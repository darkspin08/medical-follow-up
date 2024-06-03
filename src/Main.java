import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Âge: ");
        int age = scanner.nextInt();

        System.out.print("Sexe (masculin/féminin): ");
        String sexe = scanner.next();

        System.out.print("Taille (en mètres): ");
        double taille = scanner.nextDouble();

        System.out.print("Poids (en kg): ");
        double poids = scanner.nextDouble();

        Personne personne = new Personne(nom, age, sexe, taille, poids);
        EXCELhander.writePersonneToExcel(personne);

        System.out.println(personne.calculerIMC());

        Diagnostique diagnostic = new Diagnostique();
        System.out.println(diagnostic.diagnostiquerSymptomes());
    }
}




