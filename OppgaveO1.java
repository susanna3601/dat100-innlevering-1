import java.util.Scanner;
public class OppgaveO1 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Hva er bruttoinntekten din? ");
        String BrukerInput = input.nextLine();

        BrukerInput = BrukerInput.replace(" ","");
        double Bruttoinntekt = Double.parseDouble(BrukerInput);

        double Trinnskatt = 0.0;

        if (Bruttoinntekt <= 217400) {
            System.out.println("Ingen trinnskatt");
        } else {
            if (Bruttoinntekt >=217401 && Bruttoinntekt <= 306050) {
            Trinnskatt = Bruttoinntekt * 0.017;
        } else if (Bruttoinntekt >=306051 && Bruttoinntekt <= 697150) {
            Trinnskatt = Bruttoinntekt * 0.040;
        } else if (Bruttoinntekt >=697151 && Bruttoinntekt <=942400) {
            Trinnskatt = Bruttoinntekt * 0.137;
        } else if (Bruttoinntekt >=942401 && Bruttoinntekt <= 1410750) {
            Trinnskatt = Bruttoinntekt * 0.167;
        } else {
            Trinnskatt = Bruttoinntekt * 0.177;
        }
            System.out.printf("Din trinnskatt er: %.2f kr", Trinnskatt);
        }

        input.close();
    }
}

