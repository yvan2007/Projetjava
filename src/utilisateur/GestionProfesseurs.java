package utilisateur;



import java.util.ArrayList;
import java.util.List;

public class GestionProfesseurs {
    private List<Professeur> professeurs = new ArrayList<>();

    public void ajouterProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    public void supprimerProfesseur(String nom, String prenom) {
        professeurs.removeIf(p -> p.getNom().equals(nom) && p.getPrenom().equals(prenom));
    }

    public void modifierProfesseur(String nom, String prenom, String nouveauNom, String nouveauPrenom) {
        for (Professeur p : professeurs) {
            if (p.getNom().equals(nom) && p.getPrenom().equals(prenom)) {
                p.setNom(nouveauNom);
                p.setPrenom(nouveauPrenom);
                return;
            }
        }
        System.out.println("Professeur non trouvé.");
    }

    public void listerProfesseurs() {
        if (professeurs.isEmpty()) {
            System.out.println("Aucun professeur.");
        } else {
            for (Professeur p : professeurs) {
                System.out.println(p);
            }
        }
    }

    public Professeur getDernierProfesseur() {
        return professeurs.isEmpty() ? null : professeurs.get(professeurs.size() - 1);
    }
}