package JavaMethod.Level1;
import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int perChild = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        return new int[]{perChild, remaining};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Chocolates per child: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
        scanner.close();
    }
}

