import Info_Producto.Producto;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Producto producto1 = new Producto("01", "producto1", 20);
        Producto producto2 = new Producto("02", "producto2",  20);
        System.out.println("El producto de código " + producto1.getCodigo() + " y nombre " + producto1.getNombre() + " tiene precio de " + String.format("%.2f", producto1.getPrecio()) + " euros");
        System.out.println("El producto de código " + producto2.getCodigo() + " y nombre " + producto2.getNombre() + " tiene precio de " + String.format("%.2f", producto2.getPrecio()) + " euros");

        // Crea un tercer objeto pidiendo datos al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del producto:");
        String codigo = scanner.nextLine();

        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();

        // Crea un objeto producto3 con los datos ingresados por el usuario
        Producto producto3 = new Producto(codigo, nombre, precio);

        // Imprime los datos de producto3
        System.out.println("Producto 3 (creado por el usuario): " + producto3);
    }
}