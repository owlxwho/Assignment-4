
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class AbsoluteValueTernaryOperatorExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap so: ");
        int n = kb.nextInt();
        
        int a = (n>=0)?n:-n;
        System.out.println("-> So tuyet doi la: " + a);
    }
}
