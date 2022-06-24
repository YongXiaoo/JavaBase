package TypeChange;

public class TypeChange {
    public static void main(String[] args) {
        int x = 3;
        //  ====> x = (int)(x + 3.5) 此时会发生强制转换
        x += 3.5;
        System.out.println(x);
    }
}
