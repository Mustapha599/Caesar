public class Viginere {

private String gt; //Geheimtext
private String kt; // Klartext
private String schluessel; //Schlüssel für die Verschlüsselung



    public Viginere(){
         kt=""; //Entleert Klartext
         schluessel=""; //Entleert Schlüsselwort
         gt=""; //Entleert Geheimtext
     }
    // Verschlüsselt den Klartext mit dem Vigenère-Algorithmus
    public void verschlusseln(){
         for (int i = 0; i < kt.length(); i++) {     // Durchläuft die ganze Zeichenkette
             int h = this.zahlenZuBuchstaben(kt.charAt(i));
             int j = this.buchstabenZuZahlen(schluessel.charAt(i%schluessel.length()));
             gt = gt + this.buchstabenZuZahlen((char) (h + j % 26));
         }
     }
    // Entschlüsselt den Geheitext mit dem Vigenère-Algorithmus
    public void entschlusseln() {

    }
    //Wandelt Buchstaben in Zahlen um.
    private char zahlenZuBuchstaben(int pWert){
         return (char) pWert;
    }
    //Wandelt Zahlen in Buchstaben.
    private int buchstabenZuZahlen(char pWert) {
         return (int) pWert;
    }
    public String getgt(){
         return gt;
}
    public void setgt(String pGt) {

}
     public String getkt(){
         return kt;
}
    public void setkt(String pKt){

}
   public String getschluessel(){
         return schluessel;
}
   public void setschluessel(String pSchluessel){

}







}
