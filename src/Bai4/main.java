package Bai4;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stacksoDu = new Stack<Integer>();
        System.out.println("Nhap so thap phan can chuyen :");
        int x = scanner.nextInt();
        while (x > 0){
            int soDu = x%2;
            stacksoDu.push(soDu);
            x/=2;
        }
        System.out.println("so nhi phan sau khi duoc chuyen la :");
        while (!(stacksoDu.isEmpty())){
            int n = stacksoDu.size();
            for (int i = 0; i < n; i++) {
                System.out.print(stacksoDu.pop());
            }
        }
    }
}
