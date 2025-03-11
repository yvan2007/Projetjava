package utilisateur;

import java.util.ArrayList;
import java.util.List;

public class GestionEleves {
    private List<Eleve> eleves = new ArrayList<>();

    public void ajouterEleve(Eleve eleve) {
        eleves.add(eleve);
    }

    public void supprimerEleve(String nom, String prenom) {
        eleves.removeIf(e -> e.getNom().equals(nom) && e.getPrenom().equals(prenom));
    }

    public void modifierEleve(String nom, String prenom, String nouveauNom, String nouveauPrenom) {
        for (Eleve e : eleves) {
            if (e.getNom().equals(nom) && e.getPrenom().equals(prenom)) {
                e.setNom(nouveauNom);
                e.setPrenom(nouveauPrenom);
                return;
            }
        }
        System.out.println("Élève non trouvé.");
    }

    public void listerEleves() {
        if (eleves.isEmpty()) {
            System.out.println("Aucun élève.");
        } else {
            for (Eleve e : eleves) {
                System.out.println(e);
            }
        }
    }

    public Eleve getDernierEleve() {
        return eleves.isEmpty() ? null : eleves.get(eleves.size() - 1);
    }
}