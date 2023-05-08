package Ex4;

public class Main {
    public static void main(String[] args) {
        Message[] messages = {new Message("Message 1"),new Message("Message 2"), new Message("Message 3"), new Message("Message 4"),
                new Message("Message 5"), new Message("Message 6")};

        Thread service1 = new Thread(new Service(messages));
        service1.setName("Service One");
        Thread service2 = new Thread(new Service(messages));
        service2.setName("Service Two");
        Thread service3 = new Thread(new Service(messages));
        service3.setName("Service Three");

        service1.start();
        service2.start();
        service3.start();
    }
}
