package models;

public class Student extends User {

    public Student(String username, String password) {
        super(username, password, "student");
    }

    @Override
    public void openDashboard() {
        System.out.println("Opening Student Dashboard (Student user)");
    }
}
