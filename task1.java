
import java.util.Scanner;
public class task1 {
    // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5 
public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        Integer fact = 1;
        Integer triangular_number = 0;
        for(int i = 1; i <= n; i++){
            triangular_number = triangular_number+i;
            fact = fact*i;
        }
        System.out.println("Треугольное число: " + triangular_number);
        System.out.println("Факториал числа: " + fact);
    }
}

