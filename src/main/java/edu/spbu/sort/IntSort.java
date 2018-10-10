package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
  public static void sort (int array[]) {

    int i, c, r=1;
    while (r!=0){
      r=0;
      for (i=0; i<array.length-1; i++)
        if (array[i]>array[i+1]){
          c=array[i];
          array[i]=array[i+1];
          array[i+1]=c;
          r++;
        }

    }
  }

  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
