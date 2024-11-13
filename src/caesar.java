class Caesar {
    private String Kt;
    private int S;
    private String gt;



    public void casar() {

    };

    public void verschuesseln(){
        for(int i=0; i< Kt.length()-1; i++) {
            int h = this.getASCII(Kt.charAt(i));
            gt = gt + this.getChar(h+ S);
        }
    }

    public void entschuessel() {
        for(int i=0; i< gt.length()-1; i++){
            int h = this.getASCII(gt.charAt(i));
            gt = gt + this.getChar(h-S);

        }
    }

    //Wandelt Buchstaben in Zahlen um.
    public int getASCII(char pWert) {
    return (int)pWert;
    }


    //Wandelt Zahlen in Buchstaben
    public char getChar(int pWert) {
        return (char)pWert;
    }

    public void getKt(String pWert) {

    };

    public String getKt() {
   return Kt;
    }

    public int getS() {
    return S;
    }
    public void setgt(String pWert){
     gt= pWert;
    }
    public void setS(int pWert) {
        S = pWert;
    }
    public void setKt() {

    }
}