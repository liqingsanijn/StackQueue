/**
 * Created by mini on 17/2/22.
 */
public class StackQueue<T> {

    private Stack<T> left;
    private Stack<T> right;

    private int size;

    public StackQueue() {
        left = new Stack<T>();
        right = new Stack<T>();
        empty();
    }

    public void empty() {
        left.empty();
        right.empty();
        size = 0;
    }

    public void inQueue(T e) {
        left.push(e);
        size++;
    }

    public T outQueue() {
        if (size == 0) {
            return null;
        }
        //将左边的栈的数据从顶部压到右边栈的底部
        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        //右边的栈弹出栈顶
        T e = right.pop();
        //右边的栈重新压入左边的栈
        while (!right.isEmpty()) {
            left.push(right.pop());
        }
        size--;
        return e;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
