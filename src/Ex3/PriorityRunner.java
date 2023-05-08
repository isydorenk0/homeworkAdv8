package Ex3;

public class PriorityRunner implements Runnable {
    public void run(){
        System.out.println("Starting thread " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " : " + (i + 1));
        }
    }
}
