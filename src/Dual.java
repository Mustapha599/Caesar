public class Dual extends Kryptomat {
    int[][]Aquadrat;
    public Dual() {
        super();
    }

    public void verschluesseln() {
        for (int i = 0; i < kt.length(); i++) {
            int h= getASCII(kt.charAt(i));
            int d= (int)Math.pow(2,h);
            gt=gt+d;
        }
    }
    public void bmfS{
        int z= gt.length()/7;
        Aquadrat= new int[z][7];
        for (int i = 0; i <gt.length() ; i++) {

        }
    }


    public void entschluesseln() {

    }
}