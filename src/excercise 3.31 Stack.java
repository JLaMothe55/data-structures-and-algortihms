class StackUsingSinglyLinkedlist {
    Node topNode;

    StackUsingSinglyLinkedlist()
    {
        this.topNode = null;
    }

    private class Node
    {
        int data;
        Node link;
    }

    public boolean isEmpty()
    {
        return topNode == null;
    }

    public void push(int stackItemData)
    {
        Node temp = new Node();
        temp.data = stackItemData;
        temp.link = topNode;
        topNode = temp;
    }

    public void pop()
    {
        if (topNode == null) {
            System.out.print("\nStack already empty.");
            return;
        }
        topNode = (topNode).link;
    }

    public int peek()
    {
        if (topNode != null) {
            return topNode.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int getLength()
    {
        if (topNode == null) {
            return 0;
        }
        else {
            Node temp = topNode;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.link;
            }
            return count;
        }
    }
}

class StackUsingSinglyLinkedListMain {
    public static void main(String[] args)
    {
        StackUsingSinglyLinkedlist stackItem = new StackUsingSinglyLinkedlist();

        System.out.println(stackItem.isEmpty());

        stackItem.push(47);
        stackItem.push(999);
        stackItem.push(53);
        stackItem.push(1000021);
        stackItem.push(47);
        stackItem.push(89);
        stackItem.push(1000021);

        System.out.println(stackItem.isEmpty());

        System.out.printf("\nTop most node is %d\n", stackItem.peek());

        stackItem.pop();
        stackItem.pop();

        System.out.printf("\nLength of the stack is %d\n", stackItem.getLength());

        stackItem.pop();

        System.out.printf("\nTop most node is %d\n", stackItem.peek());
    }
}