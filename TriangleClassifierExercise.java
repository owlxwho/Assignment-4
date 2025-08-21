
package Lec4_ConditionalExpression;

import java.util.Scanner;
public class TriangleClassifierExercise {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("- Nhap a: ");
        int n1 = kb.nextInt();
        System.out.print("- Nhap b: ");
        int n2 = kb.nextInt();
        System.out.print("- Nhap c: ");
        int n3 = kb.nextInt();
        
        if(n1==n2 && n2==n3){
            System.out.println("-> Day la tam giac deu");
        }else if(n1==n2 && (n1+n2)>=n3){
            System.out.println("-> Day la tam giac can");
        }else if(n1!=n2 && (n1+n2)>n3){
            System.out.println("-> Day la tam giac thuong");
        }else{
            System.out.println("-> Day khong phai la tam giac!");
        }
        kb.close();
    }
}
