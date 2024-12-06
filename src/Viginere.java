public class Viginere extends Kryptomat {



private String S; //Schlüssel für die Verschlüsselung



    public Viginere(){
         kt=""; //Entleert Klartext
         S=""; //Entleert Schlüsselwort
         gt=""; //Entleert Geheimtext
     }
    // Verschlüsselt den Klartext mit dem Vigenère-Algorithmus
    public void verschluesseln(){
        for (int i = 0; i < kt.length(); i++) {
            while(S.length()<kt.length()){
            S=S+S;;
        }    // Durchläuft die ganze Zeichenkette
            int h = this.getASCII(kt.charAt(i));
            int j = this.getASCII(S.charAt(i))-64;
            gt = gt + this.getChar(h+j);
        }
    }
    // Entschlüsselt den Geheitext mit dem Vigenère-Algorithmus
    public void entschluesseln() {
        for (int i = 0; i < gt.length(); i++) {
            while(S.length()<gt.length()){
            S= S+S;
            int n = this.getASCII(gt.charAt(i));
            int m = this.getASCII(S.charAt(i))-64;
            kt = kt + this.getChar(n - m);

            }
        }
    }



    public void setgt(String pGt) {
     gt=pGt;
}

    public void setkt(String pKt){
        kt = pKt;
}
   public String getS(){
         return S;
}
   public void setS(String pSchluessel){
  S= pSchluessel;
}







}
