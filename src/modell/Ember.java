package modell;

import java.util.ArrayList;


public class Ember {
    private ArrayList<String> nyelvek;
    
    private int kor;
    private String nev;
    private boolean szuletesnap;
    
    
    public Ember(int kor, String nev){
        this(kor,nev,false);
    }
    public Ember(int kor, String nev,boolean szuletesnap){
        this.kor = kor;
        this.nev = nev;
        this.szuletesnap = this.szuletesnap;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public boolean isSzuletesnap() {
        return szuletesnap;
    }
    public void nyelvTanulas(String nyelv){
        this.nyelvek.add(nyelv);
    }
    
    public String bemutatkozas(){
        String bemutatkoz = "A nevem: " + this.nev +"\nEletkorom: " + this.kor +"\n" + "Tanult nyelvek: " + this.nyelvek + "\n";
        return bemutatkoz;
    }
    
    
    
    
    
    
    
}
