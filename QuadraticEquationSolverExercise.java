
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class QuadraticEquationSolverExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap a: ");
        double n1 = kb.nextDouble();
        System.out.print("- Nhap b: ");
        double n2 = kb.nextDouble();
        System.out.print("- Nhap c: ");
        double n3 = kb.nextDouble();
        
        double delta = n2*n2 - 4*n1*n3;
        if(n1==0){
            double x = -n3/n2;
            System.out.println("-> Phuong trinh tuyen tinh " + " | Nghiem x = " + x);
        }else if(delta<0){
            System.out.println("-> Phuong trinh vo nghiem");
        }else if(delta==0){
            double x = -n2/(2*n1);
            System.out.println("-> Phuong trinh co nghiem kep " + " | Nghiem x1 = x2 = " + x);
        }else{
            double x1 = (-n2+Math.sqrt(delta))/(2*n1);
            double x2 = (-n2-Math.sqrt(delta))/(2*n1);
            System.out.println("-> Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("- x1 = " + x1);
            System.out.println("- x2 = " + x2);
        }
        kb.close();
    }
}
