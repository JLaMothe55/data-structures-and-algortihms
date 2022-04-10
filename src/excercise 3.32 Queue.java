class Queue {
    Node front;
    Node rear;

    class Node {
        int data;
        Node link;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public Queue()
    {
        this.front = this.rear = null;
    }

    void enqueue(int queueItemData)
    {

        Node temp = new Node();
        temp.data = queueItemData;
        temp.link = null;

        if (this.rear == null) {
            this.front = temp;
            this.rear = temp;
            return;
        }

        this.rear.link = temp;
        this.rear = temp;
    }

    void dequeue()
    {
        if (this.front == null)
        {
            System.out.println("Queue is empty");
            return;
        }


        this.front = this.front.link;

        if (this.front == null)
        {
            this.rear = null;
        }
    }

    public int peek(){
        return this.front.data;
    }

    public int getLength(){
        if (front == null) {
            return 0;
        }
        else {
            Node temp = front;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.link;
            }
            return count;
        }
    }
}

class queueUsingSinglyLinkedList {
    public static void main(String[] args)
    {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.enqueue(27);
        System.out.printf("\nTop most node is %d\n", queue.peek());
        queue.enqueue(4000);
        queue.dequeue();
        queue.enqueue(98304);
        queue.enqueue(10294);
        queue.enqueue(76301);
        queue.dequeue();
        queue.enqueue(98304);
        System.out.printf("\nLength of the stack is %d\n", queue.getLength());
        System.out.println(queue.isEmpty());
        System.out.printf("\nTop most node is %d\n", queue.peek());
    }
}