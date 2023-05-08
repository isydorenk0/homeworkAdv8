package Ex4;

public class Message {
    private boolean ready;

    private String textToSend = null;

    public Message(String textToSend) {
        this.textToSend = textToSend;
        this.ready = true;
    }

    public synchronized void sendMessage() {
        if (ready){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Sending message: " + this.textToSend + " from service " + Thread.currentThread().getName());
            ready = false;
        }
    }
}
