package Homework;

import StudyCode.DataStructureException;
import StudyCode.QueueByArray;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QueueByArrayTest {
    @Test
    void queueByArrayTest1() {
        QueueByArray queueByArray = new QueueByArray();

        queueByArray.push(1);
        queueByArray.push(2);
        queueByArray.push(3);

        assertThat(queueByArray.pop()).isEqualTo(1);
        assertThat(queueByArray.pop()).isEqualTo(2);
        assertThat(queueByArray.pop()).isEqualTo(3);
    }

    @Test
    void queueByArrayTest2() {
        QueueByArray queueByArray = new QueueByArray();

        assertThrows(DataStructureException.class, queueByArray::pop);
    }
}
