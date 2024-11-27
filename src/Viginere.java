public class Viginere extends Kryptomat {

private String gt; //Geheimtext
private String kt; // Klartextextends Kryptomat
private String S; //Schlüssel für die Verschlüsselung



    public Viginere(){
         kt=""; //Entleert Klartext
         S=""; //Entleert Schlüsselwort
         gt=""; //Entleert Geheimtext
     }
    // Verschlüsselt den Klartext mit dem Vigenère-Algorithmus
    public void verschluesseln(){
        for (int i = 0; i < kt.length(); i++) {     // Durchläuft die ganze Zeichenkette
            int h = this.getASCII(kt.charAt(i));
            int j = this.getASCII(S.charAt(i))-64;
            System.out.println("Test");
            gt = gt + this.getChar(h+j);
            System.out.println(gt + "Test2");
        } while(S.length()<kt.length()){
           S=S+S;;

         }
    }
    // Entschlüsselt den Geheitext mit dem Vigenère-Algorithmus
    public void entschluesseln() {
        for (int i = 0; i < gt.length(); i++) {
            int n = this.getASCII(gt.charAt(i));
            int m = this.getASCII(S.charAt(i));
            kt = kt + this.getChar(n - m);
            while(S.length()<kt.length()){
                S= S+S;;

            }
        }
    }
    //Wandelt Buchstaben in Zahlen um.
    public int getASCII(char pWert) {
        return (int) pWert;
    }
    //Wandelt Zahlen in Buchstaben.
   public char getChar(int pWert){

        return (char) pWert;}

    public void setgt(String pGt) {

}
     public String getkt(){
         return kt;
}
    public void setkt(String pKt){

}
   public String getS(){
         return S;
}
   public void setS(String pSchluessel){

}







}
