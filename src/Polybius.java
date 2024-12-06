public class Polybius extends Kryptomat {
    private int alphabetQuadrat [][];

public Polybius(){
super();
}
// i = Zeile , j=Spalte
private void bfmS(){
    int A =65;
    alphabetQuadrat = new int [5][5];
   //Durchläuft die Zeile
    for(int i=0; i < alphabetQuadrat.length-1;i++){
        //Durchläuft die Spalte
        for (int j = 0; j < alphabetQuadrat.length-1; j++) {
            alphabetQuadrat[i][j]=A;
        //Falls Stelle A gleich I dann erhöhe um 1. Dann haben wir J
            if(A==73) {
                A++;
            }
            A++;
        }
    }



}
    public void verschluesseln(){
        gt="";
        for (int i = 0; i <kt.length() ; i++) {//ghet durch Klartext durch
            for (int j = 1; j < 6; j++) {// zeile
                for (int h = 1; h < 6; h++) {//spalte
                    if (kt.charAt(i) ==alphabetQuadrat[j][h]) {
                        gt=gt+j+h;

                    }

                }
            }
        }




}
public void entschluesseln(){

}



}
