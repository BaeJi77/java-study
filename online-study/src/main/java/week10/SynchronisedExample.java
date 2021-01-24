package week10;

public class SynchronisedExample {

    public synchronized void printWithMethod() {
        System.out.println("hello world");
    }

    public void printWithBlock(Object commonVariable) {
        synchronized (commonVariable) {
            System.out.println("hello world");
        }
    }
}
