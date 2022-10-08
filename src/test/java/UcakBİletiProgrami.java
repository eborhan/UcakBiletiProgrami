import java.util.Scanner;

public class UcakBİletiProgrami {
    public static void main(String[] args) {

// kullanıcı mesave ve yaş girişleri

        int distance, age, flightType;
        double farePerDistance = 0.10, totalFare = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuğunuz kac km sürecek?: ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

// standart ücreti tanımlama

        totalFare = farePerDistance * distance;
// giriş hataları ve indirimleri tanımlama

        if (distance < 0 || age < 0) {
            System.out.println("Hatalı giriş yaptınız");
            System.exit(0);
        } else
            if (age < 12) {
                totalFare = totalFare / 2;
            } else if (age >= 12 && age <= 24) {
                totalFare = totalFare * 0.9;
            } else if (age > 65) {
                totalFare = totalFare * 0.7;
            }
// gidiş dönüş hatalı girişler ve indirim tanımlama

        System.out.print("Son bir adım kaldı. Yolculuk tipnizi seçiniz (1 -> Tek Yön - 2 -> Gidiş-Dönüş): ");
        flightType = input.nextInt();

        if (flightType != 1 && flightType != 2){
            System.out.println("Hatalı giriş yaptınız");
            System.exit(0);
        }else if (flightType == 2) {
            totalFare = totalFare * 2 * 0.8;
        }
// nihai bilet tutarını ekrana yazdırma

        System.out.println("Bilet tutarınız: " + totalFare+"TL");
       
    }

}
