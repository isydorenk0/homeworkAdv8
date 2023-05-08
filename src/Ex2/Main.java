package Ex2;

public class Main {
    public static void main(String[] args) {
        Thread threadMain = new newThread();
        threadMain.setName("Main");
        threadMain.start();

        Thread threadFirst = new newThread();
        threadFirst.setName("First");
        threadFirst.start();

        Thread threadSecond = new newThread();
        threadSecond.setName("Second");
        threadSecond.start();

    }
    static class newThread extends Thread {
        public void run() {
            int delay = 100;
            if (this.getName().equals("Second")){
                delay = 200;
            } else if (this.getName().equals("Main")){
                delay = 300;
            }
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread: " + this.getName() + ", i = " + i);
            }
            System.out.println("Thread: " + this.getName() + " ended.");
        }
    }
}
