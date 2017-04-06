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

import java.util.Comparator;

/**
 * Project ID：400YF17051
 * Resume:     二分查找<br/>
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/3/20.汪波.
 */
public class BinarySearch {

  /**
   * 折半查找（二分法）
   *
   * @param array 数组
   * @param key 需要找的元素
   * @return 数组中没有查找的元素 返回 -1 否则返回元素位置
   */
  public static <T extends Comparable<T>> int search(T[] array, T key) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      // 溢出 - 超出了int类型的表示范围
      // int mid = (start + end) / 2;//有溢出的风险
      // int mid = (end - start) / 2 + start;
      int mid = (start + end) >>> 1;
      if (array[mid].equals(key)) {
        return mid;
      } else if (array[mid].compareTo(key) > 0) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  /**
   * T类型不支持比较 可以传一个比较器
   */
  public static <T> int search(T[] array, T key, Comparator<T> comp) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int mid = (start + end) >>> 1;
      if (array[mid].equals(key)) {
        return mid;
      } else if (comp.compare(array[mid], key) > 0) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}
