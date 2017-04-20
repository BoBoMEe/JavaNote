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

package com.bobomee.android.data_structures_algorithms.find;

/**
 * @author bobomee
 * @since 2017/4/10
 * 顺序查找
 */
public class OrderFind {
  /**
   * 平均时间复杂度 O（n）
   *
   * @param searchKey 要查找的值
   * @param array 数组（从这个数组中查找）
   * @return 查找结果（数组的下标位置）
   */
  public static int orderSearch(int searchKey, int[] array) {
    if (array == null || array.length < 1) return -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == searchKey) {
        return i;
      }
    }
    return -1;
  }
}
