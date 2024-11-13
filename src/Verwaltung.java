import.java.util.Scanner;
public class Verwaltung {

    private Scanner scanner;
    private Caesar caesar;
    public static void main(String[] args){ new Verwaltung();}
    public Verwaltung(){

        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Caesar verschuesseln");
            System.out.println("[2] Caesar entschuesseln ");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schuessel = scanner.nextLine();
                int schluessel = Integer.parseInt(schluessel);
                caesar = new Caesar();
                this.caesar.setKt(zeichenkette);
                this.caesar.setKt(schluessel);
                System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
                System.out.println(this.caesar.getKt());
                this.caesar.verschuesseln();
                System.out.println("Gib den Schlüsseln an:");
                System.out.println(this.caesar.getgt());

            } else if (option == 2) {
                // this.sendMessage();

                String zeichenkette = scanner.nextLine();

                String schuesselString = scanner.nextLine();


            System.out.println();
        }
    }



}
}

