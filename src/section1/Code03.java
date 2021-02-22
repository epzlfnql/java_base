package section1;

import java.util.Scanner;

public class Code03 {

    public static void main(String[] args) {
        String str = "Hello";
        String input = null; // Null로 초기화

        Scanner kb = new Scanner(System.in);

        System.out.print("Please type a string: ");
        input  = kb.next(); //문자열을 받음.

        if(str.equals(input)){
            System.out.println("Strings match! :~");
        }else{
            System.out.println("Strings do not match! :-(");
        }

        kb.close();
    }
}
