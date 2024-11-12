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
                String schuesselString = scanner.nextLine();


            } else if (option == 2) {
                // this.sendMessage();
                System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schuesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.sekKt
                System.out.println("Ist dein Wort ein Palindrom? Die Antwort lautet: "+this.test.isIstPalindrom());
            }
            else if (option == 0) {
                break;
            }
            System.out.println();
        }
    }



}
    }
}
