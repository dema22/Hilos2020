package ejemplo2;

public class Main {

    public static void main(String[] args) {

        // In the constructor we use a Runnable Object
        Thread sinoThread1 = new Thread(new SiNoThread("SI\n"));
        Thread sinoThread2 = new Thread(new SiNoThread("NO\n"));
        sinoThread1.start();
        sinoThread2.start();
    }
}
