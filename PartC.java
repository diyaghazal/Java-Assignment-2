import java.util.Scanner;
public class PartC {
    public static String
    toPartCCustom(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        String result = toPartCCustom(num);
        System.out.println("Binary String:" + result);
    }
}
