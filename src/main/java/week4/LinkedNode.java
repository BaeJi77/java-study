package week4;

import java.util.Objects;

/**
 * LinkedList에 대해 공부하세요.
 * 정수를 저장하는 ListNode 클래스를 구현하세요.
 * ListNode add(ListNode head, ListNode nodeToAdd, int position)를 구현하세요.
 * ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
 * boolean contains(ListNode head, ListNode nodeTocheck)를 구현하세요.
 */

public class LinkedNode {

    private int value;
    private LinkedNode next;

    public LinkedNode(int value) {
        this.value = value;
        this.next = null;
    }

    public static LinkedNode getLinkedNodeByPosition(LinkedNode head, int position) {
        LinkedNode targetNode = null;

        int nowPosition = 0;
        LinkedNode nowLinkedNode = head;
        while (nowLinkedNode != null) {
            if (position == nowPosition) {
                targetNode = nowLinkedNode;
                break;
            }

            nowLinkedNode = nowLinkedNode.next;
            nowPosition++;
        }

        return targetNode;
    }

    public static void printAll(LinkedNode head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static LinkedNode add(LinkedNode head, LinkedNode nodeToAdd, int position) {
        LinkedNode nowLinkedNode = head;
        int nowPosition = 0;

        while (nowLinkedNode != null) {
            if (position == nowPosition) {
                nodeToAdd.next = nowLinkedNode.next;
                nowLinkedNode.next = nodeToAdd;
                break;
            }

            nowLinkedNode = nowLinkedNode.next;
            nowPosition++;
        }

        return nodeToAdd;
    }

    public static LinkedNode remove(LinkedNode head, int positionToRemove) {
        LinkedNode targetLinkedNode = null;

        LinkedNode preLinkedNode = head;
        LinkedNode nowLinkedNode = head;
        int nowPosition = 0;
        while (nowLinkedNode != null) {
            if (positionToRemove == nowPosition) {
                targetLinkedNode = nowLinkedNode;
                preLinkedNode.next = nowLinkedNode.next;
                break;
            }

            preLinkedNode = nowLinkedNode;
            nowLinkedNode = nowLinkedNode.next;
            nowPosition++;
        }

        return targetLinkedNode;
    }

    public static boolean contains(LinkedNode head, LinkedNode nodeToCheck) {
        LinkedNode nowLinkedNode = head;
        while (nowLinkedNode != null) {
            if (nowLinkedNode.equals(nodeToCheck)) {
                return true;
            }

            nowLinkedNode = nowLinkedNode.next;
        }

        return false;
    }

    public int getValue() {
        return value;
    }

    public LinkedNode getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedNode that = (LinkedNode) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
