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

package com.bobomee.android.data_structures_algorithms.sort.insert;

/**
 * Resume: 插入排序
 * 时间复杂度仍然为 O(N²)
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/4/5 汪波 first commit
 *
 * 大多数情况下，插入排序比冒泡排序，选择排序要好的多
 * 虽然插入排序仍然需要O(N²)的时间
 *
 * 1. 一般的情况下，它要比冒泡排序快一倍，比选择和冒泡要更快一些
 * 2. 经常被用在教复杂的排序算法的最后阶段，例如快速排序
 * 3. 对于基本有序的文件进行排序，只需要O（N）的时间
 * 4. 对于逆序排列的数据，插入排序 并不比冒泡排序快。
 */
public class InsertionSort {

  /**
   * 对输入的整型数组进行插入排序
   *
   * @param arr
   *            待排序的整型数组
   */
  public static void insertSort(int[] arr) {
    // 认为第一个元素已经有序，从第二个元素开始取值插入已经有序的部分
    for (int i = 1; i < arr.length; i++) {
      // 待插入的元素
      int key = arr[i];
      // 待插入的位置下标
      int index = i;
      // 从后向前遍历数组已经有序的部分，寻找合适的插入位置
      for (int j = i - 1; j >= 0; j--) {
        // 如果待插入的元素较小，则将较大的元素依次向后移动，空出合适的插入位置
        if (arr[j] > key) {
          // 因为arr[j+1]=arr[i]=key，该元素已经临时存储在了key中，所以不会出现数据丢失
          arr[j + 1] = arr[j];
          // 记录下该位置的下标
          index = j;
        } else {
          // 找到了合适的插入位置，则退出这个循环，开始取下一个元素，直到取完所有元素
          break;
        }
      }
      // 将该元素插入到合适的位置
      arr[index] = key;
    }
  }

}
