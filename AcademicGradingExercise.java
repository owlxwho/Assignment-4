
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class AcademicGradingExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap so diem: ");
        int n = kb.nextInt();
        
        if(n<5){
            System.out.println("Fail");
        }else if(n<=6.4){
            System.out.println("Average");
        }else if(n<=7.9){
            System.out.println("Fair");
        }else if(n<=8.9){
            System.out.println("Good");
        }else{
            System.out.println("Excellent");
        }
    }
}
