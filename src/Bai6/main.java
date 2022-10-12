package Bai6;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bieu thuc can kiem tra :");
        String inputString = sc.nextLine();
        Stack<Character> firstStack = new Stack<>();
        Stack<Character> secondStack = new Stack<>();
        char[] arrchar = inputString.toCharArray();
        for (int i = 0; i < arrchar.length; i++) {
            if (arrchar[i] == '('){
                firstStack.push('(');
            }

        }
    }
}
