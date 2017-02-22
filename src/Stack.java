import java.util.ArrayList;
import java.util.List;

/**
 * Created by mini on 17/2/22.
 */
public class Stack<T> {
    public int size;
    private List<T> elements;


    public Stack() {
        elements = new ArrayList<T>();
        empty();
    }

    public void empty() {
        size = 0;
        elements.clear();
    }

    public T pop() {
        T e = elements.get(size - 1);
        elements.remove(size - 1);
        size--;
        return e;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T e) {
        elements.add(e);
        size++;
    }
}
