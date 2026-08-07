import java.util.Scanner;
public class UserInput1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter byte value : ");
        byte a = scan.nextByte();
        System.out.println("Byte values is " + a);

        System.out.println("Enter short value : ");
        short b = scan.nextShort();
        System.out.println("Short value is : " + b);

        System.out.println("Enter integer value :");
        int c = scan.nextInt();
        System.out.println("Integer value is : " + c);
  }
}