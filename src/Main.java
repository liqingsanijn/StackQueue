public class Main {

    public static void main(String[] args) {
        StackQueue<Integer> queue = new StackQueue<>();
        //入队
        for (int i = 0; i < 10; i++) {
            queue.inQueue(i);
        }
        //出队，并输出数据
        while (!queue.isEmpty()) {
            System.out.println(queue.outQueue());
        }
    }
}
