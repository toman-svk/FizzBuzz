import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        final boolean DIVISIBLE_BY_5 = number % 5 == 0;
        final boolean DIVISIBLE_BY_3 = number % 3 == 0;

        if (DIVISIBLE_BY_5 && DIVISIBLE_BY_3)
            System.out.println("FizzBuzz");
        else if (DIVISIBLE_BY_5)
            System.out.println("Fizz");
        else if (DIVISIBLE_BY_3)
            System.out.println("Buzz");
        else System.out.print(number);

        scanner.close();

    }
}