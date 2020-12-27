package week4.homework;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import week4.studyCode.DataStructureException;
import week4.studyCode.StackByLinkedList;

class StackByLinkedListTest {

    @Test
    void StackByLinkedListTest() {
        StackByLinkedList stackByLinkedList = new StackByLinkedList();

        stackByLinkedList.push(1);
        stackByLinkedList.push(2);
        stackByLinkedList.push(3);

        assertThat(stackByLinkedList.pop()).isEqualTo(3);
        assertThat(stackByLinkedList.pop()).isEqualTo(2);
        assertThat(stackByLinkedList.pop()).isEqualTo(1);
    }

    @Test
    void StackByLinkedListTest3() {
        StackByLinkedList stackByLinkedList = new StackByLinkedList();

        assertThrows(DataStructureException.class, stackByLinkedList::pop);
    }
}
