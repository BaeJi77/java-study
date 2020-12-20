import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class RandomStudyTest {

    @Test
    void randomTest() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = Math.abs(random.nextInt()) % 100;
            assertThat(0 <= randomNumber && randomNumber < 100).isTrue();
        }

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100);
            assertThat(0 <= randomNumber && randomNumber < 100).isTrue();
        }
    }

    @Test
    void threadLocalRandomTest() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++) {
            int randomNumber = Math.abs(threadLocalRandom.nextInt()) % 100;
            assertThat(0 <= randomNumber && randomNumber < 100).isTrue();
        }

        for (int i = 0; i < 100; i++) {
            int randomNumber = threadLocalRandom.nextInt(100);
            assertThat(0 <= randomNumber && randomNumber < 100).isTrue();
        }
    }
}
