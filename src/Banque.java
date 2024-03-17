import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Banque {

    String nom;
    List<Compte> LstCompte;

    public Banque(String nom) {
        this.nom = nom;
        LstCompte = new ArrayList<>();

    }

    public void creerCompte(Titulaire t, int numero, double solde) {
        Compte nvCompte = new Compte(numero, solde);
        LstCompte.add(nvCompte);
        t.ajouterCompte(nvCompte);

    }

    public void affiche() {

        for (Compte c : LstCompte) {
            System.out.println("Numero de compte: " + c.numero + "  solde: " + c.solde);
        }
  }
        public void trierComptes() {
            Collections.sort(LstCompte, new SoldeComparator());
        }
  

}