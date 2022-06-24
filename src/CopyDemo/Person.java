package CopyDemo;

public class Person implements Cloneable{
    public String pname;
    public int page;
    public Address address;
    public Person() {}

    public Person(String pname,int page){
        this.pname = pname;
        this.page = page;
        this.address = new Address();
    }
    //注意：调用对象的clone方法，必须要让类实现 Cloneable 接口，并且重写 clone 方法。
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setAddress(String provices,String city ){
        address.setAddress(provices, city);
    }
    public void display(String name){
        System.out.println(name+":"+"pname=" + pname + ", page=" + page +","+ address);
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

}
