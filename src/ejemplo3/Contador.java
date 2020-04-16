package ejemplo3;

class Contador {
    private long valor = 0;

    public synchronized void incrementa() {
        long aux;
        aux = valor;
        aux++;
        valor = aux;
    }

    public long getValor()
    {
        return valor;
    }
}
