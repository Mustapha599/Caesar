public class Viginere {

private String gt;
private String kt;
private String schluessel;


     public Viginere(){
         kt="";
         schluessel="";
         gt="";
     }

     public void verschlusseln(){
         for (int i = 0; i < kt.length(); i++) {
             int h = this.zahlenZuBuchstaben(kt.charAt(i));
             int j = this.buchstabenZuZahlen(schluessel.charAt(i%schluessel.length()));
             gt = gt + this.buchstabenZuZahlen(h + schluessel);
         }
     }
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
   public String getSchluessek(){
         return schluessel;
}
   public void setSchluessel(String pSchluessel){

}







}
