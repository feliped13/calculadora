package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    
        float num1, num2, suma, resta, mult, div;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Digite el segundo número: ");
        num2 = sc.nextInt();
        
        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + mult);
        System.out.println("El resultado de la división es: " + div);
    }
}
