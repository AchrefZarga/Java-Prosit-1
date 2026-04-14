package Prosit8;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Ahmed", "IT", 2);
        Employe e2 = new Employe(1, "Sami", "Karim", "RH", 1);
        Employe e3 = new Employe(2, "Moez", "Hassan", "IT", 3);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        List<Employe> result = societe.rechercherParDepartement("IT");
        for (Employe e : result) {
            System.out.println(e);
        }
    }
}