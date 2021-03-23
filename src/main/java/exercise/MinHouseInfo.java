package exercise;

import java.math.BigInteger;

public class MinHouseInfo extends SmallHouseInfo{
    private String houseWife;

    public String getHouseWife() {
        return houseWife;
    }

    public void setHouseWife(String houseWife) {
        this.houseWife = houseWife;
    }

    public static void main(String[] args) {
        HouseInfo host=new MinHouseInfo();
        host.setPrice(BigInteger.valueOf(123123));
        //B extends A,  C extends B ,   C c=(C)b;  if( B b =new C();)
        MinHouseInfo minHouseInfo=(MinHouseInfo)host;
        System.out.println(minHouseInfo.getPrice());
    }
}
