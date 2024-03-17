public class App {
    public static void main(String[] args) throws Exception {
        Banque bq = new Banque("BANC");

        Titulaire t1 = new Titulaire("T1");
        Titulaire t2 = new Titulaire("T2");

        bq.creerCompte(t1, 100, 1000);
        bq.creerCompte(t1, 101, 2000);
        bq.creerCompte(t2, 102, 3000);

        System.out.println("Comptes de la banque :");
        bq.affiche();

        t1.depot(100, 500);
        t1.retrait(100, 200);
        t2.depot(102, 500);

        bq.affiche();

        System.out.println("Le numéro de compte ayant le solde le plus grand est : " + t1.getMaxSoldeCompte());

        bq.trierComptes();
        bq.affiche();
    }

}
