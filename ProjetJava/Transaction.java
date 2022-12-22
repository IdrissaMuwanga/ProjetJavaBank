import java.util.Date;

public class Transaction {
    // Attributs de la classe Transaction
    private double amount;
    private Date date;
    private TransactionType type;
  
    // Enumération des types de transaction
    public enum TransactionType {
      DEPOSIT, WITHDRAWAL, TRANSFER, PAYMENT
    }
  
    // Constructeur de la classe Transaction
    public Transaction(double amount, Date date, TransactionType type) {
      this.amount = amount;
      this.date = date;
      this.type = type;
    }
  
    // Méthode pour obtenir le montant de la transaction
    public double getAmount() {
      return amount;
    }
  
    // Méthode pour obtenir la date de la transaction
    public Date getDate() {
      return date;
    }
  
    // Méthode pour obtenir le type de transaction
    public TransactionType getType() {
      return type;
    }
  }