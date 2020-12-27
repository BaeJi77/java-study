package week6;

public class Parents {

    public Parents() {
        System.out.println("부모 생성자 실행");
    }

    private void print() {
        System.out.println("부모 private method");
    }

    public Long getMoney() {
        return 10L;
    }
}
