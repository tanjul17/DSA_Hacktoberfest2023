import java.util.*;

public class stackSpanProblem {
    public static void StackSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];

        stackSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
    public static void stackSpan(int[]stocks,int[]span){
        Stack<Integer> stack = new Stack<>();
        stocks[0]=1;
        stack.push(0);
        for(int i = 1;i<stocks.length;i++){
            int curr = stocks[i];       
            while(!stack.isEmpty()&&curr>stocks[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stocks[i]=i+1;
            }else{
                int prev = stack.peek();
                stocks[i]=i-prev;
            }
            stack.push(i);
        }
    }
}
