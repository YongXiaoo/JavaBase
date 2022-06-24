package Inherit;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        //必须调用父类的构造器 super()为简写方式
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getSalary() {
        //super关键字调用父类方法,子类无法直接访问父类的私有域
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
