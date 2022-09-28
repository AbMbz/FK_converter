import java.util.Scanner;
public class Converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in F:");
        double T = scan.nextDouble();

        double K = T + 273.15;

        System.out.println("The temperature in kelvin is "+K);
    }
}
