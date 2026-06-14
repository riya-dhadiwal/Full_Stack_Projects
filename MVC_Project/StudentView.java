public class StudentView {

    public void displayStudent(Student student) {

        System.out.println("\n------------------------");
        System.out.println("ID      : " + student.getId());
        System.out.println("Name    : " + student.getName());
        System.out.println("Course  : " + student.getCourse());
        System.out.println("Email   : " + student.getEmail());
        System.out.println("------------------------");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}