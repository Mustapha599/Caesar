class Caesar extends Kryptomat {
    private String Kt;
    private int S;
    private String gt;


    public Caesar() {
    Kt="";  //Entleert Klartext
    S=0; //Entleert Schlüssel
    gt=""; //Entleert Geheimtext
    } ;
   // Verschlüsselt den Klartext mit dem Cäsar-Algorithmus
    public void verschuesseln() {

        for (int i = 0; i < Kt.length(); i++) {
            int h = this.getASCII(Kt.charAt(i));
            gt = gt + this.getChar(h + S);
        }
    }
    // Entschlüsselt den Geheimtext mit dem Cäsar-Algorithmus
    public void entschuesseln() {

        for (int i = 0; i < gt.length() ; i++) {
            int h = this.getASCII(gt.charAt(i));
            Kt = Kt + this.getChar(h - S);

        }
    }

    //Wandelt Buchstaben in Zahlen um.
    public int getASCII(char pWert) {
        return (int) pWert;
    }


    //Wandelt Zahlen in Buchstaben
    private char getChar(int pWert) {
        return (char) pWert;
    }

    public void getKt(String pWert) {

    }



    public String getKt() {
        return Kt;
    }

    public int getS() {
        return S;
    }

    public void setgt(String pWert) {
        gt = pWert;
    }

    public void setS(int pWert) {
        S = pWert;
    }

    public void setKt(String pWert) {
    Kt= pWert;
    }

    public String getgt() {
        return gt;
    }

}

