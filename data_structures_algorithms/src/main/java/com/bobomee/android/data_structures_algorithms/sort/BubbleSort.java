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

/**
 * Project ID：400YF17051<br/>
 * Resume: 冒泡排序
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/4/5 汪波 first commit
 */
public class BubbleSort {
  /**
   * 对输入的整型数组进行冒泡排序
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
}
