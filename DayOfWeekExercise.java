
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class DayOfWeekExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap ngay: ");
        int n = kb.nextInt();
        
        switch(n){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Thong bao: Loi khong tim thay thu!");
        }
    }
}
