public class PaqueteOro extends Paquete{
    public PaqueteOro(double tarifaInicial, int edad) {
        super(tarifaInicial, edad);
    }

    @Override
    public double realizarRecargo() {
        return this.tarifaInicial * 0.05;
    }

    @Override
    public double aplicarIva() {
            return this.tarifaInicial * 0.05;

    }


}
