package Bai5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap vap chuoi muon kiem tra ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Stack stack =  new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()){
            reverseString = reverseString + stack.pop();
        }
        if (inputString.equals(reverseString)){
            System.out.println("La chuoi doi xung !");

        }else {
            System.out.println("Khong phai chuoi doi xung !");
        }
    }
}
