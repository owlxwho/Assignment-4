
package Lec4_ConditionalExpression;
import java.util.Scanner;
public class AgeGroupExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap so tuoi: ");
        int n = kb.nextInt();
        
        if(n<=12){
            System.out.println("Child");
        }else if(n<=19){
            System.out.println("Teenager");
        }else if(n<=59){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
    }
}
