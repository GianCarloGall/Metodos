import java.util.*;
public class Ejercicio1{
    public void Ejercicio1(){
        Scanner in = new Scanner (System.in);
        int holi = 0;
        do{
            Datos();
            System.out.println("Quieres reiniciar si = 1 o no = 2");
            holi = in.nextInt();
        }while (holi == 1);
    }
    public void Datos(){
        Scanner entrada = new Scanner (System.in);
        int fecha = 0, edad = 0;
        System.out.println("En que a\u00F1o naciste");
        fecha = entrada.nextInt();
        if (fecha < 2020){
            edad = 2020 - fecha;
            System.out.println("Tu edad es: " +edad+ " a\u00f1os aproximadamente ;)");
        }else{
            System.out.println("Qu\u00e3 pasa a\u00fan no naces o qu\u00e9?");
        }
    }
}


