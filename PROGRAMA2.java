
package operaciones;

import java.util.Scanner;

/**
 * @author KARLA
 */
public class Operaciones {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        double Numero1=0;
        double Numero2=0;
        double Suma=0;
        double Resta=0;
        double Division=0;
        double Multiplicacion=0;
        
        System.out.println("INGRESE EL PRIMER NUMERO:");
        Numero1=entrada.nextDouble();
        System.out.println("INGRESE EL SEGUNDO NUMERO:");
        Numero2=entrada.nextDouble();
        
        Suma=Numero1+Numero2;
        Resta=Numero1-Numero2;
        Division=Numero1/Numero2;
        Multiplicacion=Numero1*Numero2;
        
        System.out.println("LA SUMA ES:"+Suma);
        System.out.println("LA RESTA ES:"+Resta);
        System.out.println("LA DIVISION ES:"+Division);
        System.out.println("LA MULTIPLICACION ES:"+Multiplicacion);
    }
    
}
