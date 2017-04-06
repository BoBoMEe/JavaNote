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
 * Resume:     顺序查找<br/>
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/3/21.汪波.
 */
public class SequenceSearch {

  //顺序查找
  public int find(int a[], int value, int n) {
    int i;
    for (i = 0; i < n; i++)
      if (a[i] == value) return i;
    return -1;
  }
}
