class Queue {
    int[] arr;
    int front, rear;
    int size;

    Queue(int x) {
        arr = new int[x];
        front = rear = -1;
        size = x;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return rear == size - 1;
    }

    void push(int x) {
        if (isEmpty()) {
            front = rear = 0;
            arr[0] = x;
        } else {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            } else {
                rear++;
                arr[rear] = x;
            }
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        } else {
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueuesTest {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display();

        q.pop();
        q.display();

        q.push(6);
    }
}
