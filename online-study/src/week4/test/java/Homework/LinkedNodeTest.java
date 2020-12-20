package Homework;

import StudyCode.LinkedNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedNodeTest {

    @Test
    @DisplayName("Add logic test")
    void testAboutAdd() {
        LinkedNode head = new LinkedNode(1);
        LinkedNode linkedNode2 = new LinkedNode(2);
        LinkedNode linkedNode3 = new LinkedNode(3);

        LinkedNode.add(head, linkedNode2, 0);
        LinkedNode.add(linkedNode2, linkedNode3, 0);

        assertThat(LinkedNode.getLinkedNodeByPosition(head, 0).getValue()).isEqualTo(1);
        assertThat(LinkedNode.getLinkedNodeByPosition(head, 1).getValue()).isEqualTo(2);
        assertThat(LinkedNode.getLinkedNodeByPosition(head, 2).getValue()).isEqualTo(3);
    }

    @Test
    @DisplayName("Remove logic test")
    void testRemove() {
        LinkedNode head = new LinkedNode(1);
        LinkedNode linkedNode2 = new LinkedNode(2);
        LinkedNode linkedNode3 = new LinkedNode(3);

        LinkedNode.add(head, linkedNode2, 0);
        LinkedNode.add(linkedNode2, linkedNode3, 0);

        assertThat(LinkedNode.remove(head, 0).getValue()).isEqualTo(1);
        assertThat(LinkedNode.remove(linkedNode2, 0).getValue()).isEqualTo(2);
        assertThat(LinkedNode.remove(linkedNode3, 0).getValue()).isEqualTo(3);
    }

    @Test
    @DisplayName("Remove logic test_2")
    void testRemove2() {
        LinkedNode head = new LinkedNode(1);
        LinkedNode linkedNode2 = new LinkedNode(2);
        LinkedNode linkedNode3 = new LinkedNode(3);

        LinkedNode.add(head, linkedNode2, 0);
        LinkedNode.add(linkedNode2, linkedNode3, 0);

        assertThat(LinkedNode.remove(head, 2).getValue()).isEqualTo(3);
        assertThat(LinkedNode.remove(head, 1).getValue()).isEqualTo(2);
        assertThat(LinkedNode.remove(head, 0).getValue()).isEqualTo(1);
    }


    @Test
    @DisplayName("contains logic test")
    void testContainMethod() {
        LinkedNode head = new LinkedNode(1);
        LinkedNode linkedNode2 = new LinkedNode(2);
        LinkedNode linkedNode3 = new LinkedNode(3);

        LinkedNode.add(head, linkedNode2, 0);
        LinkedNode.add(linkedNode2, linkedNode3, 0);

        assertThat(LinkedNode.contains(head, new LinkedNode(2))).isTrue();
        assertThat(LinkedNode.contains(head, new LinkedNode(3))).isTrue();
    }

}
