package designpatternsandprinciple.ques5;

public class DecoraterTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Email Notification:");
        notifier.send();

        System.out.println();

        System.out.println("Email + SMS Notification:");
        Notifier smsNotifier =
                new SMSNotifierDecorater(new EmailNotifier());
        smsNotifier.send();

        System.out.println();

        System.out.println("Email + SMS + Slack Notification:");
        Notifier allNotifier =
                new SlackNotifierDecorater(
                        new SMSNotifierDecorater(
                                new EmailNotifier()));

        allNotifier.send();
    }
}