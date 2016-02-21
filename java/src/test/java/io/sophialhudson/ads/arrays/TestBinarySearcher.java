package io.sophialhudson.ads.arrays;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBinarySearcher {

  @Ignore
  public void testByteArrayIndexOf() {

  }

  @Ignore
  public void testShortArrayIndexOf() {
     
  }

  @Test
  public void testIntArrayIndexOf() {
    
    int[] nullArray = null;
    boolean throwsNullPointerException = false;
    try {
      BinarySearcher.intArrayIndexOf(0, nullArray);
    } catch (NullPointerException ex) {
      throwsNullPointerException = true;
    }
    assertTrue("Failed to throw NullPointerException on null array", throwsNullPointerException);

    int[] emptyArray = new int[0];
    assertEquals("Failed to return -1 when given an empty array", -1, BinarySearcher.intArrayIndexOf(0, emptyArray));

    int[] singleValueArray = new int[]{0};
    assertEquals("Failed to return -1 when value is not found", -1, BinarySearcher.intArrayIndexOf(1, singleValueArray));
    assertEquals("Failed to return 0 when value is found", 0, BinarySearcher.intArrayIndexOf(0, singleValueArray));

    int[] twoValueArray = new int[]{1, 2};
    assertEquals("Failed to return -1 when value is not found", -1, BinarySearcher.intArrayIndexOf(3, twoValueArray));
    assertEquals("Failed to return 0 when value is found", 0, BinarySearcher.intArrayIndexOf(1, twoValueArray));
    assertEquals("Failed to return 1 when value is found", 1, BinarySearcher.intArrayIndexOf(2, twoValueArray));

    int[] threeValueHomogeneousArray = new int[]{1, 1, 1};
    assertEquals("Failed to return -1 when value is not found", -1, BinarySearcher.intArrayIndexOf(2, threeValueHomogeneousArray));
    assertEquals("Failed to return 0 when value is found", 0, BinarySearcher.intArrayIndexOf(1, threeValueHomogeneousArray));

    int[] threeValueAscendingArray = new int[]{1, 2, 3};
    assertEquals("Failed to return -1 when value is not found", -1, BinarySearcher.intArrayIndexOf(4, threeValueAscendingArray));
    assertEquals("Failed to return 0 when value is found", 0, BinarySearcher.intArrayIndexOf(1, threeValueAscendingArray));
    assertEquals("Failed to return 1 when value is found", 1, BinarySearcher.intArrayIndexOf(2, threeValueAscendingArray));
    assertEquals("Failed to return 2 when value is founs", 2, BinarySearcher.intArrayIndexOf(3, threeValueAscendingArray));

    int[] threeValueDescendingArray = new int[]{3, 2, 1};
    assertEquals("Failed to return -1 when value is not found", -1, BinarySearcher.intArrayIndexOf(4, threeValueDescendingArray));
    assertEquals("Failed to return 0 when value is found", 0, BinarySearcher.intArrayIndexOf(3, threeValueDescendingArray));
    assertEquals("Failed to return 1 when value is found", 1, BinarySearcher.intArrayIndexOf(2, threeValueDescendingArray));
    assertEquals("Failed to return 2 when value is found", 2, BinarySearcher.intArrayIndexOf(1, threeValueDescendingArray));

  }


  @Ignore
  public void testLongArrayIndexOf() {

  }

  @Ignore
  public void testFloatArrayIndexOf() {

  }

  @Ignore
  public void testDoubleArrayIndexOf() {

  }

  @Ignore
  public void testBooleanArrayIndexOf() {

  }

  @Ignore
  public void testCharArrayIndexOf() {

  }

  @Ignore
  public void testObjectArrayIndexOf() {

  }

}
