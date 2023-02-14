public class PaqueteEstandar extends Paquete{
    public PaqueteEstandar(double tarifaInicial, int edad) {
        super(tarifaInicial, edad);
    }

    @Override
    public double realizarRecargo() {
        return this.tarifaInicial * 0.18;

    }

    @Override
    public double aplicarIva() {
            return this.tarifaInicial * 0.02;
    }


}
