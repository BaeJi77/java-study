package week10;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }

    @Override
    public void interrupt() {
        // 내가 원하는거 할 수 있다!!!
        super.interrupt();
    }
}
