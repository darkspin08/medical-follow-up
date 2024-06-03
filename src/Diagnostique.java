import java.util.Scanner;
public class Diagnostique {


        public String diagnostiquerSymptomes() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Est-ce que ça va? (oui/non)");
            String reponse = scanner.nextLine();

            if (reponse.equalsIgnoreCase("non")) {
                System.out.println("Quels symptômes avez-vous?");
                System.out.println("1. Mal à la tête");
                System.out.println("2. Mal au ventre");
                System.out.println("3. Mal aux articulations");
                System.out.println("4. Rien de tout ça");

                int choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                    case 2:
                        return "Vous pourriez avoir la fièvre typhoïde. Svp allez voir un médecin au plus vite.";
                    case 3:
                        return "Vous pourriez avoir la malaria. Svp allez voir un médecin au plus vite.";
                    default:
                        return "Vos symptômes ne correspondent pas aux maladies courantes ici. Svp consultez un médecin.";
                }
            } else {
                return "Restez en bonne santé!";
            }
        }
    }


