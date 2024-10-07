package vezerlo;

import modell.Ember;
import nezet.CuiNezet;


public class CuiVezerlo {
    private Ember modell;
    private CuiNezet nezet;
    
     public CuiVezerlo(Ember modell, CuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        start(); 
    }

    private void start() {
        nezet.megjelenit(modell.bemutatkozas());
    }
}
