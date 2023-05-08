package Ex7;

import java.util.Set;

public class DaemonThread extends Thread{

    public void run() {
        while(true){
            System.out.println("Running");
        }
    }
}
