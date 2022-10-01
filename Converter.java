import java.util.Scanner;
import java.text.DecimalFormat;
public class Converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.##");
        System.out.println("Enter temperature in F:");
        double T = scan.nextDouble();

        double K = (T -32)*(5.0/9)+(273.15);

        System.out.println("The temperature in kelvin is "+fmt.format(K));
    }
}
