package designpatternsandprinciple.ques5;


public class SMSNotifierDecorater extends NotifierDecorater {

    public SMSNotifierDecorater(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending notification via SMS");
    }
}
