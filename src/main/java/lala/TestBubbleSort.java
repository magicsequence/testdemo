package lala;

import exercise.SortUtill;

import java.util.Calendar;

public class TestBubbleSort {

    public static void main(String[] args) {
        //int[] test={23,5,888,9,0,12,111,3};
       // boolean b = SortUtill.have29dayInFebruary(2020);
       // System.out.println(b);

        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(2021,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
       // System.out.println(c.get(Calendar.DAY_OF_MONTH));


        SingleModeDoubleCheck instance = SingleModeDoubleCheck.getInstance();
        System.out.println(instance);

    }


}
