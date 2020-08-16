import java.util.Stack;

class MinStack {

    int min = 0;
    Stack<Integer> data_stack;
    Stack<Integer> min_stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {

        data_stack = new Stack();
        min_stack = new Stack();

    }

    public void push(int x) {

        if (min_stack.size() == 0 || x <= min_stack.peek())
            min_stack.push(x);

        data_stack.push(x);
    }

    public void pop() {


        int x = data_stack.pop();
        if (x == min_stack.peek()) {
            min_stack.pop();
        }
    }

    public int top() {

        return data_stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}