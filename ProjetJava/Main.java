import java.util.Date;


public class Main {
  public static void main(String[] args) {
    // Création d'un compte courant avec un découvert autorisé de 500 euros
    CurrentAccount currentAccount = new CurrentAccount(1, 1000, new Date(), 500);
    System.out.println("Compte courant : numéro " + currentAccount.getNumero() + ", solde " + currentAccount.getSolde() + " euros, découvert autorisé " + currentAccount.getOverdraftLimit() + " euros");

    // Création d'un compte épargne avec un taux d'intérêt de 2%
    SavingsAccount savingsAccount = new SavingsAccount(2, 2000, new Date(), 0.02);
    System.out.println("Compte épargne : numéro " + savingsAccount.getNumero() + ", solde " + savingsAccount.getSolde() + " euros, taux d'intérêt " + savingsAccount.getInterestRate() + "%");

    // Effectuation d'un dépôt de 500 euros sur le compte courant
    currentAccount.crediterCompte(500);
    System.out.println("Dépôt de 500 euros sur le compte courant : nouveau solde " + currentAccount.getSolde() + " euros");

    // Effectuation d'un retrait de 1500 euros sur le compte courant (découvert autorisé dépassé)
    currentAccount.debiterCompte(1500);
    System.out.println("Retrait de 1500 euros sur le compte courant : nouveau solde " + currentAccount.getSolde() + " euros");

    Transaction deposit = new Transaction(1000, new Date(), Transaction.TransactionType.DEPOSIT);
    System.out.println("Transaction de dépôt : montant " + deposit.getAmount() + " euros, date " + deposit.getDate() + ", type " + deposit.getType());

    // Création d'une transaction de retrait de 500 euros
    Transaction withdrawal = new Transaction(500, new Date(), Transaction.TransactionType.WITHDRAWAL);
    System.out.println("Transaction de retrait : montant " + withdrawal.getAmount() + " euros, date " + withdrawal.getDate() + ", type " + withdrawal.getType());

    // Ajout d'intérêts au compte épargne
    savingsAccount.addInterest();
    System.out.println("Ajout d'intérêts au compte épargne : nouveau solde " + savingsAccount.getSolde() + " euros");
  }
}