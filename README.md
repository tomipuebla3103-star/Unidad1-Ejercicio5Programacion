<img width="834" height="131" alt="image" src="https://github.com/user-attachments/assets/d290f322-a5bb-4589-857c-801d9834d6a2" />
 Monitoreo de Consumo Eléctrico

 Descripción

El programa utiliza una clase llamada `MedidorElectrico` para guardar las lecturas de un medidor de electricidad y calcular cuánto se consumió durante el mes.

El consumo se obtiene comparando la lectura anterior con la lectura actual.

 Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos.
 Constructores.
 Métodos.
 Validación de datos.
 Actualización de datos.
 Cálculos con atributos de un objeto.

 Clase MedidorElectrico

La clase `MedidorElectrico` tiene los siguientes atributos:

 `numeroMedidor`: número que identifica al medidor.
 `lecturaAnterior`: lectura registrada anteriormente.
 `lecturaActual`: lectura más reciente del medidor.

Constructor

El constructor recibe los datos necesarios para crear un medidor.

También se controla que la lectura actual sea mayor o igual a la lectura anterior.

 Métodos

 `calcularConsumo()`

Calcula el consumo de electricidad restando la lectura anterior a la lectura actual.


lecturaActual - lecturaAnterior


El método devuelve el consumo en kWh.

 registrarNuevaLectura(double nuevaLectura)

Permite registrar una nueva lectura del medidor.

La nueva lectura pasa a ser la lectura actual y la lectura anterior se actualiza con el valor que tenía anteriormente.

 Ejemplo

En el `main` se crea un medidor con una lectura inicial.

Después se simula el paso de un mes registrando una nueva lectura y se utiliza el método `calcularConsumo()` para saber cuánto se consumió.

Finalmente, el consumo se muestra por consola.
