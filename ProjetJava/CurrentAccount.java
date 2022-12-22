import java.util.Date;

public class CurrentAccount extends Bank {
  // Attributs de la classe CurrentAccount
  private double overdraftLimit;

  // Constructeur de la classe CurrentAccount
  public CurrentAccount(int numero, double solde, Date dateOuverture, double overdraftLimit) {
    super(numero, solde, dateOuverture);
    this.overdraftLimit = overdraftLimit;
  }

  // Méthode pour débiter le compte avec un découvert autorisé
  @Override
  public void debiterCompte(double montant) {
    if (solde - montant >= -overdraftLimit) {
      solde -= montant;
    }
  }

  // Méthode pour obtenir le plafond de découvert autorisé
  public double getOverdraftLimit() {
    return overdraftLimit;
  }
}