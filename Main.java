import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Laptop>Inventario = new ArrayList<>();
    static ArrayList<Telefono>InventarioTelefono = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal() {
        while(true){
        System.out.println("-------");
        System.out.println("Bienvenido al inventario");
        System.out.println("1. Agregar inventario de laptop:");
        System.out.println("2. Agregar inventario de telefono");
        System.out.println("3. Modificar inventario:");
        System.out.println("4. Consultar inventario:");
        System.out.println("5. Salir inventario:");
        System.out.println("-------");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        if (opcion ==5){
            System.out.println("Has salido del inventario");
            break;
        }
        switch (opcion){
            case 1:
                AgregarInventarioLaptop();
                break;
            case 2:
                AgregarInventarioTelefono();
                break;
            case 3:
                ModificarInventario();
            case 4:
                ConsultarInventario();
                break;
            default:
            }
        }
    }
    public static void AgregarInventarioLaptop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese precio: ");
        Float precio = scanner.nextFloat();
        System.out.println("Ingrese color: ");
        String color = scanner.nextLine();
        System.out.println("Ingrese bateria:");
        String bateria = scanner.nextLine();
    }
    public static void AgregarInventarioTelefono(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese precio: ");
        Float precio = scanner.nextFloat();
        System.out.println("Ingrese compania: ");
        String compania = scanner.nextLine();
        System.out.println("Ingrese accesorio:");
        String accesorio = scanner.nextLine();
    }

    public static void ModificarInventario(){}
    public static void ConsultarInventario(){}
}
