package testmodel;

import exercise.HouseInfo;

import java.math.BigInteger;
import java.util.*;

/**
 * 对list集合中的房屋信息，按照房屋价格进行排序
 */
public class TestHouseSortedByPprice {
    public static void main(String[] args) {
        //房屋实体
        HouseInfo house1 = new HouseInfo();
        List<HouseInfo> list=new ArrayList<>();

        house1.setName("dongshan");
        house1.setPrice(BigInteger.valueOf(12));

        HouseInfo house2 = new HouseInfo();
        house2.setName("jinmao");
        house2.setPrice(BigInteger.valueOf(130));

        HouseInfo house3 = new HouseInfo();
        house3.setName("newyork");
        house3.setPrice(BigInteger.valueOf(88));

        //System.out.println(house1+"*****"+house2+"******"+house3);
        list.add(house1);
        list.add(house2);
        list.add(house3);

        //升降序是可以改变的
        Collections.sort(list);
        System.out.println("用实现Comparable接口重写compareTo方法排序"+list.toString());

        //for (HouseInfo houseInfo : list) {
        //    System.out.println(houseInfo.toString());
        //}

        //没排序前的状态
        for (int i = 0; i < list.size(); i++) {
            HouseInfo houseInfo = list.get(i);
            //System.out.println(houseInfo.toString());
        }

        //默认升序，参数换个位置则为降序
        Collections.sort(list, new Comparator<HouseInfo>() {
            @Override
            public int compare(HouseInfo o1, HouseInfo o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        //System.out.println("排序后----------"+list.toString());




    }
}
