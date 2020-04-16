package ejemplo2;

class SiNoThread extends SiNo implements Runnable{

    public SiNoThread(String s) {
        super(s);
    }

    // Overriding the run method from the class Thread
    public void run()
    {
        int i;
        for (i = 1; i <= 20; i++)
        {
            System.out.print(++Contador + ":" + SiNo + " ");
        }
    }
}
