package decorator;

public class RunTimeExceptionSender implements Sender{

    private Sender sender;

    public RunTimeExceptionSender(Sender sender){
        this.sender = sender;
    }

    public void send(String message){
        throw new RuntimeException();
    }

}
