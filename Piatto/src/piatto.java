import java.util.Scanner;

public class piatto {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Il Nome: ");
        String titolo = sc.nextLine();

        System.out.println("La Descrizione: ");
        String autore = sc.nextLine();

        System.out.println("Il prezzo: ");
        Double prezzo = sc.nextDouble();
        sc.nextLine();

        System.out.println("La tipologia: ");
        String pagine = sc.nextLine();

        System.out.println("Le calorie: ");
        short calorie = sc.nextShort();
        sc.nextLine();

        System.out.println("La foto: ");
        String foto = sc.nextLine();

        System.out.println("Allergeni: ");
        String allergeni = sc.nextLine();

        sc.close();
    }
}
    

