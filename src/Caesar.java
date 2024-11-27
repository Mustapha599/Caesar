public class Caesar extends Kryptomat {
    private String kt;
    private int S;
    private String gt;


    public Caesar() {
    kt="";  //Entleert Klartext
    S=0; //Entleert Schlüssel
    gt=""; //Entleert Geheimtext
    } ;
   // Verschlüsselt den Klartext mit dem Cäsar-Algorithmus
    public void verschluesseln() {

        for (int i = 0; i < kt.length(); i++) {
            int h = this.getASCII(kt.charAt(i));
            gt = gt + this.getChar(h + S);
        }
    }
    // Entschlüsselt den Geheimtext mit dem Cäsar-Algorithmus
    public void entschluesseln() {

        for (int i = 0; i < gt.length() ; i++) {
            int h = this.getASCII(gt.charAt(i));
            kt = kt + this.getChar(h - S);

        }
    }

    //Wandelt Buchstaben in Zahlen um.
    public int getASCII(char pWert) {
        return (int) pWert;
    }



    public int getS() {
        return S;
    }



    public void setS(int pWert) {
        S = pWert;
    }





}

