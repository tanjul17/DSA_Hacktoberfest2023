import java.util.Stack;

public class StackA {
    public static void pushATBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;

        }
        int top = s.pop();
        pushATBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(2);
        s.push(2);
        pushATBottom(s, 5);

        // System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
