import java.util.Stack;

public class MinStack {

      Stack<Long> s = new Stack<>();
    long MinVal;

    public MinStack() {

    }

    public void push(int val) {
        if (s.isEmpty()) {
            s.push((long) val);
            MinVal = val;
        } else {
            if (val < MinVal) {
                s.push(2L * val - MinVal); // Use 2L to ensure long arithmetic
                MinVal = val;
            } else {
                s.push((long) val);
            }
        }
    }

    public void pop() {
        long popped = s.pop();
        if (popped < MinVal) {
            MinVal = 2 * MinVal - popped;
        }
    }

    public int top() {
        if (s.peek() < MinVal) {
            return (int) MinVal;
        } else {
            return s.peek().intValue(); // Convert the Long object to a primitive int
        }
    }

    public int getMin() {
        return (int) MinVal;
    }
    
}
