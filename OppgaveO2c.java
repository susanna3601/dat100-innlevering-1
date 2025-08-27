import java.util.Scanner;

public class OppgaveO2c {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 1; i<11; i++) {
            int Poengsum;

         while (true) {
             System.out.print("Skriv in poengsum til student " + i + " : ");
             Poengsum = input.nextInt();

        if (Poengsum < 0 || Poengsum > 100) {
            System.out.println("ugyldig poengsum.");
            } else {
            break;
        }
            }
            
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
            }
        }

        input.close();

    }
}