
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class EvenOrOddExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap n: ");
        int n = kb.nextInt()
        
        if(n%2 != 0){
            System.out.println(n + " is an even number");
        }else{
            System.out.printl(n + " is an odd number");
        }
    }
}
