package Ex5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadMain = new MyMainThread();
        Thread otherThread = new MyOtherThread();

        threadMain.start();
        threadMain.join(600);
        otherThread.start();
    }
}
