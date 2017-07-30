package com.bobomee.android.java_note;

/**
 * @author BoBoMEe
 * @since 2017/7/22
 */
public class Plate<T>{
  private T item;
  public Plate(T t){item=t;}
  public void set(T t){item=t;}
  public T get(){return item;}
}