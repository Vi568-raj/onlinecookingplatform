package services;

public class NotificationThread extends Thread {

    private String message;

    public NotificationThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000); // 3 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Notification: " + message);
    }
}
