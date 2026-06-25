package designpatternsandprinciple.ques5;

public abstract class NotifierDecorater implements Notifier {

    protected Notifier notifier;

    public NotifierDecorater(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}