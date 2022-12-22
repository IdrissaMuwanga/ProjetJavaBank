import java.util.Date;

public class SavingsAccount extends Bank {
    // Attribut de la classe SavingsAccount
    private double interestRate;
  
    // Constructeur de la classe SavingsAccount
    public SavingsAccount(int numero, double solde, Date dateOuverture, double interestRate) {
      super(numero, solde, dateOuverture);
      this.interestRate = interestRate;
    }
  
    // Méthode pour ajouter l'intérêt au solde du compte
    public void addInterest() {
      solde += solde * interestRate;
    }
  
    // Méthode pour obtenir le taux d'intérêt
    public double getInterestRate() {
      return interestRate;
    }
  }