package designpatternsandprinciple.ques5;


public class SlackNotifierDecorater extends NotifierDecorater {

    public SlackNotifierDecorater(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending notification via Slack");
    }
}