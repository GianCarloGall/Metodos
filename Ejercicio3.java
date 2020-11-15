import java.util.*;
public class Ejercicio3{
    public void Ejercicio3(){
        Scanner in = new Scanner(System.in);
        int key = 0, elec = 0;
        do{
            System.out.println("Pillofon tu red de confianza");
            System.out.println("1.-Ver credito");
            System.out.println("2.-Hacer una llamada locales nacionales costo $0.5");
            System.out.println("3.-Hacer una llamada internacional      costo $0.6");
            System.out.println("4.-Hacer una llamada a un celular       costo $0.2");
            key = in.nextInt();
            switch (key) {
                case 1:
                    Credito();
                    System.out.println("Quieres regresar al menu principal si = 1 o no = 2");
                    elec = in.nextInt();
                    break;
                case 2:
                    Locales();
                    System.out.println("Quieres regresar al menu principal si = 1 o no = 2");
                    elec = in.nextInt();
                    break;
                case 3:
                    Internacionales();
                    System.out.println("Quieres regresar al menu principal si = 1 o no = 2");
                    elec = in.nextInt();
                    break;
                case 4:
                    Celular();
                    System.out.println("Quieres regresar al menu principal si = 1 o no = 2");
                    elec = in.nextInt();
                    break;
                default:
                    elec = 1;
                    break;
            }
        }while(elec == 1);
    }
    public void Credito(){
        int credito = 50;
        System.out.println("Tu credito es de: $"+credito+"");
    }
    public void Locales(){
        double credito = 50.00, locales = 0.50, total = 0.00, llamadas = 0.00;
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantas llamadas realizo pillo?");
        llamadas = in.nextInt();
        total = credito - (locales * llamadas);
        if (total < 0 ){
            System.out.println("Usted debe: $" +total+ " ,favor de pasar a cualquier OTXO a pagar");
        }else{
            System.out.println("Usted aun tiene $" +total+ " ,puede recargar mas saldo en cualquier OTXO gracias pillo");
        }
    }
    public void Internacionales(){
        double credito = 50.00, internacionales = 0.60, total = 0.00, llamadas = 0.00;
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantas llamadas realizo pillo?");
        llamadas = in.nextInt();
        total = credito - (internacionales * llamadas);
        if (total < 0 ){
            System.out.println("Usted debe: $" +total+ " ,favor de pasar a cualquier OTXO a pagar");
        }else{
            System.out.println("Usted aun tiene $" +total+ " ,puede recargar mas saldo en cualquier OTXO gracias pillo");
        }
    }
    public void Celular(){
        double credito = 50.00, celular = 0.20, total = 0.00, llamadas = 0.00;
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantas llamadas realizo pillo?");
        llamadas = in.nextInt();
        total = credito - (celular * llamadas);
        if (total < 0 ){
            System.out.println("Usted debe: $" +total+ " ,favor de pasar a cualquier OTXO a pagar");
        }else{
            System.out.println("Usted aun tiene $" +total+ " ,puede recargar mas saldo en cualquier OTXO gracias pillo"); 
        }   
    }
}