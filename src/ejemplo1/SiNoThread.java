package ejemplo1;

public class SiNoThread extends Thread {
    private String SiNo;
    static int Contador = 0;

    public SiNoThread(String s) {
        super();
        SiNo = s;
    }

    public void run() {
        int i;
        for (i = 1; i <= 20; i++) {
            System.out.print(++Contador + ":" + SiNo + " ");
        }
    }
}