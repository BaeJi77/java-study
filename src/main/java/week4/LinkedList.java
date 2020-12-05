package week4;

/**
 * LinkedList에 대해 공부하세요.
 * 정수를 저장하는 ListNode 클래스를 구현하세요.
 * ListNode add(ListNode head, ListNode nodeToAdd, int position)를 구현하세요.
 * ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
 * boolean contains(ListNode head, ListNode nodeTocheck)를 구현하세요.
 */

public class LinkedList {

    private Node front;
    private Node tail;

    private int size;

    public LinkedList() {
        this.front = null;
        this.tail = null;
        this.size = 0;
    }

    public void printAll() {
        Node now = front;
        for (int i = 0; i < size; i++) {
            System.out.println(now.value);
            now = now.next;
        }
    }

    public Node getFront() {
        return front;
    }

    public void insert(Node newNode) {
        if (front == null) {
            front = newNode;
            tail = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
    }

    public void deleteFront() {
        if (front == null) {
            throw new DataStructureEmptyException("LinkedList is null");
        } else {
            Node temp = front.next;
            front = temp;
            size--;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void deleteAll() {
        for (int i = 0; i < size; i++) {
            deleteFront();
        }
        size = 0;
    }

    public static class Node <T>{
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }



    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(10);
        Node node3 = new Node(15);

        linkedList.insert(node1);
        linkedList.insert(node2);
        linkedList.insert(node3);

        linkedList.printAll();

        linkedList.deleteFront();
        linkedList.deleteFront();
        linkedList.deleteFront();
        linkedList.deleteFront();
    }
}
