import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      ArrayList<Comida>  carrito = new ArrayList<>();
      Scanner teclado = new Scanner(System.in);

      String opcion;
      boolean continuar = true;

      while(continuar){
        mostrarOpciones();
        opcion = teclado.nextLine();

        switch (opcion) {
            case "1":
                agregarComida(carrito, teclado);
                break;
            case "2":
                mostrarListaCompleta(carrito);
                break;
            case "3":
                mostrarProductoEspecifico(carrito, teclado);
                break;
            case "4":
                modificarPorNombre(carrito, teclado);
                break;
            case "5":
                borrarElemento(carrito, teclado);
                break;
            case "0":
                System.out.println("Hasta pronto!");
                return;
            default:
                System.out.println("opcion no valida, por favor intenta de nuevo");
        }
      }
    }
      private static void mostrarOpciones() {
        System.out.println("Opciones:");
        System.out.println("1.- Añadir comida:");
        System.out.println("2.- Mostrar Lista Completa:");
        System.out.println("3.- Buscar un producto (introduce nombre):");
        System.out.println("4.- Modificar un producto, cual quieres modificar? (introduce nombre):");
        System.out.println("5.- Borrar elemento, cual elemento quieres eliminar? (introduce nombre)");
        System.out.println("0.- Salir");

      }

      private static void agregarComida(ArrayList<Comida> carrito, Scanner teclado){
        System.out.println("Introduce el nombre de la comida:");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce el origen de la comida:");
        String origen = teclado.nextLine();
        
        System.out.println("Introduce el peso de la comida:");
        double peso = teclado.nextDouble();

        System.out.println("introduce el precio de la comida:");
        double precio = teclado.nextDouble();

        Comida nuevaComida = new Comida(nombre, origen, peso, precio);
        carrito.add(nuevaComida);

        System.out.println("Añadido correctamente");
      }

      private static void mostrarListaCompleta(ArrayList<Comida> carrito){
        if(carrito.isEmpty()){
            System.out.println("El carrito está vacío");
        } else {
            System.out.println("Lista completa de la comida");
            for (Comida comida : carrito) {
                System.out.println(comida);
            }
        }

      }

      private static void mostrarProductoEspecifico(ArrayList<Comida> carrito, Scanner teclado){
        System.out.println("Que producto quieres buscar?");
        String nombreBuscar = teclado.nextLine();
        boolean encontrado = false;

        for (Comida comida : carrito) {
            if(comida.getNombre().equalsIgnoreCase(nombreBuscar)){
                System.out.println(comida);
                encontrado = true;
            }
        }

        if(!encontrado) {
            System.out.println("El producto no está en el carrito");
        }

      }

      private static void modificarPorNombre(ArrayList<Comida> carrito, Scanner teclado){
            System.out.println("Que producto quieres modificar?");
            String nombreModificarBuscado = teclado.nextLine();
            boolean encontrado = false;

        for (Comida comida : carrito) {
            if(comida.getNombre().equalsIgnoreCase(nombreModificarBuscado)){
                System.out.println("Producto encontrado!");
                System.out.println(comida);

                System.out.println("Introduce nuevo nombre");
                String nuevoNombre = teclado.nextLine();
                System.out.println("cual es el nuevo origen?");
                String nuevoOrigen = teclado.nextLine();
                System.out.println("cual el nuevo peso?" );
                double nuevoPeso = teclado.nextDouble();
                System.out.println("y el nuevo precio?");
                double nuevoPrecio = teclado.nextDouble();

                comida.setNombre(nuevoNombre);
                comida.setOrigen(nuevoOrigen);
                comida.setPeso(nuevoPeso);
                comida.setPrecio(nuevoPrecio);

                System.out.println("Producto modificado correctamente");
                encontrado = true;
                break;
            }

            if(!encontrado) {
                System.out.println("El producto no está en el carrito");
            }

            
        }

      }

      private static void borrarElemento(ArrayList<Comida> carrito, Scanner teclado){

      }
}

