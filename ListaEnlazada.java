// Clase para implementar la lista enlazada
class ListaEnlazada {
    private Nodo primero;

    // Constructor
    public ListaEnlazada() {
        primero = null;
    }

    // Método para agregar un empleado a la lista
    public void agregar(Empleado empleado) {
        Nodo nuevoNodo = new Nodo(empleado);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }
// Método para mostrar los empleados en la lista
    public void mostrarEmpleados() {
        Nodo actual = primero;
        while (actual != null) {
            actual.empleado.mostrarDetalles();
            actual = actual.siguiente;
        }
    }

    // Clase Nodo para almacenar empleados en la lista
    private class Nodo {
        Empleado empleado;
        Nodo siguiente;

        Nodo(Empleado empleado) {
            this.empleado = empleado;
            siguiente = null;
        }
    }
}
