package Mypackage;
import java.util.Scanner;

class Timetable {
    public String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private String[][] timetable = new String[5][4]; // 5 days, 4 periods each

    public void addSubject(int dayIndex, int periodIndex, String subject) {
        if (dayIndex >= 0 && dayIndex < 5 && periodIndex >= 0 && periodIndex < 4) {
            timetable[dayIndex][periodIndex] = subject;
        } else {
            System.out.println("Invalid day or period!");
        }
    }

    public void displayTimetable() {
        System.out.println("Timetable:");
        System.out.format("%-10s%-15s%-15s%-15s%-15s%n", "Day", "Period 1", "Period 2", "Period 3", "Period 4");
        for (int i = 0; i < 5; i++) {
            System.out.format("%-10s", days[i]);
            for (int j = 0; j < 4; j++) {
                System.out.format("%-15s", timetable[i][j]);
            }
            System.out.println();
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timetable timetable = new Timetable();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter subjects for " + timetable.days[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter subject for Period " + (j + 1) + ": ");
                String subject = scanner.nextLine();
                timetable.addSubject(i, j, subject);
            }
        }

        timetable.displayTimetable();
    }
}



