
import java.util.Scanner;


public class metod_asalkontolu {
    public static void asal (){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }
            if (sayac >= 0){
                System.out.println("Sayı asal değildir");
            }
            else{
                System.out.println("Sayı asaldır");
            }
    }

    public static void main(String[] args) {
        asal();
    }
    
}
