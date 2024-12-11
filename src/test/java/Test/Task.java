package Test;


public class Task {
    private int id;
    private String libelle;
    private String dateRealisation;
    private double prixHeure;

    public Task(int id, String libelle, String dateRealisation, double prixHeure) {
        this.id = id;
        this.libelle = libelle;
        this.dateRealisation = dateRealisation;
        this.prixHeure = prixHeure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDateRealisation() {
        return dateRealisation;
    }

    public void setDateRealisation(String dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    public double getPrixHeure() {
        return prixHeure;
    }

    public void setPrixHeure(double prixHeure) {
        this.prixHeure = prixHeure;
    }
}
