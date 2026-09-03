//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    MedidorElectrico medidor =
            new MedidorElectrico("MED-001", 1250, 1400);

    medidor.registrarNuevaLectura(1550);

    System.out.println("Número de medidor: " + medidor.getNumeroMedidor());
    System.out.println("Consumo del mes: " + medidor.calcularConsumo() + " kWh");
}
