package week4.studyCode;

/**
 * int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
 * void push(int data)를 구현하세요.
 * int pop()을 구현하세요.
 */

public class Stack {

    private int[] arr;
    private int size;

    public Stack() {
        this.arr = new int[1_000_000_000];
        this.size = 0;
    }

    public void push(int number) {
        arr[size] = number;
        size++;
    }

    public int pop() {
        if (size <= 0) {
            throw new DataStructureException("stack is empty");
        }
        return arr[--size];
    }

    public int getSize() {
        return this.size;
    }
}
