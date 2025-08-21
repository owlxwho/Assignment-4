
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class LeapYearCheckerExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap so nam: ");
        int n = kb.nextInt();
        
        if(n%4 == 0 && n%100 !=0){
            System.out.println(n + " la nam nhuan");
        }else{
            System.out.println(n + " khong phai nam nhuan");
        }
    }
}
