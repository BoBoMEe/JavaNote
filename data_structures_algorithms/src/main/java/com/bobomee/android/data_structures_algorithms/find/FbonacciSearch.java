/*
 * Copyright (C) 2017.  BoBoMEe(wbwjx115@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.bobomee.android.data_structures_algorithms.find;

import java.util.Arrays;

/**
 * Project ID：400YF17051
 * Resume:     <br/>
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/3/21.汪波.
 */
public class FbonacciSearch {

  public static int fbSearch(int[] array, int a) {
    if (array == null || array.length == 0) {
      return -1;
    } else {
      int length = array.length;
      int[] fb = makeFbArray(20);// 制造一个长度为10的斐波数列
      int k = 0;
      while (length > fb[k] - 1) {// 找出数组的长度在斐波数列（减1）中的位置，将决定如何拆分
        k++;
      }
      int[] temp = Arrays.copyOf(array, fb[k] - 1);// 构造一个长度为fb[k] - 1的新数列
      for (int i = length; i < temp.length; i++) {
        if (i >= length) {
          temp[i] = array[length - 1];
        }
      }
      int low = 0;
      int hight = array.length - 1;
      while (low <= hight) {
        int middle = low + fb[k - 1] - 1;
        if (temp[middle] > a) {
          hight = middle - 1;
          k = k - 1;
        } else if (temp[middle] < a) {
          low = middle + 1;
          k = k - 2;
        } else {
          if (middle <= hight) {
            return middle;// 若相等则说明mid即为查找到的位置
          } else {
            return hight;// middle的值已经大于hight,进入扩展数组的填充部分,即最后一个数就是要查找的数。
          }
        }
      }
      return -1;
      // return recurse(array, fb, a, low, hight, k);
    }
  }

  /**
   * <p>
   * name: makeFbArray
   * </p>
   * <p>
   * description: 生成指定长度的斐波数列
   * </p>
   * <p>
   * return: int[]
   * </p>
   */
  public static int[] makeFbArray(int length) {
    int[] array = null;
    if (length > 2) {
      array = new int[length];
      array[0] = 1;
      array[1] = 1;
      for (int i = 2; i < length; i++) {
        array[i] = array[i - 1] + array[i - 2];
      }
    }
    return array;
  }

  /**
   * <p>
   * name: recurse
   * </p>
   * <p>
   * description: 递归实现，可以来代替while (low <= hight)遍历
   * </p>
   * <p>
   * return: int
   * </p>
   */
  public static int recurse(int[] array, int[] fb, int a, int low, int hight,
      int k) {
    if (array == null || array.length == 0 || a < array[low]
        || a > array[hight] || low > hight) {
      return -1;
    }
    int middle = low + fb[k - 1] - 1;
    if (a < array[middle]) {
      return recurse(array, fb, a, low, middle - 1, k - 1);
    } else if (a > array[middle]) {
      return recurse(array, fb, a, middle + 1, hight, k - 2);
    } else {
      if (middle <= hight) {
        return middle;
      } else {
        return hight;
      }
    }
  }
}
