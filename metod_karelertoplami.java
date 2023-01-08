
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class metod_karelertoplamı {
    public static void sum (){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Bir n sayısı giriniz: ");
        int n = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Toplam: "+sum);
    }

    public static void main(String[] args) {
        sum();
    }
    
}
