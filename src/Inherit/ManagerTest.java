package Inherit;

public class ManagerTest {
    /**
     *
     */
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(10000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Hike Hacker", 50000, 1991, 12, 23);
        staff[2] = new Employee("Tommy Tester", 20000, 1999, 1, 3);

        for (Employee e : staff) {
            System.out.println("name" + e.getName() + "salary=" + e.getSalary()) ;

        }

    }
}
