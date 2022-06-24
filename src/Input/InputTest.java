package Input;

import java.io.Console;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //get first input
        System.out.println("what's your name?");
        String name = in.nextLine();

        //get second input
        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("name:" + name + " age:" + age);

//        Scanner 类的输入是可见的，不适合输入密码
//        可以使用Console类来进行输密码
        //此时需要在控制台编译运行，否则会返回null值报错
        Console cons = System.console();
        String userName = cons.readLine("User name:");
        char[] password = cons.readPassword("Password:");
    }
}
