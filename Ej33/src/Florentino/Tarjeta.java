package Florentino;

public class Tarjeta {
    private int numeroTarjeta;
    private String entidad;
    private String titular;
    private String fecha;
    private int saldo;

    private Boolean estado;

    public Tarjeta(int num, String entidad, String titular, String fecha){
        this.numeroTarjeta = num;
        this.entidad = entidad;
        this.fecha = fecha;
        this.titular = titular;
        this.saldo = 1000;
        this.estado = true;
    }
    public void pagar(double dinero){
        if (estado){
            if (saldo > dinero){
                this.saldo -= dinero;
            }
            else{
                System.out.println("Te falta activar palancas");
            }
        }
        else{
            System.out.println("Tarjeta denegada");
        }
    }

    public void estado(String accion){
        switch (accion){
            case "anular":
                this.estado = false;
                break;
            case "activar":
                this.estado = true;
                break;
        }
    }
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getEntidad() {
        return entidad;
    }

    public String getTitular() {
        return titular;
    }

    public String getFecha() {
        return fecha;
    }

    public int getSaldo() {
        return saldo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
