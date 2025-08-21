
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class QuadrantDeterminationExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap x: ");
        double x = kb.nextDouble();
        System.out.print("- Nhap y: ");
        double y = kb.nextDouble();
        
        if(x>0 && y>0){
            System.out.println("-> Diem nam tren goc phan tu thu 1");
        }else if(x<0 && y>0){
            System.out.println("-> Diem nam tren goc phan tu thu 2");
        }else if(x<0 && y<0){
            System.out.println("-> Diem nam tren goc phan tu thu 3");
        }else if(x>0 && y<0){
            System.out.println("-> Diem nam tren goc phan tu thu 4");
        }else{
            System.out.println("-> Diem khong tren truc toa do nao ca!");
        }
        kb.close();
    }
}
