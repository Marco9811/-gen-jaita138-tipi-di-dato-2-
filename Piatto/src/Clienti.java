import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.w3c.dom.views.DocumentView;

public class Clienti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Il Cliente: ");
        String Nome = sc.nextLine();

        System.out.println("Il telefono: ");
        String NumTelefono = sc.nextLine();

        System.out.println("L'email: ");
        String email = sc.nextLine();

        System.out.println("Citta: ");
        String Citta = sc.nextLine();
        
        System.out.print("Inserisci la data e l'ora (gg/mm/aaaa) alle 00:00: ");
        String dataTimeString = sc.nextLine();

        System.out.println("Celiachia: ");
        String allergie = sc.nextLine();
        sc.nextLine();
        
        sc.close();
    }
}


