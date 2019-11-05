package com.testbase.testwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.Double;

public class test1 {
	public final static int COUNT = 20000;
	public static void main(String[] args) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		double[][] runTime = new double[7][20];
		System.out.println("平均运行时间：" );
		for (int i = 0; i < 20; i++) {
			arrayList = CreateArrayList();
			long startTime1 = System.currentTimeMillis();
			bubbleSort(arrayList);
			long endTime1 = System.currentTimeMillis();
			runTime[0][i] = endTime1 - startTime1;
			long startTime2 = System.currentTimeMillis();		
			SelectSort(MakeDouble(arrayList));
			long endTime2 = System.currentTimeMillis();
			runTime[1][i] = endTime2 - startTime2;			
			long startTime3 = System.currentTimeMillis();
			insertionSort(MakeDouble(arrayList));
			long endTime3 = System.currentTimeMillis();
			runTime[2][i] = endTime3 - startTime3;
			long startTime4 = System.currentTimeMillis();		
			sheelSort(MakeDouble(arrayList));
			long endTime4 = System.currentTimeMillis();
			runTime[3][i] = endTime4 - startTime4;
			long startTime5 = System.currentTimeMillis();		
			QuickSort(MakeDouble(arrayList), 0 ,COUNT-1);
			long endTime5 = System.currentTimeMillis();
			runTime[4][i] = endTime5 - startTime5;
			long startTime6 = System.currentTimeMillis();
			Double[] asDoubles= sort(MakeDouble(arrayList), 0, COUNT - 1);
			long endTime6 = System.currentTimeMillis();
			runTime[5][i] = endTime6 - startTime6;
			long startTime7 = System.currentTimeMillis();
			headSort(MakeDouble(arrayList));
			long endTime7 = System.currentTimeMillis();
			runTime[6][i] = endTime7 - startTime7;
		}

