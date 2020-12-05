package week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week4.LinkedList.Node;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTest {

    LinkedList linkedList = new LinkedList();

    @BeforeEach
    public void init() {
        linkedList.deleteAll();
    }

    @Test
    @DisplayName("입력 후 값 출력")
    void test1() {
        linkedList.insert(new Node(1));
        linkedList.insert(new Node(2));
        linkedList.insert(new Node(3));

        assertThat(linkedList.getFront().getValue()).isEqualTo(3);
        linkedList.deleteFront();
        assertThat(linkedList.getFront().getValue()).isEqualTo(2);
        linkedList.deleteFront();
        assertThat(linkedList.getFront().getValue()).isEqualTo(1);
        linkedList.deleteFront();
    }

    @Test
    @DisplayName("값 삽입과 삭제 후 사이즈 비교")
    void test2() {
        linkedList.insert(new Node(1));
        linkedList.insert(new Node(2));
        linkedList.insert(new Node(3));

        assertThat(linkedList.getSize()).isEqualTo(3);
        linkedList.deleteFront();
        assertThat(linkedList.getSize()).isEqualTo(2);
        linkedList.deleteFront();
        assertThat(linkedList.getSize()).isEqualTo(1);
        linkedList.deleteFront();
        assertThat(linkedList.getSize()).isEqualTo(0);
    }

    @Test
    @DisplayName("비어있을 때 삭제한 경우 exception 발생")
    void test3() {
        linkedList.insert(new Node(1));

        linkedList.deleteFront();
        assertThrows(DataStructureEmptyException.class, () -> {
            linkedList.deleteFront();
        });
    }

}
