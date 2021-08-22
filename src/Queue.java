public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    public Queue()
    {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted " + element);
            return (element);
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++){
                System.out.print(items[i] + "  ");
            }

        }
    }
}
