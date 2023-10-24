package decorator;

public class CleanSender implements Sender{

    private Sender sender;

    public CleanSender(Sender sender){
        this.sender = sender;
    }

    @Override
    public void send(String message) {
        message = message.replaceAll("^[^a-zA-Z0-9]+", "");
        message = message.replaceAll("[^a-zA-Z0-9]+$", "");
        sender.send(message);
    }
}
