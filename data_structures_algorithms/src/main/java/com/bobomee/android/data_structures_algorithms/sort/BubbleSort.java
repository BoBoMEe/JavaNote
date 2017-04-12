/*
 *  Copyright (C) 2017.  BoBoMEe(wbwjx115@gmail.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.bobomee.android.data_structures_algorithms.sort;

import com.bobomee.android.data_structures_algorithms.Utils;

/**
 * 冒泡排序时间复杂度O(n2)
 *
 * @author BoBoMEe
 * @since 2017/4/5
 *
 * 1. 比较两个数字
 * 2. 如果左边的数字大，则交换两个数字的位置
 * 3. 向右移动一个位置，比较下两个数字
 *
 * 无论何时，只要看到循环嵌套在另一个循环里，就可以怀疑这个算法的运行时间为O(N²)级，
 *
 */
public class BubbleSort {
  /**
   * 简版冒泡排序
   *
   * @param arr 要排序的整型数组
   */
  public static void bubbleSort(int[] arr) {
    // 最多做n-1趟排序，第k趟排序后，最后k个元素是有序的
    for (int i = 0; i < arr.length - 1; i++) {
      // 每一趟排序需要比较n-i-1次
      // 对当前无序区间arr[0......length-i-1]进行排序(j的范围是在逐步缩小的)
      for (int j = 0; j < arr.length - i - 1; j++) {
        // 将较大的元素移动到后面
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  /**
   * 优化的冒泡排序
   */
  public static void bubbleSort_(int[] arr) {
    boolean swap = false;
    for (int i = 0; i < arr.length - 1; i++) { //最多进行 n-1 趟
      swap = false;
      for (int j = arr.length - 1; j > i; j--) { //从下往上扫描
        if (arr[j] < arr[j - 1]) {
          Utils.swap(arr, j, j - 1);
          swap = true;
        }
      }
      if (!swap) {
        break; // 未发生交换，终止算法
      }
    }
  }
}
