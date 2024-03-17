import java.util.HashSet;
import java.util.Set;

public class Titulaire {
    String nom;
    Set<Compte> SetCompte;

    public Titulaire(String nom) {
        this.nom = nom;
        SetCompte = new HashSet<>();
    }

    public void ajouterCompte(Compte c) {

        SetCompte.add(c);
    }

    public void affiche() {
        for (Compte c : SetCompte) {
            System.out.println("numero de compte: " + c.numero + " le solde : " + c.solde);
        }
    }

    public void depot(int numCompte, double montant) {
        for (Compte c : SetCompte) {
            if (c.numero == numCompte) {
                c.depot(montant);
                System.out.println("depot de : " + montant + " effectue sur le compte " + numCompte);
                return;
            }
        }
        System.out.println("le compte " + numCompte + " n'existe pas ");
    }

    public void retrait(int numCompte, double montant) {
        for (Compte c : SetCompte) {
            if (c.numero == numCompte) {

                if (c.solde >= montant) {
                    System.out.println("retrait de  " + montant + " effectue sur le compte " + numCompte);
                } else {
                    System.out.println("solde insuffisant");
                }
                return;
            }
        }
        System.out.println("le compte n'existe pas ");

    }

    public int getMaxSoldeCompte() {
        double maxSolde = Double.MIN_VALUE;
        int numsoldMax = -1;
        for (Compte compte : SetCompte) {
            if (compte.solde > maxSolde) {
                maxSolde = compte.solde;
                numsoldMax = compte.numero;
            }
        }
        return numsoldMax;
    }
}
