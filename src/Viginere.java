public class Viginere extends Kryptomat {

private String gt; //Geheimtext
private String kt; // Klartextextends Kryptomat
private String schluessel; //Schlüssel für die Verschlüsselung



    public Viginere(){
         kt=""; //Entleert Klartext
         schluessel=""; //Entleert Schlüsselwort
         gt=""; //Entleert Geheimtext
     }
    // Verschlüsselt den Klartext mit dem Vigenère-Algorithmus
    public void verschlusseln(){
        for (int i = 0; i < kt.length(); i++) {     // Durchläuft die ganze Zeichenkette
            int h = this.buchstabenZuZahlen(kt.charAt(i));
            int j = this.buchstabenZuZahlen(schluessel.charAt(i))-64;
            System.out.println("Test");
            gt = gt + this.zahlenZuBuchstaben((char) (h+j));
            System.out.println(gt + "Test2");
        } while(schluessel.length()<kt.length()){
            schluessel=schluessel+schluessel;;

         }
    }
    // Entschlüsselt den Geheitext mit dem Vigenère-Algorithmus
    public void entschlusseln() {
        for (int i = 0; i < gt.length(); i++) {
            int n = this.buchstabenZuZahlen(gt.charAt(i));
            int m = this.buchstabenZuZahlen(schluessel.charAt(i));
            kt = kt + this.zahlenZuBuchstaben(n - m);
            while(schluessel.length()<kt.length()){
                schluessel=schluessel+schluessel;;

            }
        }
    }
    //Wandelt Buchstaben in Zahlen um.
    private char zahlenZuBuchstaben(int pWert){
         return (char) pWert;
    }
    //Wandelt Zahlen in Buchstaben.
    private int buchstabenZuZahlen(char pWert) {
         return (int) pWert;
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
