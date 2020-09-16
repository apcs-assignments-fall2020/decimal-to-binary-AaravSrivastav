import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int val = 0;
        for(int i = 0; i<binary.length(); i++)
        {
            if(binary.charAt(binary.length()-i-1) == '1')
            {
                val += Math.pow(2, i);
            }
        }
        return val;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        String binary = scan.next();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(binary));
        scan.close();
    }
}
