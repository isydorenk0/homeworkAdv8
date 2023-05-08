package Ex6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LockUnlock lock = new LockUnlock();
        Thread threadMain = new MyMainThread("Main", lock);
        Thread threadOther = new MyMainThread("Other", lock);

        threadMain.start();
        threadOther.start();
    }
}
