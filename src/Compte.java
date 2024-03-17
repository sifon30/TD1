public class Compte implements Comparable<Compte> {
    int numero;
    double solde;

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void retrait(double m) {
        solde = solde - m;
    }

    public void depot(double m) {
        solde = solde + m;
    }
  
    @Override
    public int compareTo(Compte c){
        return Double.compare(this.solde, c.solde);
    }
}


