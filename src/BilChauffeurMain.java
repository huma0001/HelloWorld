public class BilChauffeurMain {
    public static void main(String[] args) {

        Bil bil1 = new Bil("Sort", 21000, 31000);
        Bil bil2 = new Bil("Hvid", 0, 99999);

        Chauffeur billy = new Chauffeur("Billy");
        Chauffeur bobby = new Chauffeur("Bobby");


        bil1.enChaufførSætterSigInd(billy);
        bil1.enChaufførSætterSigInd(bobby);



        System.out.println(bil1.toString());

    }
}
