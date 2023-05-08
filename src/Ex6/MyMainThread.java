package Ex6;

public class MyMainThread extends Thread {
    private LockUnlock lock;
    public MyMainThread(String name, LockUnlock lock) {
        this.setName(name);
        this.lock = lock;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
               Thread.sleep(200);
               if (i % 2 == 0)  lock.lock();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread: " + this.getName() + ", i = " + i);
            try {
                lock.unlock();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread: " + this.getName() + " ended.");
    }
}
