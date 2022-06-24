package CopyDemo;


/*
浅拷贝是一种对象拷贝
创建一个新对象，然后将当前对象的非静态字段复制到该新对象，
如果字段是值类型的，那么对该字段执行复制；
如果该字段是引用类型的话，则复制引用但不复制引用的对象。
因此，原始对象及其副本引用同一个对象。
* */
public class ShallowCopyApplication  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("zhangsan",21);
        p1.setAddress("湖北省", "武汉市");
        Person p2 = (Person) p1.clone();
        System.out.println("p1:"+p1);
        System.out.println("p1.getPname:"+p1.getPname().hashCode());

        System.out.println("p2:"+p2);
        System.out.println("p2.getPname:"+p2.getPname().hashCode());

        p1.display("p1");
        p2.display("p2");
        p2.setPname("Lisi");
        p2.setAddress("湖北省", "荆州市");
        System.out.println("将复制之后的对象地址修改：");
        p1.display("p1");
        p2.display("p2");
    }
}
