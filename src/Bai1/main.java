package Bai1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong cua mang");
        int index = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(index);
        for (int i = 0; i < index ; i++) {
            System.out.println("Nhap vao phan tu :");
            int a = scanner.nextInt();
            stack.push(a);

        }
        System.out.println("Mang ban dau : "+stack);
        for (int i = 0; i < index; i++) {
            arr.add(stack.pop());
        }
        System.out.println("Mang sau khi doi :"+ arr);
    }
}
