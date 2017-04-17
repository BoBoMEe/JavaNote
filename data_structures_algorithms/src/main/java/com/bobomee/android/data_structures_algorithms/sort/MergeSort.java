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
 * @author 汪波
 * @version 1.0
 *
 *          归并排序采用了“分而治之（divide and conquer）”的算法思路，
 *          将线性数据结构（如array、vector或list）分为两个部分，
 *          对两部分分别进行排序，排序完成后，再将各自排序好的两个部分合并还原成一个有序结构。
 *
 *          时间复杂度为O(nlogn)，
 *          如果是处理数组需要额外O（n）空间，
 *          处理链表只需要O（1）空间。
 */
public class MergeSort {
  /**
   * 对输入的整型数组进行归并排序
   *
   * @param arr 待排序的整型数组
   */
  public static void mergeSort(int[] arr, int left, int right) {

    // 取得待排序数组中间位置的下标，右移一位
    int mid = (left + right) >> 1;

    if (left < right) {
      // 将左边的数组递归排序
      mergeSort(arr, left, mid);
      // 将右边的数组递归排序
      mergeSort(arr, mid + 1, right);
      // 合并已经排好序的数组
      merge(arr, left, mid, right);
    }
  }

  /**
   * 合并已经排好序的数组
   *
   * @param arr 待排序数组
   * @param left 待排序数组起始下标
   * @param mid 待排序数组中间位置下标
   * @param right 待排序数组末尾下标
   */
  private static void merge(int[] arr, int left, int mid, int right) {
    // 创建临时数组
    int[] temp = new int[right - left + 1];
    // 左边数组下标指针
    int l = left;
    // 右边数组下标指针
    int r = mid + 1;
    // 临时数组下标指针
    int index = 0;

    // 在左右两边的数组中选取较小的数，放入临时数组中，直到选完至少一个数组中的元素
    while (l <= mid && r <= right) {
      if (arr[l] < arr[r]) {
        temp[index++] = arr[l++];
      } else {
        temp[index++] = arr[r++];
      }
    }

    // 把左边数组剩余的元素复制到临时数组中
    while (l <= mid) {
      temp[index++] = arr[l++];
    }

    // 把右边数组剩余的元素复制到临时数组中
    while (r <= right) {
      temp[index++] = arr[r++];
    }

    // 将临时数组中的元素复制到原来的数组中
    for (int i = 0; i < temp.length; i++) {
      arr[i + left] = temp[i];
    }
  }
}
