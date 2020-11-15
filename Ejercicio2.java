import java.util.*;
public class Ejercicio2{
    public void Ejercicio2(){
        int key = 0, yep = 0;
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("Elije la opci\u00f3n deseada");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- C\u00edrculo");
            System.out.println("3.- Rect\u00e1ngulo");
            System.out.println("4.- Tri\u00e1ngulo");
            key = in.nextInt();
            switch (key) {
            case 1:
                Cuadrado();
                System.out.println("Quieres ir al menu principal si = 1 o no = 2");
                yep = in.nextInt();
                break;
            case 2:
                Circulo();
                System.out.println("Quieres ir al menu principal si = 1 o no = 2");
                yep = in.nextInt();               
                break;
            case 3:
                Rectangulo();
                System.out.println("Quieres ir al menu principal si = 1 o no = 2");
                yep = in.nextInt();
                break;
            case 4:
                Triangulo();
                System.out.println("Quieres ir al menu principal si = 1 o no = 2");
                yep = in.nextInt();
                break;
            default:
                yep = 1;
                break;
            }
        }while (yep == 1);
    }
    public void Cuadrado(){
        int l = 0;
        double rp = 0, ra = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cual es el valor de tu lado?");
        l = in.nextInt();
        rp = l * 4;
        ra = l * l;
        System.out.print("El per\u00edmetro es = "+ rp +" unidades");
        System.out.println(", El \u00e1rea es = " + ra + " unidades cuadradas");
    }
    public void Circulo(){
        Scanner in = new Scanner(System.in);
        double rp = 0.00, ra = 0.00, r = 0.00;
        System.out.println("¿Cual es el valor de tu radio?");
        r = in.nextInt();
        rp = r * 3.16 * 2;
        ra = r * r * 3.16;
        System.out.print("El per\u00edmetro es = "+ rp +" unidades");
        System.out.println(", El \u00e1rea es = " + ra + " unidades cuadradas");    
    }
    public void Rectangulo(){
        Scanner in = new Scanner(System.in);
        double rp = 0.00, ra = 0.00, l = 0.00, la = 0.00;
        System.out.println("¿Cual es el valor de tu largo?");
        la = in.nextInt();
        System.out.println("¿Cual es el valor de tu ancho?");
        l = in.nextInt();
        rp = l + la + la + l;
        ra = l * la;
        System.out.print("El per\u00edmetro es = "+ rp +" unidades");
        System.out.println(", El \u00e1rea es = " + ra + " unidades cuadradas");    
    }
    public void Triangulo(){
        Scanner in = new Scanner(System.in);
        double rp = 0.00, ra = 0.00, l = 0.00, h = 0.00;
        System.out.println("¿Cual es el valor de tu lado?");
        l = in.nextInt();
        System.out.println("¿Cual es el valor de tu altura?");
        h = in.nextInt();
        rp = l * 3;
        ra = l * h / 2 ;
        System.out.print("El per\u00edmetro es = "+ rp +" unidades");
        System.out.println(", El \u00e1rea es = " + ra + " unidades cuadradas");          
    }
}