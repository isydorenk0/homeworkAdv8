package Ex5;

public class LockUnlock {

    private boolean locked = false;

    public boolean isLocked() {
        return locked;
    }

    public synchronized void lock() throws InterruptedException {
        System.out.println("enter lock from " + Thread.currentThread().getName());
        System.out.println("locked");
        locked = true;
        wait();
    }

    public synchronized void unlock() throws InterruptedException {
        System.out.println("enter unlock from " + Thread.currentThread().getName());
        System.out.println("unlocked");
        locked = false;
        notify();

    }


}
