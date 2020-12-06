package week4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QueueByLinkedListTest {
    @Test
    void queueByArrayTest1() {
        QueueByLinkedList queueByLinkedList = new QueueByLinkedList();

        queueByLinkedList.push(1);
        queueByLinkedList.push(2);
        queueByLinkedList.push(3);

        assertThat(queueByLinkedList.pop()).isEqualTo(1);
        assertThat(queueByLinkedList.pop()).isEqualTo(2);
        assertThat(queueByLinkedList.pop()).isEqualTo(3);
    }

    @Test
    void queueByArrayTest2() {
        QueueByLinkedList queueByLinkedList = new QueueByLinkedList();

        assertThrows(DataStructureException.class, queueByLinkedList::pop);
    }
}
