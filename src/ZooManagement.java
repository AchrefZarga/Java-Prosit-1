import java.util.Scanner;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        System.out.println("Enter zoo name:");
        zoo.zooName = scanner.nextLine();
        while (zoo.zooName.isEmpty()) {
            System.out.println("Le nom du zoo ne doit pas etre vide ! Entrer le nom de nouveau :");
            zoo.zooName = scanner.nextLine();
        }

        System.out.println("Entrer le nombre des cages:");

        // Verifier si la saisie faite par l'utilisateur est un entier.

        while (!scanner.hasNextInt()) {
            System.out.println("Input invalide Veuillez entrer Un nombre : ");
            scanner.next(); // discard invalid input
        }

        zoo.nbrCages = scanner.nextInt();

        while (zoo.nbrCages < 0 ) {
            System.out.println("Le nombre des cages doit etre positive.");
            zoo.nbrCages = scanner.nextInt();
        }

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

    }

}