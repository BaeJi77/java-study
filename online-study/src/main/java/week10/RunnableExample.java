package week10;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}
