package Ex5;

public class MyOtherThread extends Thread {

    public MyOtherThread() {
        this.setName("Other");
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
