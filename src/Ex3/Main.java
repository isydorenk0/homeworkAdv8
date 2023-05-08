package Ex3;

public class Main {
    public static void main(String[] args) {
        PriorityThread threadMax = new PriorityThread(new PriorityRunner());
        threadMax.setName("MaxPriority");
        threadMax.setPriority(Thread.MAX_PRIORITY);

        PriorityThread threadNorm = new PriorityThread(new PriorityRunner());
        threadNorm.setName("NormPriority");

        PriorityThread threadMin = new PriorityThread(new PriorityRunner());
        threadMin.setName("MinPriority");
        threadMin.setPriority(Thread.MIN_PRIORITY);

        threadMax.start();
        threadNorm.start();
        threadMin.start();
    }
}
