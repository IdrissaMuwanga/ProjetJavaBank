public class Loan {
    // Attributs de la classe Loan
    private double amount;
    private int duration;
    private double interestRate;
    private double monthlyPayment;
  
    // Constructeur de la classe Loan
    public Loan(double amount, int duration, double interestRate) {
      this.amount = amount;
      this.duration = duration;
      this.interestRate = interestRate;
      this.monthlyPayment = calculatePayment();
    }
  
    // Méthode pour calculer le montant des paiements mensuels
    public double calculatePayment() {
      // Formule de calcul du paiement mensuel (à titre d'exemple)
      return (amount * interestRate / 12) / (1 - Math.pow(1 + interestRate / 12, -duration));
    }
  
    // Méthode pour déterminer si le prêt est entièrement remboursé
    public boolean isPaidOff() {
      return amount == 0;
    }
  
    // Méthode pour effectuer un paiement sur le prêt
    public void makePayment(double payment) {
      amount -= payment;
    }
  
    // Méthodes d'accès aux attributs
    public double getAmount() {
      return amount;
    }
  
    public int getDuration() {
      return duration;
    }
  
    public double getInterestRate() {
      return interestRate;
    }
  
    public double getMonthlyPayment() {
      return monthlyPayment;
    }
  }