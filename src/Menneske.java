public class Menneske {
    private Menneske ægtefælle;

    public Menneske(String name){

    }


    public Menneske gifterSigMed(Menneske ægtefælle){
        if(this.ægtefælle == null && ægtefælle != this){
            this.ægtefælle = ægtefælle;
            ægtefælle.setÆgtefælle(this);
        }
        return ægtefælle;
    }


    public Menneske getÆgtefælle(){
        return  ægtefælle;
    }


    public void setÆgtefælle(Menneske ægtefælle){
        this.ægtefælle = ægtefælle;
    }

        // chatgpt
    public void bliverSkilt() {
        if (this.ægtefælle != null) {
            // Fjern skilsmisse-ansvar fra den nuværende ægtefælle
            this.ægtefælle.setÆgtefælle(null);
            // Fjern ægtefællen fra den nuværende person
            this.ægtefælle = null;
        }
    }


    /* Min kode
    public void bliverSkilt(){
       this.ægtefælle.setÆgtefælle(null);
       ægtefælle.setÆgtefælle(null);
    }

     */

}
