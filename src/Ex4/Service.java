package Ex4;

public class Service implements Runnable{

    Message[] messages;
    public Service(Message[] messages) {
        this.messages = messages;
    }

    @Override
    public synchronized void run() {
        for (Message message : messages) {
            message.sendMessage();
        }
    }
}
