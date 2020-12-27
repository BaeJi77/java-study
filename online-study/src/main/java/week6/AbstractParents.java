package week6;

abstract public class AbstractParents {

    public AbstractParents() {
        System.out.println("부모 생성자 실행");
    }

    private void print() {
        System.out.println("부모 private method");
    }

    abstract public Long getMoney();
}
