package exercise;

public class SortUtill {

    public static void bubbleSort(int[] array){
        int tmp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j+1]>array[j]){
                    tmp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static boolean have29dayInFebruary(int year){
        if((year%4==0&&year%100!=0)||year%400==0){
            return true;
        }
        return false;
    }

}
