import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentView view = new StudentView();
        StudentController controller =
                new StudentController(view);

        int choice;

        do {

            System.out.println(
                    "\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    controller.addStudent(
                            new Student(
                                    id,
                                    name,
                                    course,
                                    email));

                    break;

                case 2:

                    controller.viewAllStudents();
                    break;

                case 3:

                    System.out.print(
                            "Enter Student ID: ");

                    controller.searchStudent(
                            sc.nextInt());

                    break;

                case 4:

                    System.out.print(
                            "Enter Student ID: ");

                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print(
                            "Enter New Name: ");
                    String newName =
                            sc.nextLine();

                    System.out.print(
                            "Enter New Course: ");
                    String newCourse =
                            sc.nextLine();

                    System.out.print(
                            "Enter New Email: ");
                    String newEmail =
                            sc.nextLine();

                    controller.updateStudent(
                            updateId,
                            newName,
                            newCourse,
                            newEmail);

                    break;

                case 5:

                    System.out.print(
                            "Enter Student ID: ");

                    controller.deleteStudent(
                            sc.nextInt());

                    break;

                case 6:

                    System.out.println(
                            "Thank You!");
                    break;

                default:

                    System.out.println(
                            "Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
