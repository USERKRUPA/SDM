import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        int rev = reverseNo(number);

        // output
        System.out.println("Reverse of " + number + " is: " + rev);

        scanner.close();
    }

    // method to reverse a given number
    private static int reverseNo(int num) {
        int reverse = 0;

        while (num != 0) {
            int dig = num % 10;
            reverse = reverse * 10 + dig;
            num /= 10;
        }

        return reverse;
    }
}
