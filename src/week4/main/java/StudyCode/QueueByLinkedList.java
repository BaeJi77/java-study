package StudyCode;

/**
 * ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.
 * void push(int data)를 구현하세요.
 * int pop()을 구현하세요.
 */

public class QueueByLinkedList {

    private LinkedNode head;
    private LinkedNode end;
    private int size = 0;

    public QueueByLinkedList() {
    }

    public void push(int number) {
        if (head == null) {
            head = new LinkedNode(number);
            end = head;
        } else {
            end = LinkedNode.add(end, new LinkedNode(number), 0);
        }
        size++;
    }

    public int pop() {
        if (size <= 0) {
            throw new DataStructureException("stack is empty");
        }
        size--;

        int result = head.getValue();
        head = head.getNext();
        return result;
    }
}
