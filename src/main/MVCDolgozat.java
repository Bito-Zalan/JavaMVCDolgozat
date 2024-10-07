package main;

import modell.Ember;
import nezet.CuiNezet;
import nezet.KonzolNezet;
import vezerlo.CuiVezerlo;

public class MVCDolgozat {

    public static void main(String[] args) {
        Ember modell = new Ember(12, "Bela", true);
        CuiNezet nezet;
        nezet = new KonzolNezet() {};
        new CuiVezerlo(modell, nezet);

    }

}
