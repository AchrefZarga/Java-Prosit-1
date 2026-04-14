package Prosit8;

import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private ArrayList<Employe> list;

    public SocieteArrayList() {
        list = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e) {
        list.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : list) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe emp) {
        return list.contains(emp);
    }


    @Override
    public void supprimerEmploye(Employe e) {
        list.remove(e);
    }


    @Override
    public void displayEmploye() {
        for (Employe e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(list);
    }


    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(list, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int depCompare = e1.getNomDepartement().compareTo(e2.getNomDepartement());

                if (depCompare == 0) {
                    int gradeCompare = e1.getGrade() - e2.getGrade();

                    if (gradeCompare == 0) {
                        return e1.getNom().compareTo(e2.getNom());
                    }
                    return gradeCompare;
                }
                return depCompare;
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();

        for (Employe e : list) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}