import java.util.Scanner;

public class CalcPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(Math.pow(num, num));
    }
}
