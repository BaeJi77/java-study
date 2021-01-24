package week10;

public class RunnableExample3 {

    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getId())).start();
    }
}
