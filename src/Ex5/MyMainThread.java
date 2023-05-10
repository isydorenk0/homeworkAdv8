package Ex5;

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
                if (lock.isLocked()){
                    lock.unlock();
                } else {
                    lock.lock();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread: " + this.getName() + ", i = " + i);
        }
        System.out.println("Thread: " + this.getName() + " ended.");
    }
}
