import java.util.Scanner;
class Scanner{

    public static void main(String[] args){
        Sring nombre;
        int edad;
        float beca;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        nombre = entrada.nextLine();
        System.out.println("Dime tu edad");
        edad = entrada.nextInt();
        System.out.println("Dime el moto de tu beca");
        beca = entrada.nextFloat();


        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es de: " + edad + "años");
        System.out.println("Tu beca es de: $" + beca);
        
    }
}
