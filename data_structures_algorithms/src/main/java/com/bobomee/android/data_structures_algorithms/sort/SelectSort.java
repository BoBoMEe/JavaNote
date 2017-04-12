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
 * @author BoBoMEe
 * @since 2017/4/12
 *
 *
 * 选择排序
 *
 * 改进了冒泡排序，将必要的交换次数从O(N²)减少到O(N)
 *
 * 每次选择剩余元素中最小的，和已排序的数组的后面一个元素交换。
 *
 *
 *
 */
public class SelectSort {
  public static int[] selection(int[] a) {
    int i, j, min, v;
    int n = a.length;
    for (i = 0; i < n; i++) {
      //每次将未排序部分的首元素下标赋值给下标min
      min = i;
      //得到未排序部分的最小值的下标并赋值给min
      for (j = i+1; j < n; j++) {
        if (a[j] < a[min]) {
          min = j;
        }
      }
      v = a[i];
      a[i] = a[min];
      a[min] = v;
    }
    return a;
  }
}
