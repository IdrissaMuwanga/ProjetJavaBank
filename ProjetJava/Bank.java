import java.util.Date;

public class Bank {
    // Attributs de la classe Bank
    private int numero;
    protected double solde;
    private Date dateOuverture;
  
    // Constructeur de la classe Bank
    public Bank(int numero, double solde, Date dateOuverture) {
      this.numero = numero;
      this.solde = solde;
      this.dateOuverture = dateOuverture;
    }
  
    // Méthode pour débiter le compte
    public void debiterCompte(double montant) {
      solde -= montant;
    }
  
    // Méthode pour créditer le compte
    public void crediterCompte(double montant) {
      solde += montant;
    }
  
    // Méthode pour obtenir le numéro de compte
    public int getNumero() {
      return numero;
    }
  
    // Méthode pour obtenir le solde du compte
    public double getSolde() {
      return solde;
    }
  
    // Méthode pour obtenir la date d'ouverture du compte
    public Date getDateOuverture() {
      return dateOuverture;
    }
  }