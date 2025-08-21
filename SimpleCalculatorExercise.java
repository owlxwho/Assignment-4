
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class SimpleCalculatorExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("- Nhap:");
        
        System.out.print(" + Nhap so thu 1: ");
        int n1 = kb.nextInt();
        System.out.print(" + Nhap so thu 2: ");
        int n2 = kb.nextInt();
        System.out.print(" + Nhap toan tu: ");
        String o = kb.next();
        
        switch(o){
            case "+": System.out.println(n1 + " + " + n2 + " = " + (n1+n2)); break;
            case "-": System.out.println(n1 + " - " + n2 + " = " + (n1-n2)); break;
            case "*": System.out.println(n1 + " * " + n2 + " = " + (n1*n2)); break;
            case "/": 
                if(n2 == 0){
                    System.out.println("Error: Khong the chia cho 0");
                }else{
                    System.out.println(n1 + "/" + n2 + " = " + (n1/n2)); break; 
                }
            default: System.out.println("Toan tu khong phu hop!");
        }
        kb.close();
    }
}
