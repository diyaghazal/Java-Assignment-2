import java.util.Scanner;
public class PartB {
    public static int[] toPartB(int num){
    int temp = num;
    int count = 0;
    while(temp > 0){
        temp = temp/2;
        count++;
    }
    int[] binary = new int[count];
    for(int i = count-1; i >= 0; i--){
        binary[i] = num%2;
        num = num/2;
    }
    return binary;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int[] result = toPartB(num);
        System.out.println("Binary Array:");
        for(int bit : result){
            System.out.println(bit);
        }
    }
}
