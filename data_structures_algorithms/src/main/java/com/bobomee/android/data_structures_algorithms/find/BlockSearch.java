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

import static java.util.Arrays.binarySearch;

/**
 * @author BoBoMEe
 * @since 2017/4/10
 */
public class BlockSearch {
  /**
   * 分块查找
   *
   * @param index
   *            索引表，其中放的是各块的最大值
   * @param st
   *            顺序表，
   * @param key
   *            要查找的值
   * @param m
   *            顺序表中各块的长度相等，为m
   * @return
   */
  public static int blockSearch(int[] index, int[] st, int key, int m) {
    // 在序列st数组中，用分块查找方法查找关键字为key的记录
    // 1.在index[ ] 中折半查找，确定要查找的key属于哪个块中
    int i = binarySearch(index, key);
    if (i >= 0) {
      int j = i > 0 ? i * m : i;
      int len = (i + 1) * m;
      // 在确定的块中用顺序查找方法查找key
      for (int k = j; k < len; k++) {
        if (key == st[k]) {
          System.out.println("查询成功");
          return k;
        }
      }
    }
    System.out.println("查找失败");
    return -1;
  }
}
