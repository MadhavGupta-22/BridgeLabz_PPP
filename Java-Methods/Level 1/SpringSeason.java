package JavaMethod.Level1;
import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        if (isSpring(month, day)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
        scanner.close();
    }
}

