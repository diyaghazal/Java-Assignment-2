import java.util.Scanner;
 public class PartA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integar:");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);
    }
}

