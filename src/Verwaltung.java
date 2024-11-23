import java.util.Scanner;
public class Verwaltung {

    private Scanner scanner;
    private Caesar caesar;
    private Viginere viginere;

    public static void main(String[] args) {
        new Verwaltung();
    }

    public Verwaltung() {

        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Caesar verschuesseln");
            System.out.println("[2] Caesar entschuesseln ");
            System.out.println("[0] Beenden");
            System.out.println("[3] Viginere verschuesseln");
            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setKt(zeichenkette);
                this.caesar.setS(schluessel);
                System.out.println("========Klartext=====");
                System.out.println(this.caesar.getKt());
                this.caesar.verschuesseln();
                System.out.println("========Geheimtext=====");
                System.out.println(this.caesar.getgt());


            } else if (option == 2) {
                System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                caesar = new Caesar();
                this.caesar.setgt(zeichenkette);
                this.caesar.setS(schluessel);
                System.out.println("========Geheimtext=====");
                System.out.println(zeichenkette);
                this.caesar.entschuesseln();
                System.out.println("========Klartext=====");
                System.out.println(this.caesar.getKt());

            } else if (option == 0) {
                break;
            }else if (option == 3) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib das Codewort an:");
                String schluesselString = scanner.nextLine();
                String schluessel = String.join(schluesselString);
                viginere = new Viginere();
                this.viginere.setkt(zeichenkette);
                this.viginere.setschluessel(schluessel);
                System.out.println("========Klartext=====");
                System.out.println(this.viginere.getkt());
                this.viginere.verschlusseln();
                System.out.println("========Geheimtext=====");
                System.out.println(this.viginere.getgt());

            }
        }
    }
}



