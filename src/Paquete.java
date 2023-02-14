public abstract class Paquete {

    protected double tarifaInicial;
    protected int edad;

    public Paquete(double tarifaInicial, int edad) {
        this.tarifaInicial = tarifaInicial;
        this.edad = edad;
    }

    public double cobroViaje(){
        double encargo=0,iva=0;
        if(this.validarEdad()){
           encargo = this.realizarRecargo();
           iva=  this.aplicarIva();
        }
        return this.tarifaInicial+iva+encargo;


    }

    public boolean validarEdad(){
        if(this.edad>=18){
            return true;
        }return false;
    }

    public  double realizarRecargo(){
        return 0;
    }

    public  double aplicarIva(){
        return 0;
    }




}