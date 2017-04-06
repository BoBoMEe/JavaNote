package com.bobomee.android.concurrent_programming.Chapter_1;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Project ID：400YF17051<br/>
 * Resume:
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/4/1 汪波 first commit
 */
@ThreadSafe
public class SafeSequence {

  @GuardedBy("this") private int value;

  public synchronized int getNext(){
    return value++;
  }
}
