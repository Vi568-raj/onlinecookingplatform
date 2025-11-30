package models;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password, "admin");
    }

    @Override
    public void openDashboard() {
        System.out.println("Opening Admin Dashboard (Admin user)");
    }
}
