import java.util.*;

class figuras{

    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);
        Scanner entr = new Scanner(System.in);
        double altura, base;
        double area, perimetro;
        String opcion ="";



        //la creacion del menu
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("  Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    ciclo:

        do{
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1.- Calcular area y perimetro de un cuadrado");
            System.out.println("2.- Calcular area y perimetro de un rectangulo");
            System.out.println("3.- Calcular area y perimetro de un triangulo");
            System.out.println("4.- Calcular area y perimetro de un rombo");
            System.out.println("5.- Calcular area y perimetro de un hexagono");
            System.out.println("6.- Calcular area y perimetro de un circulo");
            System.out.println("Para salir escriba la letra 'S'");
            System.out.println("");
        opcion = entr.nextLine();


        switch(opcion){
//La raiz cuadrada se obtiene con: Math.sqrt();

            case "1":
            //CUADRADO
            System.out.println("Ingresa el valor de un lado");
             base = entrada.nextDouble();      
                    while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                    }
                    area = base*base;
                    perimetro = base*4;

                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");

                continue ciclo;
                

            case "2":
            //RECTANGULO
            System.out.println("Ingresa el valor de la base");
            base = entrada.nextDouble();
            while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                    }
            System.out.println("Ingresa el valor de  la altura");
            altura = entrada.nextDouble();
                while(altura <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                altura = entrada.nextDouble();
                }
                    area = base*altura;
                    perimetro = (base*2)+(altura*2);
                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");

                continue ciclo;

            case "3":
            //TRIANGULO
            System.out.println("Ingresa el valor de la base");
            base = entrada.nextDouble();
                while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                }
                System.out.println("Ingresa el valor de  la altura");
                altura = entrada.nextDouble();
                    while(altura <=0 ){
                    System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                    altura = entrada.nextDouble();
                    }
                    area = (base*altura)/2;
                    /*
                    Para conocer el perimetro es necesario conocer todos sus lados, 
                    al ser la unica figura que lo necesita preferí declarar las variables
                    aqui mismo
                    */
                    double l2, l3;
                    System.out.println("Para conocer el perimetro necesito conocer la medida de los otros lados");
                    System.out.println("Ingresa el valor del segundo lado");
                    l2 = entrada.nextDouble();
                    while(l2 <=0 ){
                        System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                        l2 = entrada.nextDouble();
                        }
                    System.out.println("Ingresa el valor del tercer lado");
                    l3 = entrada.nextDouble();
                    while(l3 <=0 ){
                        System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                        l3 = entrada.nextDouble();
                        }
                    perimetro = base+l2+l3;
                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");

                continue ciclo;
            
            case "4":
            //ROMBO
            System.out.println("Ingresa el valor de la diagonal mayor");
            base = entrada.nextDouble();
                while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                }
            System.out.println("Ingresa el valor de  la diagonal menor");
            altura = entrada.nextDouble();
                while(altura <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                altura = entrada.nextDouble();
                }
                    area = (base*altura)/2;
                    perimetro = Math.sqrt(((base/2)*(base/2))+((altura/2)*(altura/2)));
                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");
            
                continue ciclo;

            case "5":
            //HEXAGONO
            System.out.println("**NOTA: SOLO HEXAGONOS REGULARES**");
            System.out.println("Ingresa el valor de un lado");
            base = entrada.nextDouble();
                while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                }
                    //Apotema= raiz((lado*lado)-((lado/2)*(lado/2)))
                    perimetro = base*6;
                    area = Math.sqrt((base*base)-((base/2)*(base/2)));
                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");

                continue ciclo;

            case "6":
            //CIRCULO

            System.out.println("Ingresa el valor del radio");
            base = entrada.nextDouble();
                while(base <=0 ){
                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                base = entrada.nextDouble();
                }
                    area = (3.14159265)*(base*base);
                    perimetro = (2)*(3.14159265)*(base);
                System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("El area es: "+area);
            System.out.println("El perimetro es: "+perimetro);
            System.out.println("-------------------------------");
                System.out.println("");

                continue ciclo;

            default:
                System.out.println("");
                System.out.println(":::::::::::::::::::::::");
                System.out.println(" Gracias por venir nwn");
                System.out.println(":::::::::::::::::::::::");
                opcion = "S";
                break;

            }
        }while(opcion != "s" && opcion != "S");
    }
}