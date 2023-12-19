import java.util.Scanner;

class Cancion {
    String nombre;
    String artista;
    int duracionSegundos;

    public Cancion(String nombre, String artista, int duracionSegundos) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    
    public String toString() {
        return "Canción: " + nombre + ", Artista: " + artista + ", Duración: " + duracionSegundos + " segundos";
    }
}

class Nodo {
    Cancion cancion;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Cancion cancion) {
        this.cancion = cancion;
        this.siguiente = null;
        this.anterior = null;
    }
}

class ListaCircularDoble {
    private Nodo cabeza;

    public ListaCircularDoble() {
        cabeza = null;
    }

    public void insertarAlInicio(Cancion cancion) {
        Nodo nuevoNodo = new Nodo(cancion);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            nuevoNodo.siguiente = cabeza;
            nuevoNodo.anterior = cabeza.anterior;
            cabeza.anterior.siguiente = nuevoNodo;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    public void mostrarListaAdelante() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            System.out.println(actual.cancion);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public void mostrarListaAtras() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza.anterior;
        do {
            System.out.println(actual.cancion);
            actual = actual.anterior;
        } while (actual != cabeza.anterior);
    }

    public void reproducirCancion(String nombreCancion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            if (actual.cancion.nombre.equals(nombreCancion)) {
                System.out.println("Reproduciendo: " + actual.cancion);
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("La canción no se encuentra en la lista.");
    }

    public void actualizarCancion(String nombreCancion, String nuevoNombre, String nuevoArtista, int nuevaDuracion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            if (actual.cancion.nombre.equals(nombreCancion)) {
                actual.cancion.nombre = nuevoNombre;
                actual.cancion.artista = nuevoArtista;
                actual.cancion.duracionSegundos = nuevaDuracion;
                System.out.println("Canción actualizada.");
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("La canción no se encuentra en la lista.");
    }

    public void eliminarCancion(String nombreCancion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            if (actual.cancion.nombre.equals(nombreCancion)) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                }
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
                System.out.println("Canción eliminada.");
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("La canción no se encuentra en la lista.");
    }

    public void eliminarLista() {
        cabeza = null;
        System.out.println("Toda la lista ha sido eliminada.");
    }
}

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircularDoble lista = new ListaCircularDoble();

        while (true) {
            System.out.print("*************************************************\n");
            System.out.print("             Reproductor de musica\n");
            System.out.print("*************************************************\n");
            System.out.println("\nMenú:");
            System.out.println("1. Crear nueva canción");
            System.out.println("2. Reproducir una canción deseada");
            System.out.println("3. Reproducir la lista completa hacia adelante");
            System.out.println("4. Reproducir la lista completa hacia atrás");
            System.out.println("5. Actualizar una canción");
            System.out.println("6. Eliminar una canción deseada");
            System.out.println("7. Eliminar toda la lista");
            System.out.println("8. Apagar reproductor");
            System.out.print("\nElija una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción: ");
                    String nombre = scanner.next();
                    System.out.print("Nombre del artista: ");
                    String artista = scanner.next();
                    System.out.print("Duración en segundos: ");
                    int duracion = scanner.nextInt();

                    Cancion cancion = new Cancion(nombre, artista, duracion);
                    lista.insertarAlInicio(cancion);
                    System.out.println("Canción creada.");
                    break;
                case 2:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción a reproducir: ");
                    String nombreReproducir = scanner.next();
                    lista.reproducirCancion(nombreReproducir);
                    break;
                case 3:
                    System.out.print("*************************************************\n");
                    System.out.println("Reproduciendo la lista completa hacia adelante:");
                    lista.mostrarListaAdelante();
                    break;
                case 4:
                    System.out.print("*************************************************\n");
                    System.out.println("Reproduciendo la lista completa hacia atrás:");
                    lista.mostrarListaAtras();
                    break;
                case 5:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción a actualizar: ");
                    String nombreActualizar = scanner.next();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.next();
                    System.out.print("Nuevo artista: ");
                    String nuevoArtista = scanner.next();
                    System.out.print("Nueva duración en segundos: ");
                    int nuevaDuracion = scanner.nextInt();
                    lista.actualizarCancion(nombreActualizar, nuevoNombre, nuevoArtista, nuevaDuracion);
                    break;
                case 6:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción a eliminar: ");
                    String nombreEliminar = scanner.next();
                    lista.eliminarCancion(nombreEliminar);
                    break;
                case 7:
                    System.out.print("*************************************************\n");
                    lista.eliminarLista();
                    //Eliminar la lista
                    break;
                case 8:
                    System.out.print("*************************************************\n");
                    System.out.print("             Apagando reproductor...\n");
                    System.out.print("*************************************************\n");
                    scanner.close();
                    return;
                default:
                    System.out.print("Opcion no valida, intente nuevamente: ");
                    break;
            }
        }
    }
}