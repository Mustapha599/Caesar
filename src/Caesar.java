public class Caesar extends Kryptomat {

    private int S;


    public Caesar() {
        super();
        S=0; //Entleert Schlüssel
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
        kt="";
        for (int i = 0; i < gt.length() ; i++) {
            int h = this.getASCII(gt.charAt(i));
            kt = kt + this.getChar(h - S);

        }
    }


    public int getS() {
        return S;
    }



    public void setS(int pWert) {
        S = pWert;
    }


}

