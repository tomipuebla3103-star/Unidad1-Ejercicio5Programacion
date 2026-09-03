public class MedidorElectrico {
    private String numeroMedidor;
    private double lecturaAnterior;
    private double lecturaActual;

    public MedidorElectrico(String numeroMedidor, double lecturaAnterior, double lecturaActual) {
        this.numeroMedidor = numeroMedidor;
        this.lecturaAnterior = lecturaAnterior;

        if (lecturaActual >= lecturaAnterior) {
            this.lecturaActual = lecturaActual;
        } else {
            this.lecturaActual = lecturaAnterior;
        }
    }

    public String getNumeroMedidor() {
        return numeroMedidor;
    }

    public void setNumeroMedidor(String numeroMedidor) {
        this.numeroMedidor = numeroMedidor;
    }

    public double getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(double lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public double getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(double lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public double calcularConsumo() {
        return lecturaActual - lecturaAnterior;
    }

    public void registrarNuevaLectura(double nuevaLectura) {
        if (nuevaLectura >= lecturaActual) {
            lecturaAnterior = lecturaActual;
            lecturaActual = nuevaLectura;
        }
    }
}
