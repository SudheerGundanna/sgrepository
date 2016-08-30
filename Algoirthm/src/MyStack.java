import java.util.Stack;

public class MyStack {

    private int n;

    MyStack(int Val) {
        n = Val;
    }

    public void printStack() {
        Stack<Integer> stack = new Stack<Integer>();

        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }

        for (int d : stack) {
            System.out.println(1 % 2);
            System.out.println(1 % 3);
        }
    }
}