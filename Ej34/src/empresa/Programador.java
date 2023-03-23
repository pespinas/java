package empresa;

public class Programador extends Trabajador{
        private double plus;
    public Programador(){
        this.plus = 1.00;
        this.sueldo = sueldo + plus;
    }

    @Override
    public double getSueldo() {
        return super.getSueldo();
    }

    public double getPlus() {
        return plus;
    }
}
