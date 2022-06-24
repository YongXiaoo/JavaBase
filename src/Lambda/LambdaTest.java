package Lambda;

import java.util.ArrayList;

public class LambdaTest {
    public static void main(String[] args) {

//        Thread thread = new Thread(new MyRunnable());
//        thread.start();

//        new Thread(new Runnable() {
//            //这里的new Runnable()，这里new 了接口，在这个new的接口里面，我们写了这个接口的实现类。
//            //这里可以看出，我们把一个重写的run()方法传入了一个构造函数中。
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        }).start();
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        });
//        thread.start();
        new Thread(() -> System.out.println("Hello")).start();

        ArrayList<String> list = new ArrayList<>();
        list.add("AAAAA");
        list.add("BBBBB");
        list.add("CCCCC");
        list.add("DDDDD");
        //形参的类型是确定的，可省略；只有一个形参，()可以省略；
        list.forEach(t -> System.out.print(t + "\t"));
         //或者更简洁的方法引用：list.forEach(System.out::println);
        //打印结果：AAAAA	BBBBB	CCCCC	DDDDD
    }
}
