package week6;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();

        AbstractParents abstractParents = new AbstractParents() {
            @Override
            public Long getMoney() {
                return 5L;
            }
        };
        AbstractChild abstractChild = new AbstractChild();
    }
}
