import java.util.Date;

public class Account {
  // Attributs de la classe Account
  private int numero;
  private double solde;
  private Date dateOuverture;

  // Constructeur de la classe Account
  public Account(int numero, double solde, Date dateOuverture) {
    this.numero = numero;
    this.solde = solde;
    this.dateOuverture = dateOuverture;
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
public void listAccounts() {
  for (Account a : accounts) {
      System.out.println("Numéro de compte : " + a.getAccountNumber());
      System.out.println("Solde : " + a.getBalance());
      System.out.println("Type de compte : " + a.getType());
      System.out.println();
  }
}