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
 * Resume: 插入排序
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/4/5 汪波 first commit
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
