package app;

public class Ami {
    private String nom;
    private String prenom;
    private int nombreBièresSupportables;

    public Ami(String nom, String prenom, int nombreBièresSupportables) {
        this.nom = nom;
        this.prenom = prenom;
        this.nombreBièresSupportables = nombreBièresSupportables;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNombreBièresSupportables() {
        return nombreBièresSupportables;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNombreBièresSupportables(int nombreBièresSupportables) {
        this.nombreBièresSupportables = nombreBièresSupportables;
    }

    public void boitUneBière() {
        if (nombreBièresSupportables > 0) {
            nombreBièresSupportables--;
            System.out.println("Une bière de moins pour " + prenom + " " + nom + " !");
        } else {
            System.out.println("Plus de bières pour " + prenom + " " + nom + " !");
        }
    }


}
