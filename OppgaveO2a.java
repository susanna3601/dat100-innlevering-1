import java.util.Scanner;

public class OppgaveO2a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Poengsum: ");
        int Poengsum = input.nextInt();

        if (Poengsum >= 0 && Poengsum <= 39) {
            System.out.println("Karakter: F");
        } else if (Poengsum >= 40 && Poengsum <= 49) {
            System.out.println("Karakter: E");
        } else if (Poengsum >= 50 && Poengsum <= 59) {
            System.out.println("Karakter: D");
        } else if (Poengsum >= 60 && Poengsum <= 79) {
            System.out.println("Karakter: C");
        } else if (Poengsum >= 80 && Poengsum <= 89) {
            System.out.println("Karakter: B");
        } else if (Poengsum >= 90 && Poengsum <= 100) {
            System.out.println("Karakter: A");
        } else {
            System.out.println("ugyldig poengsum");
        }

        input.close();

    }
}
