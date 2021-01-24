package week10;

public class RunnableExample2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
            }
        });

        thread.start();
    }
}
