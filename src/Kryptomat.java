public abstract class  Kryptomat {

    //Attribute der Abstrakten- Klasse
private String gt;
private String kt;



//Konstruktor
public Kryptomat(){

}
//verschlüsselt den Kt
public abstract void  verschluesseln();
//entschlüsselt den Gt
public abstract void entschluesseln();
  // Wandelt Zahlen in Buchstaben um
protected char getChar(int pWert){

        return (char) pWert;
}
//Wandelt Buchstaben in Zahlen um
protected int getASCII(char pWert){
        return (int) pWert;
}
public String getGt(){
    return gt;
}
public void  setGt(String pGt){
    gt = pGt;
}
public String getKt(){
    return kt;
    }
public void setKt(String pKt) {
    kt = pKt;
}














}
