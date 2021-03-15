package exercise;

import java.io.Serializable;
import java.math.BigInteger;

public class HouseInfo implements Comparable<HouseInfo>,Serializable{
    private String name;
    private String address;
    private String unitNo;
    private BigInteger price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", unitNo='" + unitNo + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(HouseInfo o) {
        return o.getPrice().compareTo(this.price);
    }
}
