import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
  // Attributs de la classe Customer
  private String nom;
  private String adresse;
  private Date dateDeNaissance;
  private String email;
  private String telephone;
  private List<Bank> comptes;

  // Constructeur de la classe Customer
  public Customer(String nom, String adresse, Date dateDeNaissance, String email, String telephone) {
    this.nom = nom;
    this.adresse = adresse;
    this.dateDeNaissance = dateDeNaissance;
    this.email = email;
    this.telephone = telephone;
    this.comptes = new ArrayList<>();
  }

  // Méthodes pour obtenir et définir les attributs de la classe Customer (omises pour la brièveté)

  // Méthode pour ajouter un compte à la liste des comptes du client
  public void addBank(Bank compte) {
    comptes.add(compte);
  }

  // Méthode pour obtenir la liste des comptes du client
  public List<Bank> getBanks() {
    return comptes;
  }

  // Méthode pour obtenir le solde total de tous les comptes du client
  public double getTotalBalance() {
    double total = 0.0;
    for (Bank compte : comptes) {
      total += compte.getSolde();
    }
    return total;
  }

  // Méthode pour débiter un compte spécifique du client
  public void debitBank(int numeroDeCompte, double montant) {
    for (Bank compte : comptes) {
      if (compte.getNumero() == numeroDeCompte) {
        compte.setSolde(compte.getSolde() - montant);
        return;
      }
    }
    throw new IllegalArgumentException("Le compte spécifié n'existe pas.");
  }

  // Méthode pour créditer un compte spécifique du client
  public void creditBank(int numeroDeCompte, double montant) {
    for (Bank compte : comptes) {
      if (compte.getNumero() == numeroDeCompte) {
        compte.setSolde(compte.getSolde() + montant);
        return;
      }
    }
    throw new IllegalArgumentException("Le compte spécifié n'existe pas.");
  }
}