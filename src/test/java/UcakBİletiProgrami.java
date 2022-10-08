import java.util.Scanner;

public class UcakBİletiProgrami {
    public static void main(String[] args) {

        int distance, age, flightType = 0;
        double farePerDistance = 0.10, totalFare = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuğunuz kac km sürecek?: ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        totalFare = farePerDistance * distance;


        if (distance < 0 || age < 0 || flightType > 2) {
            System.out.println("Hatalı giriş yaptınız");
            System.exit(0);
        } else if (age < 12) {
            totalFare = totalFare / 2;
        } else if (age >= 12 && age <= 24) {
            totalFare = totalFare * 0.9;
        } else if (age > 65) {
            totalFare = totalFare * 0.7;
        }

        System.out.print("Son bir adım kaldı. Yolculuk tipnizi seçiniz (1 -> Tek Yön - 2 -> Gidiş-Dönüş): ");
        flightType = input.nextInt();

        if (flightType == 2) {
            totalFare = totalFare * 2 * 0.8;
        }

        System.out.println("Bilet tutarınız: " + totalFare);

    }
}