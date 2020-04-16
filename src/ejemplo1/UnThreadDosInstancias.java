package ejemplo1;

public class UnThreadDosInstancias {
    public static void main(String args[])
    {
        SiNoThread s = new SiNoThread("SI\n");
        SiNoThread n = new SiNoThread("NO\n");
        s.start();
        n.start();
    }
}
