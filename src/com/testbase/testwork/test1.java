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
		System.out.println("ƽ������ʱ�䣺" );
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
		System.out.println( "ð��������ʱ��"+ sum[0]/20 + "ms");
		System.out.println( "ѡ��������ʱ��"+ sum[1]/20 + "ms");
		System.out.println( "����������ʱ��"+ sum[2]/20 + "ms");
		System.out.println( "ϣ��������ʱ��"+ sum[3]/20 + "ms");
		System.out.println( "����������ʱ��"+ sum[4]/20 + "ms");
		System.out.println( "�ϲ�������ʱ��"+ sum[5]/20 + "ms");
		System.out.println( "��������ʱ��"+ sum[6]/20 + "ms");
}	
	/**
	 * ���������
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
	 * ð������
	 * @param arrayList
	 */
	public static void bubbleSort(ArrayList<Double> arrayList) {
	    double temp;//����һ����ʱ����
	    for(int i=0;i<arrayList.size()-1;i++){//ð������
	        for(int j=0;j<arrayList.size()-i-1;j++){
	            //���˳�򲻶ԣ��򽻻�����Ԫ��
	            if(arrayList.get(j+1)<arrayList.get(j)){
	                Collections.swap(arrayList, j, j+1);
	            }
	        }
	    }
	}
	/**
	 * ѡ������
	 * @param R
	 */
	public static void SelectSort(Double R[])
	{
	int i,j,k;
	Double temp;
	  for(i=0;i<COUNT;++i)
	  {
	    k=i;
	    for(j=i+1;j<COUNT;++j) //��i�������������ѡһ����С�Ĺؼ���
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
	 * ��������
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
     * ϣ������
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
	 * ��������
	 */


	private static void QuickSort(Double[] num, int left, int right) {
		//���left����right��������ֻ��һ��Ԫ�أ�ֱ�ӷ���
		if(left>=right) {
			return;
		}
		//��������ߵ�Ԫ��Ϊ��׼ֵ
		Double key=num[left];
		//�����б�keyС�ķ�����ߣ���key��ķ����ұߣ�keyֵ�±�Ϊi
		int i=left;
		int j=right;
		while(i<j){
			//j�����ƣ�ֱ��������keyС��ֵ
			while(num[j]>=key && i<j){
				j--;
			}
			//i�����ƣ�ֱ��������key���ֵ
			while(num[i]<=key && i<j){
				i++;
			}
			//i��jָ���Ԫ�ؽ���
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
	  * �ϲ�����
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
	        //���ҹ鲢
	        merge(a,low,mid,high);
	    }
	    return a;
	}
	 
	private static void merge(Double[] a, int low, int mid, int high) {
	    Double[] temp = new Double[high-low+1];
	    int i= low;
	    int j = mid+1;
	    int k=0;
	    // �ѽ�С�������Ƶ���������
	    while(i<=mid && j<=high){
	        if(a[i]<a[j]){
	            temp[k++] = a[i++];
	        }else{
	            temp[k++] = a[j++];
	        }
	    }
	    // �����ʣ������������� 
	    while(i<=mid){
	        temp[k++] = a[i++];
	    }
	    // ���ұ߱�ʣ�������������
	    while(j<=high){
	        temp[k++] = a[j++];
	    }
	    // ���������е�������nums����
	    for(int x=0;x<temp.length;x++){
	        a[x+low] = temp[x];
	    }
	}
	/**
	 * ������
	 */
	  public static void headSort(Double[] list) {
	        //�����ʼ��,�ӵ�һ����Ҷ�ӽڵ㿪ʼ����,���Һ��ӽڵ��нϴ�Ľ��������ڵ���
	        for (int i = (list.length) / 2 - 1; i >= 0; i--) {
	            headAdjust(list, list.length, i);
	        }
	        //���򣬽����Ľڵ���ڶ�β��Ȼ��Ӹ��ڵ����µ���
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
	 * ������arrayListת���ɶ�������Double
	 * @param arrayList
	 * @return
	 */
	public static Double[] MakeDouble(ArrayList<Double> arrayList){
		int size = arrayList.size();    //��̬����a�ĳ���
		Double[] d1 = (Double[])arrayList.toArray(new Double[size]);   //����̬����aת����Double����
		return d1;
	}
	
}




