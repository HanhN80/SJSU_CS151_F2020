import java.util.Scanner;

public class IntToHex {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;
        String S1 = new String("LowerCase convert to UperCase");
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a decimal number : ");
        num =input.nextInt();

        // calling method toHexString()
        S1 = Integer.toHexString(num);
        System.out.println("Decimal to hexadecimal: " + S1.toUpperCase());



    }

}
