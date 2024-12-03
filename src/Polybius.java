import javax.swing.plaf.FontUIResource;

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

            if(A==73) {
                A++;
            }
            A++;
        }
    }



}
public void verschluesseln(){





}
public void entschluesseln(){

}



}
