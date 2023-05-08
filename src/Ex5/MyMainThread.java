package Ex5;

public class MyMainThread extends Thread {

    public MyMainThread() {
        this.setName("Main");
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread: " + this.getName() + ", i = " + i);
        }
        System.out.println("Thread: " + this.getName() + " ended.");
    }
}
