package io.sophialhudson.ads.arrays;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class TestArrayReverser {

  @Ignore
  public void testReverseByteArray() {

    boolean throwsNullPointerException = false;
    try {
      byte[] result = ArrayReverser.reverseByteArray(null);
    } catch(NullPointerException ex) {
      throwsNullPointerException = true;
    }
    assertTrue("Failed to throw NullPointerException on null array", throwsNullPointerException); 

    byte[] underTest = new byte[0];
    assertEquals("Failed to short-circuit procedure on empty array", underTest, ArrayReverser.reverseByteArray(underTest));

    underTest = new byte[1];
    assertEquals("Failed to short-circuit procedure on an array with one element", underTest, ArrayReverser.reverseByteArray(underTest));

  }

  @Ignore
  public void testReverseShortArray() {
    
    boolean throwsNullPointerException = false;
    try {
      short[] result = ArrayReverser.reverseShortArray(null);
    } catch(NullPointerException ex) {
      throwsNullPointerException = true;
    }
    assertTrue("Failed to thrown NullPointerException on null array", throwsNullPointerException);

    short[] underTest = new short[0];
    assertEquals("Failed to short-circuit procedure on empty array", underTest, ArrayReverser.reverseShortArray(underTest));
    
    underTest = new short[1];
    assertEquals("Failed to short-circuit procedure on an array with one element", underTest, ArrayReverser.reverseShortArray(underTest));

  }

  @Ignore
  public void testReverseIntArray() {

  }

  @Ignore
  public void testReverseLongArray() {

  }

  @Ignore
  public void testReverseFloatArray() {

  }

  @Ignore
  public void testReverseDoubleArray() {

  }

  @Ignore
  public void testReverseBooleanArray() {

  }

  @Ignore
  public void testReverseCharArray() {

  }

  @Ignore
  public void testReverseObjectArray() {

  }

}
