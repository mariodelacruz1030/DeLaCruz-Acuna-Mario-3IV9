import java.util.*;

public class prueba{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double raiz, resultado, r, a;
        
        raiz = in.nextDouble();
        r = ((raiz/2)*(raiz/2))-(raiz*raiz);
        r = Math.sqrt(r);
        resultado = (raiz*r)/2;
        System.out.println(r);
        

    }
}