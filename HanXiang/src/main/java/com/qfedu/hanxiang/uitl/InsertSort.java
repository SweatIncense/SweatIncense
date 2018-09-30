package com.qfedu.hanxiang.uitl;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @算法排序
 */
public class InsertSort {

    //插入排序：把新的数据插入到已经排好的数据列中。将第一个数和第二个数排序，
    // 然后构成一个有序序列将第三个数插入进去，构成一个新的有序序列。
    // 对第四个数、第五个数……直到最后一个数，重复第二步。
    public  void insertSort(int[] a ){
        int length = a.length;//单独把数组长度取出，提高效率 a为有序

        int insertNum;//要插入的数据

        for(int i =1;i<length;i++){
            insertNum = a[i];
            int j = i -1;
            while(j >= 0 && a[j] > insertNum){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }


}
