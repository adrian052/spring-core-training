package decorator;

public class DecoratorPattern {

    // TODO implement two Senders with enriched logic:
    // 1. Decorator with 2 retries if the message hasn't been sent (threw a RuntimeException)
    // 2. Decorator that removes all leading and trailing non-alphanumeric symbols
    // in the message before sending it

    public static void main(String[] args) {
        Sender emailSender = new SimpleEmailSender();

        //Sending a message removing all leading and trailing non alphanumeric symbols
        Sender cleanSender = new CleanSender(emailSender);

        cleanSender.send("###Hello World###");

        System.out.println();
        //Decorator that retries if the message hasn´t been sent with RunTimeDecorator
        Sender retrySender = new RetrySender(new RunTimeExceptionSender(emailSender));
        retrySender.send("Hello World");

        System.out.println();
        //Decorator that sends the message without RunTimeException
        Sender retrySender2 = new RetrySender(emailSender);
        retrySender2.send("Hello World");
    }
}
