package week4;

/**
 * 배열을 사용해서 한번
 * ListNode를 사용해서 한번.
 */

public class QueueByArray {

    private int[] arr;
    private int size;
    private int front = 0;

    public QueueByArray() {
        this.arr = new int[1_000_000_000];
        this.size = 0;
        this.front = 0;
    }

    public void push(int number) {
        arr[size++] = number;
    }

    public int pop() {
        if (size <= 0) {
            throw new DataStructureException("stack is empty");
        }

        int result = arr[front];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        return result;
    }

}
