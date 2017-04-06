package com.bobomee.android.concurrent_programming.Chapter_1;

import net.jcip.annotations.NotThreadSafe;

/**
 * Project ID：400YF17051<br/>
 * Resume:
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/4/1 汪波 first commit
 */
@NotThreadSafe
public class UnSafeSequence {

  private int value;

  public int getNext(){
    return value++;
  }
}
