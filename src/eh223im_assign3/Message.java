package eh223im_assign3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String callMeWhenYouNeedSomeHelp() {
        return text;
    }

    public String encode() {
        StringBuilder sb = new StringBuilder();
        char[] temp1 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] temp2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] temp3 = text.toCharArray();

        ArrayList<Character> al1 = new ArrayList<>();
        for (char i:temp1) {
            al1.add(i);
        }

        ArrayList<Character> al2 = new ArrayList<>();
        for (char i:temp2) {
            al2.add(i);
        }

        ArrayList<Character> al3 = new ArrayList<>();
        for (char i:temp3) {
            al3.add(i);
        }

        for (int i = 0; i< al3.size(); i++) {
            char j = al3.get(i);
            if (al1.contains(j)) {
                j = al1.get( (al1.indexOf(j) + 1) % 26);
            } else if (al2.contains(j)) {
                j = al2.get( (al2.indexOf(j) + 1) % 26);
            }
            al3.set(i,j);
        }

        for (Character character : al3) {
            sb.append(character);
        }

        return sb.toString();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class SMS extends Message {
    private String recipientContactNo;

    public SMS(String recipientContactNo,String text) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    public String toString() {
        ArrayList<String> al = new ArrayList<String>();
        al.add(recipientContactNo);
        al.add(callMeWhenYouNeedSomeHelp());
        return al.toString();
    }
}

class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    public Email(String sender, String receiver, String subject, String text) {
        super(text);
        this.sender=sender;
        this.receiver=receiver;
        this.subject=subject;
    }

    public String toString() {
        ArrayList<String> al = new ArrayList<String>();
        al.add(sender);
        al.add(receiver);
        al.add(subject);
        al.add(callMeWhenYouNeedSomeHelp());
        return al.toString();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
