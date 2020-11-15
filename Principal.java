import java.util.Scanner;
public class Principal{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int elec = 0;
        char op;
        do{
            System.out.println("Elija la opcion deseada UwU");
            System.out.println("a.- Calcular Edad");
            System.out.println("b.- Calcular Area y Perimetro");
            System.out.println("c.- Calcular Costos de Llamada");
            System.out.println("s.- Salir");
            op = in.next().charAt(0);
            switch (op){
            case 'a': 
                System.out.println("Elejiste la opcion de Calcular Edad");
                Ejercicio1 obj = new Ejercicio1();
                obj.Ejercicio1();
                System.out.println("Quieres ir al menu principal si = 1 o no = 2");
                elec = in.nextInt();
                break;
            case 'b':
                System.out.println("Elejiste la opcion de Calcular Area y Perimetro");
                Ejercicio2 obj1 = new Ejercicio2();
                obj1.Ejercicio2();
                System.out.println("Quieres ir al menu principal si = 1 o no = 2");
                elec = in.nextInt();
                break;
            case 'c':
                System.out.println("Elejiste la opcion de Calcular Costos de Llamadas");
                Ejercicio3 obj2 = new Ejercicio3();
                obj2.Ejercicio3();
                System.out.println("Quieres ir al menu principal si = 1 o no = 2");
                elec = in.nextInt();
                break;
            case 's':
                elec = 2;
                break; 
            default:
                elec = 1;
                break;
            }
        }while (elec == 1);
        System.out.println("Adioooooooooooos :)");
    }
}