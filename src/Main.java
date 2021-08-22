public class Main {
    public static void main(String[] args) {
        Queue que = new Queue();
        que.enQueue(10);
        que.enQueue(20);
        que.enQueue(30);
        que.enQueue(40);


        que.display();
        que.deQueue();
        que.display();
    }
}
