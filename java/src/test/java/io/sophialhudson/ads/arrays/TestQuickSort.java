package io.sophialhudson.ads.arrays;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestQuickSort {

  @Ignore
  public void testByte() {

  }

  @Ignore
  public void testShort() {

  }

  @Test
  public void testInt() {

    int[] nullArray = null;
    int[] nullArrayExpected = null;
    boolean throwsNullPointerException = false;
    try {
      QuickSort.sort(nullArray);
    } catch (NullPointerException ex) {
      throwsNullPointerException = true;
    }
    assertTrue("Failed to still be null if argument array is null", throwsNullPointerException);

    int[] emptyArray = new int[0];
    int[] emptyArrayExpected = new int[0];
    QuickSort.sort(emptyArray);
    assertArrayEquals("Failed to still be empty if argument array is empty", emptyArrayExpected, emptyArray);

    int[] singletonArray = new int[]{1};
    int[] singletonArrayExpected = new int[]{1};
    QuickSort.sort(singletonArray);
    assertArrayEquals("Failed to still be a singleton if argument array has length 1", singletonArrayExpected, singletonArray);

    int[] tupleArraySorted = new int[]{1, 2};
    int[] tupleArraySortedExpected = new int[]{1, 2};
    QuickSort.sort(tupleArraySorted);
    assertArrayEquals("Failed to retain ordering of previously sorted array", tupleArraySortedExpected, tupleArraySorted);

    int[] tupleArrayUnsorted = new int[]{2, 1};
    int[] tupleArrayUnsortedExpected = new int[]{1, 2};
    QuickSort.sort(tupleArrayUnsorted);
    assertArrayEquals("Failed to reverse ordering of reverse-sorted array", tupleArrayUnsortedExpected, tupleArrayUnsorted);

    int[] tripleArraySorted = new int[]{1, 2, 3};
    int[] tripleArraySortedExpected = new int[]{1, 2, 3};
    QuickSort.sort(tripleArraySorted);
    assertArrayEquals("Failed to retain ordering of previously sorted array", tripleArraySortedExpected, tripleArraySorted);

    int[] tripleArrayUnsorted = new int[]{3, 2, 1};
    int[] tripleArrayUnsortedExpected = new int[]{1, 2, 3};
    QuickSort.sort(tripleArrayUnsorted);
    assertArrayEquals("Failed to reverse ordering of reverse-sorted array", tripleArrayUnsortedExpected, tripleArrayUnsorted);

    int[] randomizedArray = new int[]{1, 17, 33, 10, 0, -1, 5, 18, 21, 7, 3, 1, 8};
    int[] randomizedArrayExpected = new int[]{-1, 0, 1, 1, 3, 5, 7, 8, 10, 17, 18, 21, 33};
    QuickSort.sort(randomizedArray);
    assertArrayEquals("Failed to sort randomized array", randomizedArrayExpected, randomizedArray);

  }

  @Ignore
  public void testLong() {

  }

  @Ignore
  public void testFloat() {

  }

  @Ignore
  public void testDouble() {

  }

  @Ignore
  public void testBoolean() {

  }

  @Ignore
  public void testChar() {

  }

  @Ignore
  public void testComparable() {

  }

}
