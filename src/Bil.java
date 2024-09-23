public class Bil {
    String farve;
    double antalKmKørt;
    double nyPris;
    Chauffeur nuværendeChauffeur;


    public Bil(String farve, double antalKmKørt, double nyPris){
        this.farve = farve;
        this.antalKmKørt = antalKmKørt;
        this.nyPris = nyPris;
        this.nuværendeChauffeur = null;
    }


    public void kør(double antalKilometerKørsel){
        antalKmKørt += antalKilometerKørsel;
    }

    public double getNyPris(){
        return nyPris;
    }


    public boolean enChaufførSætterSigInd(Chauffeur c){
        if(nuværendeChauffeur == null){
            nuværendeChauffeur = c;
            return true;
        }
        System.out.println("Denne bil er allerede optaget af " + nuværendeChauffeur);
        return false;
    }



    public Chauffeur chaufførenStigerUd(){
        if (nuværendeChauffeur != null){
            Chauffeur chaufførSomStigerUd = nuværendeChauffeur; // Gem den nuværende chauffør
            nuværendeChauffeur = null; // Fjern chaufføren fra bilen
            return chaufførSomStigerUd; // Returner chaufføren der steg ud
        }
        return null; // Hvis der ikke er nogen chauffør
    }


    public String toString(){
        return "Din bil har farven: " + farve + "\nTotal antal km kørt i bilen: " + antalKmKørt + "\nNy pris for denne bil: " + nyPris;
    }


}
