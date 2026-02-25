import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }

    public void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Course: " + course);
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ================= ADD STUDENT =================
    public static void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            // Duplicate ID check
            for (Student s : students) {
                if (s.getId() == id) {
                    System.out.println("❌ ID already exists!");
                    return;
                }
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            students.add(new Student(id, name, age, course));
            System.out.println("✅ Student Added Successfully!");

        } catch (Exception e) {
            System.out.println("❌ Invalid input! Please enter correct data.");
            sc.nextLine();
        }
    }

    // ================= VIEW STUDENTS =================
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("❌ No students found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    // ================= SEARCH BY ID =================
    public static void searchById() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }

        System.out.println("❌ Student Not Found.");
    }

    // ================= SEARCH BY NAME =================
    public static void searchByName() {
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.display();
                found = true;
            }
        }

        if (!found)
            System.out.println("❌ Student Not Found.");
    }

    // ================= SEARCH BY COURSE =================
    public static void searchByCourse() {
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        boolean found = false;

        for (Student s : students) {
            if (s.getCourse().equalsIgnoreCase(course)) {
                s.display();
                found = true;
            }
        }

        if (!found)
            System.out.println("❌ No students found in this course.");
    }

    // ================= UPDATE STUDENT =================
    public static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {

                System.out.println("1. Update Name");
                System.out.println("2. Update Age");
                System.out.println("3. Update Course");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        s.setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new age: ");
                        s.setAge(sc.nextInt());
                        break;
                    case 3:
                        System.out.print("Enter new course: ");
                        s.setCourse(sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }

                System.out.println("✅ Student Updated Successfully!");
                return;
            }
        }

        System.out.println("❌ Student Not Found.");
    }

    // ================= DELETE STUDENT =================
    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("✅ Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("❌ Student Not Found.");
    }

    // ================= STATISTICS =================
    public static void showStatistics() {

        if (students.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        System.out.println("Total Students: " + students.size());

        int sum = 0;
        for (Student s : students) {
            sum += s.getAge();
        }

        double avg = (double) sum / students.size();
        System.out.println("Average Age: " + avg);
    }

    // ================= COUNT PER COURSE =================
    public static void countPerCourse() {

        if (students.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        int count = 0;

        for (Student s : students) {
            if (s.getCourse().equalsIgnoreCase(course)) {
                count++;
            }
        }

        System.out.println("Total students in " + course + ": " + count);
    }

    // ================= MAIN MENU =================
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Course");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Show Statistics");
            System.out.println("9. Count Students Per Course");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchById(); break;
                case 4: searchByName(); break;
                case 5: searchByCourse(); break;
                case 6: updateStudent(); break;
                case 7: deleteStudent(); break;
                case 8: showStatistics(); break;
                case 9: countPerCourse(); break;
                case 10: System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid Choice!");
            }

        } while (choice != 10);
    }
}
