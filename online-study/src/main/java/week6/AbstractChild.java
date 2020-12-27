package week6;

public class AbstractChild extends AbstractParents {

    public AbstractChild() {
        super();
        System.out.println("자식 생성자 실행");
    }

    @Override
    public Long getMoney() {
        return 1L;
    }

    

//    public void print(int number) {
//        System.out.println(number);
//    }
//
//    public int print(int number) {
//        System.out.println(number);
//        return number;
//    }

    public void callParentPrivateMethod() {
        // 안됩니다. 에러 메시지가 나옵니다.
        // java: print() has private access in week6.Parents
         // super.print();
    }
}
