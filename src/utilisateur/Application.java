package utilisateur;

import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static GestionEleves gestionEleves = new GestionEleves();
    private static GestionProfesseurs gestionProfesseurs = new GestionProfesseurs();
    private static GestionUtilisateurs gestionUtilisateurs = new GestionUtilisateurs();

    public static void main(String[] args) {
        System.out.println("BIENVENU DANS L'APPLICATION ETAB v1.1");
        System.out.println("CONNEXION");
        System.out.print("Identifiant : ");
        String identifiant = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String motDePasse = scanner.nextLine();

        if (identifiant.equals("admin") && motDePasse.equals("admin")) {
            System.out.println("Connexion r�ussie !");
            afficherMenuPrincipal();
        } else {
            System.out.println("Identifiant ou mot de passe incorrect.");
        }
    }

    private static void afficherMenuPrincipal() {
        while (true) {
            System.out.println("\nMENU PRINCIPAL:");
            System.out.println("1: Gestion des �l�ves");
            System.out.println("2: Gestion des professeurs");
            System.out.println("3: Gestion des utilisateurs");
            System.out.println("0: Quitter");
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1: afficherMenuEleves(); break;
                case 2: afficherMenuProfesseurs(); break;
                case 3: afficherMenuUtilisateurs(); break;
                case 0: System.out.println("Au revoir !"); return;
                default: System.out.println("Choix invalide.");
            }
        }
    }

    private static void afficherMenuEleves() {
        while (true) {
            System.out.println("\nGESTION DES ELEVES");
            System.out.println("1: Ajouter un �l�ve");
            System.out.println("2: Supprimer un �l�ve");
            System.out.println("3: Modifier les informations de l'�l�ve");
            System.out.println("4: Lister les �l�ves");
            System.out.println("5: Obtenir le dernier �l�ve ajout�");
            System.out.println("6: Retour");
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Pr�nom : ");
                    String prenom = scanner.nextLine();
                    gestionEleves.ajouterEleve(new Eleve(nom, prenom));
                    System.out.println("�l�ve ajout�.");
                    break;
                case 2:
                    System.out.print("Nom de l'�l�ve � supprimer : ");
                    String nomSuppr = scanner.nextLine();
                    System.out.print("Pr�nom de l'�l�ve � supprimer : ");
                    String prenomSuppr = scanner.nextLine();
                    gestionEleves.supprimerEleve(nomSuppr, prenomSuppr);
                    System.out.println("�l�ve supprim�.");
                    break;
                case 3:
                    System.out.print("Nom de l'�l�ve � modifier : ");
                    String nomModif = scanner.nextLine();
                    System.out.print("Pr�nom de l'�l�ve � modifier : ");
                    String prenomModif = scanner.nextLine();
                    System.out.print("Nouveau nom : ");
                    String nouveauNom = scanner.nextLine();
                    System.out.print("Nouveau pr�nom : ");
                    String nouveauPrenom = scanner.nextLine();
                    gestionEleves.modifierEleve(nomModif, prenomModif, nouveauNom, nouveauPrenom);
                    break;
                case 4:
                    gestionEleves.listerEleves();
                    break;
                case 5:
                    Eleve dernier = gestionEleves.getDernierEleve();
                    System.out.println(dernier != null ? dernier : "Aucun �l�ve.");
                    break;
                case 6: return;
                default: System.out.println("Choix invalide.");
            }
        }
    }

    private static void afficherMenuProfesseurs() {
        while (true) {
            System.out.println("\nGESTION DES PROFESSEURS");
            System.out.println("1: Ajouter un professeur");
            System.out.println("2: Supprimer un professeur");
            System.out.println("3: Modifier les informations du professeur");
            System.out.println("4: Lister les professeurs");
            System.out.println("5: Obtenir le dernier professeur ajout�");
            System.out.println("6: Retour");
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Pr�nom : ");
                    String prenom = scanner.nextLine();
                    gestionProfesseurs.ajouterProfesseur(new Professeur(nom, prenom));
                    System.out.println("Professeur ajout�.");
                    break;
                case 2:
                    System.out.print("Nom du professeur � supprimer : ");
                    String nomSuppr = scanner.nextLine();
                    System.out.print("Pr�nom du professeur � supprimer : ");
                    String prenomSuppr = scanner.nextLine();
                    gestionProfesseurs.supprimerProfesseur(nomSuppr, prenomSuppr);
                    System.out.println("Professeur supprim�.");
                    break;
                case 3:
                    System.out.print("Nom du professeur � modifier : ");
                    String nomModif = scanner.nextLine();
                    System.out.print("Pr�nom du professeur � modifier : ");
                    String prenomModif = scanner.nextLine();
                    System.out.print("Nouveau nom : ");
                    String nouveauNom = scanner.nextLine();
                    System.out.print("Nouveau pr�nom : ");
                    String nouveauPrenom = scanner.nextLine();
                    gestionProfesseurs.modifierProfesseur(nomModif, prenomModif, nouveauNom, nouveauPrenom);
                    break;
                case 4:
                    gestionProfesseurs.listerProfesseurs();
                    break;
                case 5:
                    Professeur dernier = gestionProfesseurs.getDernierProfesseur();
                    System.out.println(dernier != null ? dernier : "Aucun professeur.");
                    break;
                case 6: return;
                default: System.out.println("Choix invalide.");
            }
        }
    }

    private static void afficherMenuUtilisateurs() {
        while (true) {
            System.out.println("\nGESTION DES UTILISATEURS");
            System.out.println("1: Ajouter un utilisateur");
            System.out.println("2: Supprimer un utilisateur");
            System.out.println("3: Modifier les informations d'un utilisateur");
            System.out.println("4: Lister les utilisateurs");
            System.out.println("5: Retour");
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Identifiant : ");
                    String identifiant = scanner.nextLine();
                    System.out.print("Mot de passe : ");
                    String motDePasse = scanner.nextLine();
                    gestionUtilisateurs.ajouterUtilisateur(new Utilisateur(identifiant, motDePasse));
                    System.out.println("Utilisateur ajout�.");
                    break;
                case 2:
                    System.out.print("Identifiant de l'utilisateur � supprimer : ");
                    String identifiantSuppr = scanner.nextLine();
                    gestionUtilisateurs.supprimerUtilisateur(identifiantSuppr);
                    System.out.println("Utilisateur supprim�.");
                    break;
                case 3:
                    System.out.print("Identifiant de l'utilisateur � modifier : ");
                    String identifiantModif = scanner.nextLine();
                    System.out.print("Nouveau mot de passe : ");
                    String nouveauMotDePasse = scanner.nextLine();
                    gestionUtilisateurs.modifierUtilisateur(identifiantModif, nouveauMotDePasse);
                    break;
                case 4:
                    gestionUtilisateurs.listerUtilisateurs();
                    break;
                case 5: return;
                default: System.out.println("Choix invalide.");
            }
        }
    }
}