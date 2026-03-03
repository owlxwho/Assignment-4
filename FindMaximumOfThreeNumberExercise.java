
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class FindMaximumOfThreeNumberExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap integer 1: ");
        int n1 = kb.nextInt()
        System.out.print("- Nhap integer 2: ");
        int n2 = kb.nextInt();
        System.out.print("- Nhap integer 3: ");
        int n3 = jb.nextInt();
        
        int max = 0;
        if(n1>n2 && n1>n3){
            max = n1;
        }else if(n2>=n1 && n2>=n3){
            max = n2;
        }else{
            max = n1;
        }
        System.out.println("-> So lon nhat la: " + max);
    }
}
