import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bucle = true;
        int opcion;

        while (bucle == true){
            System.out.print("Introduce un número para añadirlo a la cola: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");
        }
    }
}
