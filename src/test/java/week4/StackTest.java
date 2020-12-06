package week4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void stackTest() {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.pop()).isEqualTo(3);
        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    void stackTest2() {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.getSize()).isEqualTo(3);
        stack.pop();
        assertThat(stack.getSize()).isEqualTo(2);
        stack.pop();
        assertThat(stack.getSize()).isEqualTo(1);
        stack.pop();
        assertThat(stack.getSize()).isEqualTo(0);
    }

    @Test
    void stackTest3() {
        Stack stack = new Stack();

        assertThrows(DataStructureException.class, stack::pop);
    }

}
