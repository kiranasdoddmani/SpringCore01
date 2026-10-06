package ISA;

public class EmailNotification extends Notification{
    @Override
    public void Send() {
        System.out.println("Sending EmailNotification...");
    }
}
