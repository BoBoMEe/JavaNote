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

/**
 * Project ID：400YF17051
 * Resume:     差值查找<br/>
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/3/20.汪波.
 */
public class InterpolateSearcher {

  public static int search(int[] array, int key) {
    int low, high, mid;
    low = 0; // 定义最低下标为array首位
    high = array.length - 1; // 定义最高下标为array末位
    while (low <= high) {
      // 相比二分法查找的更改处
      mid = low + (int) (1.0 * (key - array[low]) / (array[high] - array[low]) * (high - low));
      if (array[mid] > key) {
        // 中值比key大,则high=mid-1
        high = mid - 1;
      } else if (array[mid] < key) {
        // 中值比key小,则low=mid+1
        low = mid + 1;
      } else {
        // 相等说明mid即为key在array中所在位置
        return mid;
      }
    }
    return -1;
  }
}
