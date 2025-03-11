package utilisateur;

public class Utilisateur {
    private String identifiant;
    private String motDePasse;

    public Utilisateur(String identifiant, String motDePasse) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "Utilisateur: " + identifiant;
    }
}