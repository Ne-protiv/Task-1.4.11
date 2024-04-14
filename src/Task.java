import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день");
        String day = sc.nextLine();
        System.out.println(isWeekend(day));
    }

    public static boolean isWeekend(String weekDay) {
        if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
            return true;
        }
        return false;
    }
}
