package utilisateur;

public class Professeur {
    private String nom;
    private String prenom;

    // Constructor
    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getter for nom
    public String getNom() {
        return nom;
    }

    // Getter for prenom
    public String getPrenom() {
        return prenom;
    }

    // Setters (optional, depending on your needs)
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Optional: toString method for printing
    @Override
    public String toString() {
        return "Professeur: " + nom + " " + prenom;
    }
}