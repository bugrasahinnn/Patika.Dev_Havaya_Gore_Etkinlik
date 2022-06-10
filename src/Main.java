import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Sicaklik giriniz(Celcius Cinsinden) : ");
        Scanner inp = new Scanner(System.in);
        int celcius = inp.nextInt();
        if (celcius>25){
            System.out.println("Yuzmeye gidebilirsiniz.");
        } else if (celcius<=25) {
            if (celcius>15){
                System.out.println("Piknige gidebilirsiniz.");
            } else if (celcius<=15) {
                if (celcius>=5){
                    System.out.println("Sinemaya gidebilirsiniz.");
                }
                else {
                    System.out.println("Kayak yapabilirsiniz.");
                }
            }
        }
    }
}