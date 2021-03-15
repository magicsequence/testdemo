package algorithm;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class QuickSort {
     
	public static void main(String[] args) {

		//TreeSet<Object> objects = new TreeSet<>();
		int[] arr= {32,14,188,21,56,1145,63,5,84,48,99,133};

		/*
		int[] arr=new int[9];

		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		*/
		QuickSort qs=new QuickSort();
		long l=System.currentTimeMillis();
		qs.quickSort(arr, 0, arr.length-1);

		for (int i= 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.err.println(System.currentTimeMillis()-l);
		
	}
	
	public void quickSort(int[] a,int left,int right) {
		//如果左下标大于右下标直接返回，不对数组进行排序
		if(left>right)
			return;

		//把数组第一个数作为基准值
		int pivot=a[left];


		System.out.println(pivot+"++++++++++++");

		int i=left;
		int j=right;
		
		while(i<j) {
			while(pivot<=a[j]&&i<j)
				j--;
			while(pivot>=a[i]&&i<j)
				i++;
			if(i<j) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		
		a[left]=a[i];     //把临界线处的值放到最前面
		a[i]=pivot;  
	  //对左右两边的子数组进行递归排序
		System.out.println("左边排序前："+Arrays.toString(a));
		quickSort(a, left, i-1);
		System.out.println("左边排序后："+Arrays.toString(a));
		System.out.println("右边排序前："+Arrays.toString(a));
		quickSort(a, i+1, right);
		System.out.println("右边排序后："+Arrays.toString(a));
	}
}
