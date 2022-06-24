package CopyDemo;

public class CopyApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("zhangsan",21);
        p1.setAddress("湖北省", "武汉市");

        //引用拷贝  p1 p2指向的是同一个内存地址 460141958
        Person p2 = p1;
        System.out.println("p1指向的内存地址:"+System.identityHashCode(p1));
        System.out.println("p2指向的内存地址:"+System.identityHashCode(p2));


        //对象拷贝  p3是p1的一个副本，指向了不同的内存地址
        Person p3 = (Person) p1.clone();
        System.out.println("p1指向的内存地址:"+System.identityHashCode(p1));
        System.out.println("p2指向的内存地址:"+System.identityHashCode(p3));

        /*浅拷贝深拷贝都是对象拷贝

         */
//
//        p1.display("p1");
//        p2.display("p2");
//        p2.setAddress("湖北省", "荆州市");
//        System.out.println("将复制之后的对象地址修改：");
//        p1.display("p1");
//        p2.display("p2");

    }
}
