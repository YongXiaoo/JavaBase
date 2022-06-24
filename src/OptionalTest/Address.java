package OptionalTest;

import javax.annotation.PostConstruct;

public class Address {
    private String provices;
    private String city;
    public void setAddress(String provices,String city){
        this.provices = provices;
        this.city = city;
    }

    public Address(String provices, String city) {
        this.provices = provices;
        this.city = city;
    }

    public Address(String city) {
        this.city = city;
    }

    public String getProvices() {
        return provices;
    }

    public void setProvices(String provices) {
        this.provices = provices;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [provices=" + provices + ", city=" + city + "]";
    }

    @PostConstruct
    private void init() {
        this.provices ="安徽";
    }
}
