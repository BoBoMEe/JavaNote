package com.bobomee.android.data_structures_algorithms.sort.bucket;

/**
 * Project ID：400YF17051<br/>
 * Resume:
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/7/24 汪波 first commit
 */
public class BucketSort {

  /*
   * 桶排序
	 *
	 * 参数说明：
	 *     a -- 待排序数组
	 *     max -- 数组a中最大值的范围
	 */
  public static void bucketSort(int[] a, int max) {
    if (a == null || max < 1) return;

    // 创建一个容量为max的数组buckets，并且将buckets中的所有数据都初始化为0。
    int[] buckets = new int[max];

    // 1. 计数
    for (int anA : a) buckets[anA]++;

    // 2. 排序
    for (int i = 0, j = 0; i < max; i++) {
      while ((buckets[i]--) > 0) {
        a[j++] = i;
      }
    }
  }

  public static void main(String[] args) {
    int i;
    int a[] = { 8, 2, 3, 4, 3, 6, 6, 3, 9 };

    System.out.printf("before sort:");
    for (i = 0; i < a.length; i++)
      System.out.printf("%d ", a[i]);
    System.out.printf("\n");

    bucketSort(a, 10); // 桶排序

    System.out.printf("after  sort:");
    for (i = 0; i < a.length; i++)
      System.out.printf("%d ", a[i]);
    System.out.printf("\n");
  }
}
