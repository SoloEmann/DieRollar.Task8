import java.util.Random;
import java.util.Scanner;

class DieRollar {
    public static void main(String[] args) {

        // Task 8: Die Roller
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String again = "y";

        while (again.equalsIgnoreCase("y")) {

            int roll = 0;
            int die1 = 0;
            int die2 = 0;
            int die3 = 0;

            System.out.println("Task 8: Die Roller");
            System.out.printf("%-6s %-6s %-6s %-6s %-6s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");

            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;

                roll++;

                System.out.printf("%-6d %-6d %-6d %-6d %-6d%n",
                        roll, die1, die2, die3, die1 + die2 + die3);

            } while (die1 != die2 || die2 != die3);

            System.out.print("Roll again? (y/n): ");
            again = input.nextLine();
        }

        input.close();
    }
}
