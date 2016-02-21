package io.sophialhudson.ads.arrays;

/**
 * This class provides a collection of static methods for doing an in-place reversal
 * of an array. It provides methods for all of the Java primitive types, as well as
 * a generic Object type.
 *
 * NOTE: These methods are designed to short-circuit the procedure if a degenerate
 * reversal case is encountered.
 *
 * @author Sophia Hudson sophialhudson@gmail.com
 */
public class ArrayReverser {

  /**
   * Do an in-place reversal of a primitive byte array. If the array is null,
   * an exception is thrown.
   *
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static byte[] reverseByteArray(byte[] arr) throws NullPointerException {

    if (arr == null) {
      throw new NullPointerException("Cannot reverse a null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          byte temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;

  }

  /**
   * Do an in-place reversal of a primitive short array. If the array is null,
   * an exception is thrown.
   *
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static short[] reverseShortArray(short[] arr) throws NullPointerException {
    
    if (arr == null) {
      throw new NullPointerException("Cannot reverse a null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          short temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = arr[temp];
        }
      }
    }
    return arr;

  }

  /**
   * Do an in-place reversal of a primitive int array. If the array is null,
   * an exception is thrown.
   *
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static int[] reverseIntArray(int[] arr) throws NullPointerException {
    
    if (arr == null) {
      throw new NullPointerException("Cannot reverse a null array.");
    } else {
      int len =  arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          int temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;

  }

  /**
   * Do an in-place reversal of a primitive long array. If the array is null,
   * an exception is thrown.
   * 
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static long[] reverseLongArray(long[] arr) throws NullPointerException {
    
    if (arr == null) {
      throw new NullPointerException("Cannot reverse a null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          long temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  /**
   * Do an in-place reversal of a primitive float array. If the array is null,
   * an exception is thrown.
   *
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static float[] reverseFloatArray(float[] arr) throws NullPointerException {
    
    if (arr == null ) {
      throw new NullPointerException("Cannot reverse a null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          float temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;

  }

  /**
   * Do an in-place reversal of a primitive double array. If the array is null,
   * an exception is thrown.
   *
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static double[] reverseDoubleArray(double[] arr) throws NullPointerException {
    
    if (arr == null) {
      throw new NullPointerException("Cannot reverse a null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          double temp  = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;

  }

  /**
   * Do an in-place reversal of a primitive boolean array. If the array is null,
   * an exception is thrown.
   * 
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static boolean[] reverseBooleanArray(boolean[] arr) throws NullPointerException {
    
    if (arr == null) {
      throw new NullPointerException("Cannot reverse a null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) { 
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          boolean temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;

  }

  /**
   * Do an in-place reversal of a primitive char array. If the array is null,
   * an exception is thrown.
   *
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static char[] reverseCharArray(char[] arr) throws NullPointerException {
    
    if (arr == null) {
      throw new NullPointerException("Cannot reverse null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          char temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;

  }

  /**
   * Do an in-place reversal of a generic Object array. If the array is null,
   * an exception is thrown.
   *
   * @param arr The array to reverse.
   * @return The reversed array.
   * @throws NullPointerException Attempted to reverse a null array.
   */
  public static Object[] reverseObjectArray(Object[] arr) throws NullPointerException {
    
    if (arr == null) {
      throw new NullPointerException("Cannot reverse null array.");
    } else {
      int len = arr.length;
      if (len == 0 || len == 1) {
        return arr;
      } else {
        int iterTo = len / 2;
        for (int i = 0; i < iterTo; i++) {
          Object temp = arr[i];
          int j = len - 1 - i;
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;

  }

}
