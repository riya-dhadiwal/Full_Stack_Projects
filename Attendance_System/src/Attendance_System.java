import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String status;

    Student(int rollNo, String name, String status) {
        this.rollNo = rollNo;
        this.name = name;
        this.status = status;
    }
}

public class Attendance_System {

    static final String FILE_NAME = "attendance.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n========= Attendance Management System =========");
            System.out.println("1. Mark Attendance");
            System.out.println("2. View Attendance");
            System.out.println("3. Search Student");
            System.out.println("4. Attendance Summary");
            System.out.println("5. Calculate Attendance Percentage");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    markAttendance(sc);
                    break;

                case 2:
                    viewAttendance();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    attendanceSummary();
                    break;

                case 5:
                    calculatePercentage(sc);
                    break;

                case 6:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }

    // MARK ATTENDANCE
    static void markAttendance(Scanner sc) {

        try {

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Status (Present/Absent): ");
            String status = sc.nextLine();

            // Check duplicate attendance
            if (isAlreadyMarked(rollNo)) {
                System.out.println("Attendance already marked for today!");
                return;
            }

            Student s = new Student(rollNo, name, status);

            FileWriter fw = new FileWriter(FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);

            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String dateTime = now.format(formatter);

            bw.write(s.rollNo + " | " +
                    s.name + " | " +
                    s.status + " | " +
                    dateTime);

            bw.newLine();
            bw.close();

            System.out.println("Attendance Saved Successfully!");

        } catch (Exception e) {
            System.out.println("Error while saving attendance.");
        }
    }

    // VIEW ATTENDANCE
    static void viewAttendance() {

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                System.out.println("No attendance records found.");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            System.out.println("\n========= Attendance Records =========");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }

    // SEARCH STUDENT
    static void searchStudent(Scanner sc) {

        try {

            System.out.print("Enter Student Name to Search: ");
            String searchName = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {

                if (line.toLowerCase().contains(searchName.toLowerCase())) {
                    System.out.println(line);
                    found = true;
                }
            }

            br.close();

            if (!found) {
                System.out.println("Student Record Not Found.");
            }

        } catch (Exception e) {
            System.out.println("Error searching student.");
        }
    }

    // ATTENDANCE SUMMARY
    static void attendanceSummary() {

        int present = 0;
        int absent = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = br.readLine()) != null) {

                if (line.toLowerCase().contains("present")) {
                    present++;
                } else if (line.toLowerCase().contains("absent")) {
                    absent++;
                }
            }

            br.close();

            System.out.println("\n========= Attendance Summary =========");
            System.out.println("Total Present : " + present);
            System.out.println("Total Absent  : " + absent);

        } catch (Exception e) {
            System.out.println("Error generating summary.");
        }
    }

    // CALCULATE ATTENDANCE PERCENTAGE
    static void calculatePercentage(Scanner sc) {

        try {

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            int total = 0;
            int present = 0;

            while ((line = br.readLine()) != null) {

                if (line.startsWith(String.valueOf(rollNo))) {

                    total++;

                    if (line.toLowerCase().contains("present")) {
                        present++;
                    }
                }
            }

            br.close();

            if (total == 0) {
                System.out.println("No attendance records found.");
                return;
            }

            double percentage = ((double) present / total) * 100;

            System.out.printf("Attendance Percentage: %.2f%%\n", percentage);

        } catch (Exception e) {
            System.out.println("Error calculating percentage.");
        }
    }

    // CHECK DUPLICATE ATTENDANCE
    static boolean isAlreadyMarked(int rollNo) {

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return false;
            }

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            String today =
                    LocalDate.now().format(
                            DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            while ((line = br.readLine()) != null) {

                if (line.startsWith(String.valueOf(rollNo))
                        && line.contains(today)) {

                    br.close();
                    return true;
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error checking duplicate attendance.");
        }

        return false;
    }
}
