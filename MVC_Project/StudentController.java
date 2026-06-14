import java.util.ArrayList;
import java.util.Iterator;

public class StudentController {

    private ArrayList<Student> students;
    private StudentView view;

    public StudentController(StudentView view) {
        this.view = view;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {

        for (Student s : students) {
            if (s.getId() == student.getId()) {
                view.displayMessage(
                        "Student ID already exists!");
                return;
            }
        }

        students.add(student);
        view.displayMessage(
                "Student Added Successfully!");
    }

    public void viewAllStudents() {

        if (students.isEmpty()) {
            view.displayMessage(
                    "No Students Found!");
            return;
        }

        for (Student s : students) {
            view.displayStudent(s);
        }

        System.out.println(
                "\nTotal Students: " +
                students.size());
    }

    public void searchStudent(int id) {

        for (Student s : students) {

            if (s.getId() == id) {
                view.displayStudent(s);
                return;
            }
        }

        view.displayMessage(
                "Student Not Found!");
    }

    public void updateStudent(int id,
                              String name,
                              String course,
                              String email) {

        for (Student s : students) {

            if (s.getId() == id) {

                s.setName(name);
                s.setCourse(course);
                s.setEmail(email);

                view.displayMessage(
                        "Student Updated Successfully!");
                return;
            }
        }

        view.displayMessage(
                "Student Not Found!");
    }

    public void deleteStudent(int id) {

        Iterator<Student> iterator =
                students.iterator();

        while (iterator.hasNext()) {

            Student s = iterator.next();

            if (s.getId() == id) {

                iterator.remove();

                view.displayMessage(
                        "Student Deleted Successfully!");
                return;
            }
        }

        view.displayMessage(
                "Student Not Found!");
    }
}