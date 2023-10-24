package decorator;

public class RetrySender implements Sender{

    private Sender sender;

    public RetrySender(Sender sender){
        this.sender = sender;
    }

    @Override
    public void send(String message) {
        int  attemps = 0;
        while(attemps<2){
            try{
                System.out.println("Trying to send message...");
                sender.send(message);
                return;
            }catch(RuntimeException e){
                attemps++;
            }
        }

        System.out.println("The message could not be sent");
    }
}
