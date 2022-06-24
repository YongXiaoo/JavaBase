package OptionalTest;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Address address1 = new Address("合肥");
        String s = Optional.ofNullable(address1).map(Address::getProvices).orElseGet(() -> "it's value");
        System.out.println("结果为：" +s);

    }
}
