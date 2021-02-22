package section1;

public class Code01 {

    static int num; //전역변수

    public static void main(String[] args) {
        int anotherNum = 5; //지역변수

        num=2;

        System.out.println(num + anotherNum);
        System.out.println("Num: "+num);
        System.out.println("AnotherNum: "+ anotherNum);
        System.out.println("Sum: " + num + anotherNum); //left associativity  같은 연산이 두개 나오면 왼쪽 연산에 따라간다.



    }
}
