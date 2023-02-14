public class PaquetePremium extends Paquete{
    public PaquetePremium(double tarifaInicial, int edad) {
        super(tarifaInicial, edad);

    }
    @Override
    public double realizarRecargo() {
        return this.tarifaInicial * 0.1;
    }

    @Override
    public double aplicarIva() {
            return this.tarifaInicial * 0.03;

    }
}
