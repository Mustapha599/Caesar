import javax.swing.plaf.FontUIResource;

public class Polybius extends Kryptomat {
    private int alphabetQuadrat [][];

public Polybius(){
super();
bfmS();
}
// i = Zeile , j=Spalte
private void bfmS(){
    int A =65;
    alphabetQuadrat = new int [6][6];
   //Durchläuft die Zeile
    for(int i=1; i < 6;i++){
        //Durchläuft die Spalte
        for (int j = 1; j < 6; j++) {
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
    for (int i = 0; i <kt.length() ; i++) {//geht durch Klartext durch
        for (int j = 1; j < 6 ; j++) {// zeile
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
