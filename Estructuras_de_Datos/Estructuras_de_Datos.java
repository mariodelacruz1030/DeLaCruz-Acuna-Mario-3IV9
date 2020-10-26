import java.util.*;

public class Estructuras_de_Datos{

    public static void main(String args[]){

        //VARIABLES MENU
        Scanner entrada = new Scanner(System.in);
        Scanner entrada0 = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        int opcion;
        String fin = "", finp = "";
        boolean cerrar = false;
        boolean menu = false, menu0 = false;
        //VARIABLES MENU

        //VARIABLES 1
            int edad;
            String socios;
            boolean socio = false;
        //VARIABLES 1
        

        //VARIABLES 2
            int decimal;
            String binario = "";
            boolean numbin = false;
        //VARIABLES 2
        

        //VARIABLES 3
            String grad, grad0;
            double grados1, grados2 = 0;
            boolean s1 = false, s2 = false, s3 = false, s4 = false;
        //VARIABLES 3
        

        //VARIABLES 4
            int numeros = 0, numpos = 0, numneg = 0, total =1;
        //VARIABLES 4
        

        //VARIABLES 5
            int cantidad, pago = 0;
        //VARIABLES 5


        //VARIABLES 6
            String figuras = "", esfera = "";
            double base, altura, area, perimetro;
            double l2, l3;
            boolean exit = false;
        //VARIABLES 6
        

        //VARIABLES 7
            int tabla;
        //VARIABLES 7
        

        //VARIABLES 8
            int factorial;
        //VARIABLES 8
        

        //VARIABLES 9
            int lado;
        //VARIABLES 9
        

        //VARIABLES 10
            int lado2;
        //VARIABLES 10
        

        //VARIABLES 11
            int patron;
        //VARIABLES 11
        

        //VARIABLES 12
            int diamante;
        //VARIABLES 12
        

        //VARIABLES 13
            double resultado = 0;
            double num1, num2;
            String opcionc = "";
            String opcionc1 = "";
            boolean calculadora = false, calculadora2 = false, calculadora3 = false;
        //VARIABLES 13


        System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("   3IV9   DE LA CRUZ ACUNA MARIO RICARDO   ");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();
        System.out.println();
        System.out.println("-::::::::::::::::::::::::::::::::::::::::::-");
        System.out.println("-BIENVENIDO AL MENU DE ESTRUCTURAS DE DATOS-");
        System.out.println("-::::::::::::::::::::::::::::::::::::::::::-");
        System.out.println();

        menu_principal:

        do{
        System.out.println("POR FAVOR SELECCIONA UNA OPCION");
        System.out.println("1.- Precio del abono");
        System.out.println("2.- Convertir un decimal a binario");
        System.out.println("3.- Conversion de temperaturas");
        System.out.println("4.- Conteo de numeros positivos y negativos");
        System.out.println("5.- Pago total de productos");
        System.out.println("6.- Calculos a figuras");
        System.out.println("7.- Tabla de valores");
        System.out.println("8.- Calculo de factorial");
        System.out.println("9.- Impresion de cuadrado");
        System.out.println("10.- Impresion de cuadrado sin relleno");
        System.out.println("11.- Patron con asteriscos");
        System.out.println("12.- Impresion de diamante");
        System.out.println("13.- Calculadora");
        System.out.println("14.- CERRAR EL PROGRAMA");
        System.out.println();

        opcion = entrada.nextInt();
        System.out.println();

        switch(opcion) {

            case 1: 
            //ABONO

            System.out.println("************************************");
            System.out.println("*     BIENVENIDO AL PROGRAMA DE    *");
            System.out.println("*  CALCULO DEL DESCUENTO DEL ABONO *");
            System.out.println("************************************");
            do{

                System.out.println("Para determinar el desceunto a aplicar necesitamos conocer su edad ");
                System.out.println();
                System.out.println("Ingrese su edad");
                System.out.println();
                edad = entrada.nextInt();
                System.out.println();

                while(edad <= 0 || edad >99){
                    System.out.println("Ese numero es invalido, por favor ingreselo de nuevo");
                    edad = entrada.nextInt();
                    System.out.println();
                }

                if(edad > 65){
                    System.out.println("=========================");
                    System.out.println(" Su descuento es del 40% ");
                    System.out.println("=========================");
                }else{
                    if(edad>= 21 && edad<= 65){
                        System.out.println("==========================");
                        System.out.println(" Usted no tiene descuento ");
                        System.out.println("==========================");
                    }else{
                    do{
                    if(edad < 21){
                        System.out.println("Si sus padres son socios escriba la letra 'S' ");
                        System.out.println("Si sus padres no son socios presione 'enter'");
                        socios = entrada0.nextLine();
                        System.out.println();

                        if(socios.equalsIgnoreCase("S") || socios.equalsIgnoreCase("s")){
                            System.out.println("=========================");
                            System.out.println(" Su descuento es del 45% ");
                            System.out.println("=========================");
                            socio = true;
                        }else{
                            if(socios.equalsIgnoreCase("")){
                                System.out.println("=========================");
                                System.out.println(" Su descuento es del 25% ");
                                System.out.println("=========================");
                                socio = true;
                            }else{
                                System.out.println("Opcion incorrecta o erronea, ingresala de nuevo");
                                socio = false;
                                }
                            }
                        }
                      }while(socio == false);
                    }
                }
                
                System.out.println("Si quieres ingresar otra edad presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);
            break;

            case 2:
            //BINARIOS
            System.out.println("*********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("* CONVERSION A NUMEROS BINARIOS *");
            System.out.println("*********************************");
            do{
                do{
                System.out.println();
                System.out.println("Ingrese un numero en el sistema decimal positivo");
                System.out.println();
                decimal = entrada.nextInt();
                System.out.println();

                if (decimal > 0) {
                    while (decimal > 0) {
                        if (decimal % 2 == 0) {
                            binario = "0" + binario;
                        } else {
                            binario = "1" + binario;
                        }
                        decimal = (int) decimal / 2;
                    }
                    System.out.println("==============================================");
                    System.out.println(" El numero convertido a binario es: " + binario);
                    System.out.println("==============================================");
                    numbin = true;
                    } else {
                        System.out.println("Ese numero no puede ser convertido, por favor ingrese otro");
                        numbin = false;
                    }
                }while(numbin == false);
                
                System.out.println();
                System.out.println("Si quieres convertir otro numero presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 3:
            //TEMPERATURAS
            System.out.println("*********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("*  CONVERSION  DE TEMPERATURAS  *");
            System.out.println("*********************************");
            do{

                System.out.println();
                System.out.println("Primero deberas decirme en que sistema estas");
                System.out.println("Escribe 'C' para centigrados");
                System.out.println("Escribe 'F' para Fahrenheit");
                System.out.println("Escribe 'K' para Kelvin");
                System.out.println("Escribe 'R' para Rankine");
                System.out.println();
                System.out.println("**LA LETRA DEBE ESTAR EN MAYUSCULAS**");
                System.out.println();
                do{
                grad = entrada0.nextLine();
                System.out.println();

                if(grad.equalsIgnoreCase("C") || grad.equalsIgnoreCase("F") || grad.equalsIgnoreCase("K") || grad.equalsIgnoreCase("R")){
                    s1 = true;
                } else{
                    System.out.println("Esa opcion es incorrecta o no esxiste, por favor ingresala de nuevo");
                    System.out.println();
                    s1 = false;
                }

                }while(s1 == false);

                do{
                System.out.print("Ingresa el valor: ");
                grados1 = entrada1.nextDouble();
                System.out.println();

                if(grad.equalsIgnoreCase("C") || grad.equalsIgnoreCase("c")){
                    if(grados1 < -273.15){
                        System.out.println("Esa temperatura no es posible, ingresala de nuevo");
                        s2 = false;
                    }else{
                        s2 = true;
                    }
                }else{
                    if(grad.equalsIgnoreCase("F") || grad.equalsIgnoreCase("f")){
                        if(grados1 < -459.67){
                            System.out.println("Esa temperatura no es posible, ingresala de nuevo");
                            s2 = false;
                        }else{
                            s2 = true;
                        }
                    }else{
                        if(grad.equalsIgnoreCase("K") || grad.equalsIgnoreCase("k")){
                            if(grados1 < 0){
                                System.out.println("Esa temperatura no es posible, ingresala de nuevo");
                                s2 = false;
                            }else{
                                s2 = true;
                            }
                        }else{
                            if(grados1 < 0){
                                System.out.println("Esa temperatura no es posible, ingresala de nuevo");
                                s2 = false;
                            }else{
                                s2 = true;
                                }
                            }
                        }
                    }
                }while(s2 = false);

                    System.out.println();
                    System.out.println("Ahora dime a cual deceas convertirla");
                do{
                do{
                    System.out.println("Escribe 'C' para centigrados");
                    System.out.println("Escribe 'F' para Fahrenheit");
                    System.out.println("Escribe 'K' para Kelvin");
                    System.out.println("Escribe 'R' para Rankine");
                    System.out.println();
                    System.out.println("**LA LETRA DEBE ESTAR EN MAYUSCULAS**");
                    System.out.println();
                    grad0 = entrada0.nextLine();
                    System.out.println();
    
                    if(grad0.equalsIgnoreCase("C") || grad0.equalsIgnoreCase("F") || grad0.equalsIgnoreCase("K") || grad0.equalsIgnoreCase("R")){
                        s3 = true;
                    } else{
                        System.out.println("Esa opcion es incorrecta o no esxiste, por favor ingresala de nuevo");
                        System.out.println();
                        s3 = false;
                    }
    
                }while(s3 == false);

                    if(grad.equalsIgnoreCase("C") && grad0.equalsIgnoreCase("F")){
                            grados2 = (grados1*(9/5))+32;
                            
                            System.out.println("=======================================================================");
                            System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                            System.out.println("=======================================================================");
                            s4 = true;
                    }else{
                        if(grad.equalsIgnoreCase("C") && grad0.equalsIgnoreCase("K")){
                                grados2 = (grados1)+273.15;
                                
                                System.out.println("=======================================================================");
                                System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                System.out.println("=======================================================================");
                                s4 = true;
                        }else{
                            if(grad.equalsIgnoreCase("C") && grad0.equalsIgnoreCase("R")){
                                    grados2 = (grados1)* (9/5) + 491.67;
                                    
                                    System.out.println("=======================================================================");
                                    System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                    System.out.println("=======================================================================");
                                    s4 = true;
                            }else{
                                if(grad.equalsIgnoreCase("F") && grad0.equalsIgnoreCase("C")){
                                    grados2 = (grados1-32)*(5/9);
                                    
                                    System.out.println("=======================================================================");
                                    System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                    System.out.println("=======================================================================");
                                    s4 = true;
                            }else{
                                if(grad.equalsIgnoreCase("F") && grad0.equalsIgnoreCase("K")){
                                        grados2 = ((grados1-32)*(5/9))+273.15;
                                        
                                        System.out.println("=======================================================================");
                                        System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                        System.out.println("=======================================================================");
                                        s4 = true;
                                }else{
                                    if(grad.equalsIgnoreCase("F") && grad0.equalsIgnoreCase("R")){
                                                grados2 = (grados1)+459.67;
                                                
                                                System.out.println("=======================================================================");
                                                System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                                System.out.println("=======================================================================");
                                                s4 = true;
                                    }else{
                                        if(grad.equalsIgnoreCase("K") && grad0.equalsIgnoreCase("C")){
                                            grados2 = (grados1)-273.15;
                                            
                                            System.out.println("=======================================================================");
                                            System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                            System.out.println("=======================================================================");
                                            s4 = true;
                                    }else{
                                        if(grad.equalsIgnoreCase("K") && grad0.equalsIgnoreCase("F")){
                                                grados2 = ((grados1)+273.15)*(9/5)+32;
                                                
                                                System.out.println("=======================================================================");
                                                System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                                System.out.println("=======================================================================");
                                                s4 = true;
                                        }else{
                                            if(grad.equalsIgnoreCase("K") && grad0.equalsIgnoreCase("R")){
                                                        grados2 = (grados1)*(1.8);
                                                        
                                                        System.out.println("=======================================================================");
                                                        System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                                        System.out.println("=======================================================================");
                                                        s4 = true;
                                            }else{
                                                if(grad.equalsIgnoreCase("R") && grad0.equalsIgnoreCase("C")){
                                                    grados2 = (grados1-491.67) * (5/9);
                                                    
                                                    System.out.println("=======================================================================");
                                                    System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                                    System.out.println("=======================================================================");
                                                    s4 = true;
                                            }else{
                                                if(grad.equalsIgnoreCase("R") && grad0.equalsIgnoreCase("F")){
                                                            grados2 = (grados1)-459.67;
                                                            
                                                            System.out.println("=======================================================================");
                                                            System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                                            System.out.println("=======================================================================");
                                                            s4 = true;
                                                }else{
                                                    if(grad.equalsIgnoreCase("R") && grad0.equalsIgnoreCase("K")){
                                                                grados2 = (grados1)*(5/9);
                                                                
                                                                System.out.println("=======================================================================");
                                                                System.out.println(grados1 + " grados " + grad + " son: " + grados2 + " grados " + grad0);
                                                                System.out.println("=======================================================================");
                                                                s4 = true;
                                                    }else{
                                                        System.out.println("NO ES POSIBLE ESA CONVERSION");
                                                        System.out.println("POR FAVOR INGRESA UNA LETRA VALIDA");
                                                        s4 = false;
                                                    }
                                                }
                                              }
                                            }
                                        }
                                      }
                                    }
                                }
                              }
                            }
                        }
                    }

                }while(s4 == false);
                
                System.out.println("Si quieres convertir otra temperatura presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 4:
            //NUMEROS POSITIVOS Y NEGATIVOS
            System.out.println("*******************************************");
            System.out.println("*       BIENVENIDO AL PROGRAMA DE         *");
            System.out.println("* CONTEO DE NUMEROS POSITIVOS Y NEGATIVOS *");
            System.out.println("*******************************************");
            do{
                System.out.println();
                System.out.println("En este programa ingresaras numeros negativos y positivos ");
                System.out.println("Y al final te dire cuantos fueron negativos, cuantos positivos y el total");
                System.out.println();
                System.out.println("**PARA TERMINAR DE INGRESAR NUMEROS DEBERAS ESCRIBIR '0' **");
                System.out.println();

                do{
                System.out.print("Ingresa el primer numero:   ");
                numeros = entrada.nextInt();
                if(numeros > 0){
                    numpos = numpos + 1;
                }else{
                    if(numeros<0){
                        numneg = numneg + 1;
                    }else{
                        System.out.println();
                        System.out.println("El primer numero no puede ser 0");
                        System.out.println("Vuelve a ingresarlo");
                        System.out.println();
                    }
                }
                }while(numpos == 0 && numneg == 0);
                System.out.println();
                do{
                    System.out.print("Ingresa el siguiente numero:   ");
                    numeros = entrada.nextInt();
                    if(numeros > 0){
                        numpos = numpos + 1;
                        total = total + 1;
                    }else{
                        if(numeros<0){
                            numneg = numneg + 1;
                            total = total + 1;
                        }
                    }
                    System.out.println();

                }while(numeros != 0);
                
                System.out.println("En total son: " + total + "numeros");
                System.out.println("Siendo:   " + numpos + " numeros positivos");
                System.out.println("Y siendo: " + numneg + " numeros negativos");

                numneg = 0;
                numpos = 0;
                total = 0;
                
                System.out.println("Si quieres contar nuevos numeros presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 5:
            System.out.println("*********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("*   CALCULO DEL TOTAL A PAGAR   *");
            System.out.println("*********************************");
            //PRODUCTOS
            do{
                
                System.out.print("Primero dime cuantos productos deseas ingresar: ");
                do{
                cantidad = entrada.nextInt();
                System.out.println();
                if(cantidad == 0 || cantidad < 0 || cantidad > 100){
                    System.out.println("El numero no pude ser negativo, mayor a 100, ni 0, ingresalo de nuevo");
                }
                }while(cantidad == 0 || cantidad < 0 || cantidad > 100);

                int precio[] = new int[cantidad];
                String producto[] = new String[cantidad];

                for(int i = 0; i < precio.length; i++){
    
                    System.out.println("Dime el nombre del producto #" + (i+1));
                    producto[i] = entrada0.nextLine(); 
                    System.out.print(producto[i] + " cuesta:       $");
                    precio[i] = entrada.nextInt();
                    pago = pago + precio[i];
                  }
                  System.out.println("=======================================");
                  System.out.println();
                  System.out.println("Su total a pagar es de:  $ " + pago);
                  System.out.println("=======================================");
                  System.out.println();
                  pago = 0;

                System.out.println("Si quieres sumar nuevos productos presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 6:
            //FIGURAS
            System.out.println("*********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("*       CALCULO DE FIGURAS      *");
            System.out.println("*********************************");

            fig:
            do{
                System.out.println();
                System.out.println("Elija una opcion");
                System.out.println();

                System.out.println("A. Calculo de area y perimetro de un rectangulo");
                System.out.println("B. Calculo de area y perimetro de un triangulo");
                System.out.println("C. Calculo del volumen de una esfera y un cilindro");
                System.out.println("**ESCRIBE LA LETRA EN MAYUSCULAS**");

                figuras = entrada0.nextLine();

                switch (figuras){
                
                case "A": 
                //RECTANGULO
                System.out.println("Ingresa el valor de la base");
                base = entrada1.nextDouble();
                while(base <=0 ){
                    System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                    base = entrada1.nextDouble();
                        }
                System.out.println("Ingresa el valor de  la altura");
                altura = entrada1.nextDouble();
                    while(altura <=0 ){
                    System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                    altura = entrada1.nextDouble();
                    }
                        area = base*altura;
                        perimetro = (base*2)+(altura*2);
                    System.out.println("");
                System.out.println("===============================");
                System.out.println("El area es: "+area);
                System.out.println("El perimetro es: "+perimetro);
                System.out.println("===============================");
                    System.out.println("");

                break;

                case "B":
                //TRIANGULO
                System.out.println("Ingresa el valor de la base");
                base = entrada1.nextDouble();
                    while(base <=0 ){
                    System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                    base = entrada1.nextDouble();
                    }
                    System.out.println("Ingresa el valor de  la altura");
                    altura = entrada1.nextDouble();
                        while(altura <=0 ){
                        System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                        altura = entrada1.nextDouble();
                        }
                        area = (base*altura)/2;

                        System.out.println("Para conocer el perimetro necesito conocer la medida de los otros lados");
                        System.out.println("Ingresa el valor del segundo lado");
                        l2 = entrada1.nextDouble();
                        while(l2 <=0 ){
                            System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                            l2 = entrada1.nextDouble();
                            }
                        System.out.println("Ingresa el valor del tercer lado");
                        l3 = entrada1.nextDouble();
                        while(l3 <=0 ){
                            System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                            l3 = entrada1.nextDouble();
                            }
                        perimetro = base+l2+l3;
                    System.out.println("");
                System.out.println("===============================");
                System.out.println("El area es: "+area);
                System.out.println("El perimetro es: "+perimetro);
                System.out.println("===============================");
                    System.out.println("");

                break;

                case "C":
                //ESFERA Y CILINDRO

                            //CILINDRO
                            System.out.println("Ingresa el valor del radio del cilindro");
                            base = entrada1.nextDouble();
                            while(base <=0 ){
                                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                                base = entrada1.nextDouble();
                                    }
                            System.out.println("Ingresa el valor de  la altura");
                            altura = entrada1.nextDouble();
                                while(altura <=0 ){
                                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                                altura = entrada1.nextDouble();
                                }
                                    area = (3.14159265)*(base*base)*(altura);

                            //ESFERA

                            System.out.println("Ingresa el valor del radio de la esfera");
                            base = entrada1.nextDouble();
                            while(base <=0 ){
                                System.out.println("El valor no puede ser 0 ni negativo, por favor ingresalo de nuevo");
                                base = entrada1.nextDouble();
                                    }

                            perimetro = (4/3)*(3.14159265)*(base*base*base);

                                System.out.println("");
                            System.out.println("=======================================");
                            System.out.println("El volumen del cilindro es: "+area);
                            System.out.println("El volumen de la esfera es: "+perimetro);
                            System.out.println("=======================================");
                                System.out.println("");



                break;

                default:
                    System.out.println("Esa opcion no existe, ingresala de nuevo");
                continue fig;
                                }

                System.out.println("Si quieres calcular otra figura presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 7:
            //TABLA
            System.out.println("*********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("* IMPRESION DE TABLA DE VALORES *");
            System.out.println("*********************************");
            do{
                
                do{
                System.out.println();
                System.out.println("¿Hasta que numero desea imprimir la tabla?");
                System.out.println();
                tabla = entrada.nextInt();
                System.out.println();
                System.out.println();

                if(tabla <= 0 || tabla >= 100){
                    System.out.println("El valor no puede ser negativo, 0 o mayor a 99 ");
                }

                }while(tabla <= 0 || tabla >= 100);

                for(int i = 1; i<= tabla; i++){

                System.out.println("| "+i+" | "+(i*10)+" | "+(i*100)+" | "+(i*1000)+" |");

                }
                System.out.println();

                System.out.println("Si quieres hacer otra tabla presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 8:
            //No. FACTORIAL
            System.out.println("***************************************");
            System.out.println("*       BIENVENIDO AL PROGRAMA DE     *");
            System.out.println("*  CALCULO DEL FACTORIAL DE UN NUMERO *");
            System.out.println("***************************************");
            do{
                do{
                System.out.println("Ingresa el numero del cual deseas calcular el factorial");
                System.out.println();
                factorial = entrada.nextInt();
                System.out.println();
                if(factorial == 0 || factorial < 0){
                    System.out.println("El numero no pude ser negativo ni 0, ingresalo de nuevo");
                }
                }while(factorial == 0 || factorial < 0);

                for(int i = factorial; i>1; i--){
                    System.out.print(i+"x");
                }
                    System.out.print("1=");

                for(int i = factorial; i>1; i--){

                    factorial = factorial*(i-1);
                }
                System.out.println(factorial);

                System.out.println("Si quieres ingresar un nuevo numero presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 9:
            //CUADRADO
            System.out.println("**********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE    *");
            System.out.println("*   IMPRESION  DE UN CUADRADO    *");
            System.out.println("**********************************");
            do{
                do{
                System.out.println();
                System.out.println("¿Cuanto quieres que mida el lado de tu cuadrado?");
                lado = entrada.nextInt();
                System.out.println();
                if(lado == 0 || lado < 0 || lado > 50){
                    System.out.println("El numero no pude ser negativo, mayor a 50, ni 0, ingresalo de nuevo");
                }
                }while(lado == 0 || lado < 0 || lado > 50);

                for(int i=0; i<lado; i++){
                    System.out.println();
                    for(int j=0; j<lado; j++){
                        System.out.print("* ");
                    }
                }
                System.out.println();

                System.out.println("Si quieres hacer otro cuadrado presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 10:
            //CUADRADO SIN RELLENO
            System.out.println("***********************************");
            System.out.println("*     BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("*  IMPRESION DE UN CUADRADO HUECO *");
            System.out.println("***********************************");
            do{
                do{
                System.out.println();
                System.out.println("¿Cuanto quieres que mida el lado de tu cuadrado?");
                lado2 = entrada.nextInt();
                System.out.println();
                if(lado2 == 0 || lado2 < 0 || lado2 > 50){
                    System.out.println("El numero no pude ser negativo, mayor a 50, ni 0, ingresalo de nuevo");
                }
                }while(lado2 == 0 || lado2 < 0 || lado2 > 50);

                for(int i=1; i<=lado2; i++){
                    System.out.print("* ");
                }
                System.out.println();
                for(int j=1; j<(lado2-1); j++){
                    System.out.print("*");
                    for(int k=2; k<lado2; k++){
                        System.out.print("  ");
                    }
                    System.out.print(" ");
                    System.out.print("*");
                    System.out.println();
                }

                for(int i=0; i<lado2; i++){
                    System.out.print("* ");
                }

                System.out.println();

                System.out.println("Si quieres hacer otro cuadrado presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 11:
            //ASTERISCOS
            System.out.println("*********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("*    IMPRESION DE UN PATRON     *");
            System.out.println("*********************************");
                
                System.out.println();
                System.out.println("El patron es el siguiente: ");
                System.out.println();
                System.out.println("******** ");
                System.out.println(" ********");
                System.out.println();

                do{
                System.out.println("¿Cuantas veces quieres que se repita?");
                do{
                patron = entrada.nextInt();
                System.out.println();
                System.out.println();

                if(patron == 0 || patron < 0 || patron > 50){
                    System.out.println("El numero no pude ser negativo, mayor a 50, ni 0, ingresalo de nuevo");
                }
                }while(patron == 0 || patron < 0 || patron > 50);

                for(int i=patron; i>0; i--){
                    System.out.println("");
                    for(int j= 8; j>0; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.print(" ");
                    for(int j= 8; j>0; j--){
                        System.out.print("*");
                    }
                }
                System.out.println();
                System.out.println();

                System.out.println("Si quieres imprimir otro patron presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 12:
            //DIMANTE
            System.out.println("*********************************************");
            System.out.println("*          BIENVENIDO AL PROGRAMA DE        *");
            System.out.println("*  IMPRESION DE PATRON EN FORMA DE DIAMANTE *");
            System.out.println("*********************************************");
            do{
                System.out.println();
                System.out.println();

                System.out.println();
            
                for(int j=1; j<=9; j+=2){
                    for(int k=9; k>j; k-=2){
                        System.out.print(" ");
                    }
                    for(int k=1; k<=j; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                    }
                for(int j=9; j>1; j-=2){
                    for(int k=9; k>=j; k-=2){
                        System.out.print(" ");
                    }
                    for(int k=3; k<=j; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                    }
  

                System.out.println();
                System.out.println();

                System.out.println("Si quieres imprimirlo de nuevo presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 13:
            //CALCULADORA
            System.out.println("*********************************");
            System.out.println("*   BIENVENIDO AL PROGRAMA DE   *");
            System.out.println("*         CALCULADORA           *");
            System.out.println("*********************************");
            do{

                System.out.println("Para usar esta calculadora debe aprender como se obtiene cada operacion");
                System.out.println("Use '+' para sumar");
                System.out.println("Use '-' para restar");
                System.out.println("Use '*' para multiplicar");
                System.out.println("Use '/' para dividir");
                System.out.println("Use '=' para obtener el resultado");
                System.out.println("DESPUES DE INGRESAR CADA VALOR U OPERADOR DEBE PRESIONAR 'ENTER' PARA EFECTUAR LA OPERACION");
                System.out.println();


                    System.out.print("Valor: ");
                    num1 = entrada1.nextDouble();
                    System.out.println();
                    while(calculadora == false){
                        System.out.print("Operador: ");
                        opcionc = entrada0.nextLine();
                        if(opcionc.equalsIgnoreCase("+") || opcionc.equalsIgnoreCase("-") || opcionc.equalsIgnoreCase("*") || opcionc.equalsIgnoreCase("/")){
                            calculadora =true;
                        }else{
                            System.out.println("Operador inexistente, ingresalo nuevamente");
                            calculadora = false;
                        }
                    }

                    System.out.println();
                    System.out.print("Valor: ");
                    num2 = entrada1.nextDouble();
                    System.out.println();

                    if(opcionc.equalsIgnoreCase("+")){
                        resultado = (num1)+(num2);
                    }else{
                        if(opcionc.equalsIgnoreCase("-")){
                            resultado = (num1)-(num2);
                        }else{
                            if(opcionc.equalsIgnoreCase("*")){
                                resultado = (num1)*(num2);
                            }
                            else{
                                if(opcionc.equalsIgnoreCase("/")){
                                    resultado = (num1)/(num2);
                                }
                            }
                        }
                    }
                    calculadora = false;
                    while(calculadora3 == false){
                    do{
                    System.out.print("Operador o resultado: ");
                    opcionc1 = entrada0.nextLine();
                    System.out.println();
                    if(opcionc1.equalsIgnoreCase("=")){
                        calculadora = true;
                            calculadora2 = true;
                                calculadora3 = true;
                    }else{
                        if(opcionc1.equalsIgnoreCase("+") || opcionc1.equalsIgnoreCase("-") || opcionc1.equalsIgnoreCase("*") || opcionc1.equalsIgnoreCase("/")){
                            calculadora = true;
                            calculadora2 = false;
                            calculadora3 = false;
                        }else{
                            System.out.println("Operador inexistente, ingresalo nuevamente");
                            calculadora = false;
                            calculadora2 = false;
                            calculadora3 = false;
                        } 
                    }
                    }while(calculadora == false);

                    if(opcionc1.equalsIgnoreCase("=")){
                        calculadora = true;
                            calculadora2 = true;
                                calculadora3 = true;
                    }else{
                        System.out.print("Valor: ");
                        num1 = entrada1.nextDouble();
                        System.out.println();
                        }

                    if(opcionc1.equalsIgnoreCase("+")){
                        resultado = resultado + (num1);
                        calculadora2 = false;
                        calculadora3 = false;
                    }else{
                        if(opcionc1.equalsIgnoreCase("-")){
                            resultado = resultado - (num1);
                            calculadora2 = false;
                            calculadora3 = false;
                        }else{
                            if(opcionc1.equalsIgnoreCase("*")){
                                resultado = resultado * (num1);
                                calculadora2 = false;
                                calculadora3 = false;
                            }
                            else{
                                if(opcionc1.equalsIgnoreCase("/")){
                                    resultado = resultado / (num1);
                                    calculadora2 = false;
                                    calculadora3 = false;
                                }else{
                                    if(opcionc1.equalsIgnoreCase("=")){
                                        calculadora = true;
                                            calculadora2 = true;
                                                calculadora3 = true;
                                }
                            }
                        }
                    }


                    }

                }while(calculadora2 == false);

                System.out.println("======================================");
                System.out.println("    El resultado es:  " + resultado);
                System.out.println("======================================");
                System.out.println();
                calculadora = false;
                calculadora2 = false;
                calculadora3 = false;
                
                System.out.println("Si quieres hacer otra operacion presiona 'enter'");
                System.out.println("Si quieres volver al menu principal escribe 'M'");
                System.out.println("Si quieres cerrar el programa escribe 'X'");
                System.out.println();

                do{

                finp = entrada0.nextLine();

                System.out.println();

                if(finp.equalsIgnoreCase("M") || finp.equalsIgnoreCase("m")){
                        menu = true;
                        menu0 = true;
                        cerrar= false;
                        continue menu_principal;
                }else{
                    if(finp.equalsIgnoreCase("X") || finp.equalsIgnoreCase("x")){
                        System.out.println("-------------------------------");
                        System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                        System.out.println("-------------------------------");
                        menu = true;
                        menu0 = true;
                        cerrar = true;
                    }else{
                        if(finp.equalsIgnoreCase("") || finp.equalsIgnoreCase("")){
                            menu = false;
                            menu0 = true;
                            cerrar = false;
                        }else{
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Esa opcion no existe o es incorrecta, por favor ingresala de nuevo");
                            System.out.println("------------------------------------------------------------------");
                            menu = false;
                            menu0 = false;
                            cerrar = false;

                        }
                    }
                } 
              }while(menu0 == false);                
            }while(menu == false);

            break;

            case 14:

                System.out.println("-------------------------------");
                System.out.println("   EL PROGRAMA HA FINALIZADO   ");
                System.out.println("-------------------------------");
                cerrar=true;

            break;

            default:

            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            System.out.println("ESA OPCION NO EXISTE, POR FAVOR INGRESALA DE NUEVO");
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            continue menu_principal;

            }
        }while(cerrar == false);

    }
}