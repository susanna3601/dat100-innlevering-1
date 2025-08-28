import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {

        int n = 1;
        long i = 1;
        int num;

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.print("Skriv et heltall (>0): ");
            num = input.nextInt();

            if (num > 0) {
                while (n <= num) {
                    i = i * n;
                    n++;
                }
                System.out.println("Fakultet av " + num + " = " + i);
                break;
            }else{
                System.out.println("Error skriv et tall større enn 0!");
            }
        }



        input.close();

    }
}
