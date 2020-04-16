package ejemplo4;

class ProdCons {
    public static void main(String argum[]) {
        Caja cj = new Caja();
        Productor p = new Productor(cj);
        Consumidor c = new Consumidor(cj);
        p.start();
        c.start();
    }
}
