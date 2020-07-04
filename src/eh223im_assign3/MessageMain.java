package eh223im_assign3;

public class MessageMain {
    public static void main(String[] args) {
        Message m = new Message("Hello World");
        SMS sms = new SMS("0123456789",m.getText()+" from SMS.");
        System.out.println(sms.toString());
        System.out.println(sms.encode(sms.getText()));
        Email e = new Email("alice@gmail.com","bob@gmail.com","Hello Bob",m.getText()+" from email.");
        System.out.println(e.toString());
        System.out.println(e.encode(e.getText()));
    }
}
