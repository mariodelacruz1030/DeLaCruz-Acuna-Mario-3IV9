import java.util.Scanner;  
public class Scanner{

    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        String nombre = "";
        int edad=0;
        float beca=1;

        System.out.println("Dime tu nombre: ");
        nombre = in.nextLine();
        System.out.println("Dime tu edad: ");
        edad = in.nextInt();
        System.out.println("Tu beca es de ¿que monto?: ");
        beca = in.nextFloat();

        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu beca es de: "+beca);

    }
}