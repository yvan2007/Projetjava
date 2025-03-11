package utilisateur;

import java.util.ArrayList;
import java.util.List;

public class GestionUtilisateurs {
    private List<Utilisateur> utilisateurs = new ArrayList<>();

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public void supprimerUtilisateur(String identifiant) {
        utilisateurs.removeIf(u -> u.getIdentifiant().equals(identifiant));
    }

    public void modifierUtilisateur(String identifiant, String nouveauMotDePasse) {
        for (Utilisateur u : utilisateurs) {
            if (u.getIdentifiant().equals(identifiant)) {
                u.setMotDePasse(nouveauMotDePasse);
                return;
            }
        }
        System.out.println("Utilisateur non trouvé.");
    }

    public void listerUtilisateurs() {
        if (utilisateurs.isEmpty()) {
            System.out.println("Aucun utilisateur.");
        } else {
            for (Utilisateur u : utilisateurs) {
                System.out.println(u);
            }
        }
    }
}