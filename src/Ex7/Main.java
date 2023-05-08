package Ex7;

public class Main {
    public static void main(String[] args) {

        Thread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        System.out.println("Name of Thread: " + daemonThread.getName());
        System.out.println("Priority: " + daemonThread.getPriority());
        daemonThread.start();
        System.out.println("Is Thread Alive?: " + daemonThread.isAlive());
        System.out.println("Is Thread Daemon?: " + daemonThread.isDaemon());
        System.out.println("!!!!!!!! THE END !!!!!!!");
    }
}
