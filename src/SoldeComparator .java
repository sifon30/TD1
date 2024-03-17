import java.util.Comparator;

class SoldeComparator implements Comparator<Compte> {
    @Override
    public int compare(Compte c1, Compte c2) {
        return Double.compare(c1.solde, c2.solde);
    }
}