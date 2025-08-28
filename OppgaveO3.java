import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {

        int n = 1;
        long i = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv et heltall (>0): ");
        int num = input.nextInt();

        if (num <= 0 ) {
            System.out.println("error skriv et tall større enn 0!");
        } else {
            while (n <= num) {
                i = i * n;
                n++;
            }
            System.out.println("fakultet av " + num + " = " + i);
        }


        input.close();

    }
}