		double[] sum = {0,0,0,0,0,0,0};
		for (int i = 0; i < 20; i++) {
			sum[0] += runTime[0][i];
			sum[1] += runTime[1][i];
			sum[2] += runTime[2][i];
			sum[3] += runTime[3][i];
			sum[4] += runTime[4][i];
			sum[5] += runTime[5][i];
			sum[6] += runTime[6][i];
		}
		System.out.println( "冒泡排序用时："+ sum[0]/20 + "ms");
		System.out.println( "选择排序用时："+ sum[1]/20 + "ms");
		System.out.println( "插入排序用时："+ sum[2]/20 + "ms");
		System.out.println( "希尔排序用时："+ sum[3]/20 + "ms");
		System.out.println( "快速排序用时："+ sum[4]/20 + "ms");
		System.out.println( "合并排序用时："+ sum[5]/20 + "ms");
		System.out.println( "堆排序用时："+ sum[6]/20 + "ms");
}	
	/**
	 * 产生随机数
	 * @return
	 */
	public static ArrayList<Double> CreateArrayList(){
		ArrayList<Double> arrayList =new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < COUNT; i++) {
			arrayList.add(100*random.nextDouble());	
		}
		return arrayList;
	}
	/**
	 * 冒泡排序
	 * @param arrayList
	 */
	public static void bubbleSort(ArrayList<Double> arrayList) {
	    double temp;//定义一个临时变量
	    for(int i=0;i<arrayList.size()-1;i++){//冒泡趟数
	        for(int j=0;j<arrayList.size()-i-1;j++){
	            //如果顺序不对，则交换两个元素
	            if(arrayList.get(j+1)<arrayList.get(j)){
	                Collections.swap(arrayList, j, j+1);
	            }
	        }
	    }
	}
	/**
	 * 选择排序
	 * @param R
	 */
	public static void SelectSort(Double R[])
	{
	int i,j,k;
	Double temp;
	  for(i=0;i<COUNT;++i)
	  {
	    k=i;
	    for(j=i+1;j<COUNT;++j) //从i后面的序列中挑选一个最小的关键字
	    {
	       if(R[k]>R[j])
	       k=j;            
	       temp=R[i];
	       R[i]=R[k];
	       R[k]=temp;
	    }
	  }
	}
	/**
	 * 插入排序
	 * @author 87366
	 *
	 */
    public static void insertionSort(Double[] A) {
        int i, j;
        double temp;   
        for(i = 1; i < COUNT; i++){
            temp = A[i];
            for(j = i; j > 0 && A[j - 1] > temp; j-- ){
                A[j] = A[j - 1];
            }
            A[j] = temp;
        }
    }
    /**
     * 希尔排序
     */

	public static void sheelSort(Double[] data){
		int j = 0;
		double temp = 0;
		for (int increment = data.length / 2; increment > 0; increment /= 2){
			for (int i = increment; i < data.length; i++) {
				temp = data[i];
				for (j = i - increment; j >= 0; j -= increment) {
					if (temp < data[j]) {
						data[j + increment] =data[j];
						} 
					else break;					
				}
				data[j + increment] = temp;
			}
		}
	}
	/**
	 * 快速排序
	 */


	private static void QuickSort(Double[] num, int left, int right) {
		//如果left等于right，即数组只有一个元素，直接返回
		if(left>=right) {
			return;
		}
		//设置最左边的元素为基准值
		Double key=num[left];
		//数组中比key小的放在左边，比key大的放在右边，key值下标为i
		int i=left;
		int j=right;
		while(i<j){
			//j向左移，直到遇到比key小的值
			while(num[j]>=key && i<j){
				j--;
			}
			//i向右移，直到遇到比key大的值
			while(num[i]<=key && i<j){
				i++;
			}
			//i和j指向的元素交换
			if(i<j){
				Double temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		num[left]=num[i];
		num[i]=key;
		QuickSort(num,left,i-1);
		QuickSort(num,i+1,right);
	}

    /**
	  * 合并排序
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	public static Double[] sort(Double[] a,int low,int high){
	    int mid = (low+high)/2;
	    if(low<high){
	        sort(a,low,mid);
	        sort(a,mid+1,high);
	        //左右归并
	        merge(a,low,mid,high);
	    }
	    return a;
	}
	 
	private static void merge(Double[] a, int low, int mid, int high) {
	    Double[] temp = new Double[high-low+1];
	    int i= low;
	    int j = mid+1;
	    int k=0;
	    // 把较小的数先移到新数组中
	    while(i<=mid && j<=high){
	        if(a[i]<a[j]){
	            temp[k++] = a[i++];
	        }else{
	            temp[k++] = a[j++];
	        }
	    }
	    // 把左边剩余的数移入数组 
	    while(i<=mid){
	        temp[k++] = a[i++];
	    }
	    // 把右边边剩余的数移入数组
	    while(j<=high){
	        temp[k++] = a[j++];
	    }
	    // 把新数组中的数覆盖nums数组
	    for(int x=0;x<temp.length;x++){
	        a[x+low] = temp[x];
	    }
	}
	/**
	 * 堆排序
	 */
	  public static void headSort(Double[] list) {
	        //构造初始堆,从第一个非叶子节点开始调整,左右孩子节点中较大的交换到父节点中
	        for (int i = (list.length) / 2 - 1; i >= 0; i--) {
	            headAdjust(list, list.length, i);
	        }
	        //排序，将最大的节点放在堆尾，然后从根节点重新调整
	        for (int i = list.length - 1; i >= 1; i--) {
	            Double temp = list[0];
	            list[0] = list[i];
	            list[i] = temp;
	            headAdjust(list, i, 0);
	        }
	    }
	    
	    private static void headAdjust(Double[] list, int len, int i) {
	        int k = i, index = 2 * k + 1;
	        double temp = list[i];
	        while (index < len) {
	            if (index + 1 < len) {
	                if (list[index] < list[index + 1]) {
	                    index = index + 1;
	                }
	            }
	            if (list[index] > temp) {
	                list[k] = list[index];
	                k = index;
	                index = 2 * k + 1;
	            } else {
	                break;
	            }
	        }
	        list[k] = temp;
	    }
	/**
	 * 将集合arrayList转换成对象数组Double
	 * @param arrayList
	 * @return
	 */
	public static Double[] MakeDouble(ArrayList<Double> arrayList){
		int size = arrayList.size();    //动态数组a的长度
		Double[] d1 = (Double[])arrayList.toArray(new Double[size]);   //将动态数组a转换成Double数组
		return d1;
	}
	
}




