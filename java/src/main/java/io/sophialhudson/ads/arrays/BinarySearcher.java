package io.sophialhudson.ads.arrays;

/**
 * This class provides a collection of static methods for doing both ascending
 * and descending binary searches across arrays of all primitive types and arrays
 * that subclass the Object type.
 * 
 * NOTE: These methods are designed to short-circuit the procedure if a degenerate
 * search case is encountered.
 *
 * @author Sophia Hudson sophia.hudson@gmail.com
 */
public class BinarySearcher {

  /**
   * Find the index of the first occurrence of a given byte in the provided byte array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   *
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The byte to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided byte.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int byteArrayIndexOf(byte x, byte[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Find the index of the first occurrence of a given short in the provided short array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   *
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The short to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided short.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int shortArrayIndexOf(short x, short[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Find the index of the first occurrence of a given int in the provided int array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   * 
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The int to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided int.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int intArrayIndexOf(int x, int[] arr) throws NullPointerException {
    if (arr == null) {
      throw new NullPointerException("Cannot search for elements in a null array.");
    } else {
      int len = arr.length;
      if (len == 0) {
        return -1;
      } else if (len == 1 && arr[0] == x) {
        return 0;
      } else if (len == 1 && arr[0] != x) {
        return -1;
      } else if (len == 2) {
        if (arr[0] == x) {
          return 0;
        } else if (arr[1] == x) {
          return 1;
        } else {
          return -1;
        }
      } else {
        int leftIdx = 0;
        int rightIdx = len - 1;
        int leftVal = arr[leftIdx];
        int rightVal = arr[rightIdx];
        int diff = rightVal - leftVal;
        if (diff > 0) {
          while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            int midVal = arr[midIdx];
            if (midVal == x) {
              return midIdx;
            } else if (midVal < x) {
              leftIdx = midIdx + 1;
            } else {
              rightIdx = rightIdx - 1;
            }
          }
          return -1;
        } else if (diff < 0) {
          while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            int midVal = arr[midIdx];
            if (midVal == x) {
              return midIdx;
            } else if (midVal < x) {
              rightIdx = midIdx - 1;
            } else {
              leftIdx = midIdx + 1;
            }
          }
          return -1;
        } else {
          if (leftVal == x) {
            return 0;
          } else {
            return -1;
          }
        }
      }
    }
  }

  /**
   * Find the index of the first occurrence of a given long in the provided long array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   *
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The long to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided long.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int longArrayIndexOf(long x, long[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Find the index of the first occurrence of a given float in the provided float array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   * 
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The float to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided float.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int floatArrayIndexOf(float x, float[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Find the index of the first occurrence of a given double in the provided double array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   *
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The double to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided double.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int doubleArrayIndexOf(double x, double[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Find the index of the first occurrence of a given boolean in the provided boolean array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   *
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The boolean to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided boolean.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int booleanArrayIndexOf(boolean x, boolean[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Find the index of the first occurrence of a given char in the provided char array.
   * If it is found, it's index is returned. Otherwise, the method returns -1.
   *
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The char to search the array for.
   * @param arr The array in which to search.
   * @return The index of the first occurrence of the provided char.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int charArrayIndexOf(char x, char[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Find the index of the first occurrence of a given Object in the provided Object array.
   * If it is found, it's index is returned. Otherwise, the method returns -1. This method
   * has two modes. Given the mode flag, it will search based on the element type's object
   * equivalence relation, or search based on object reference.
   *
   * NOTE: This method assumes that the provided array is already sorted.
   *
   * @param x The Object to search the array for.
   * @param arr The array in which to search.
   * @param byRef Whether or not to search by object reference.
   * @return The index of the first occurrence of the provided object.
   * @throws NullPointerException Attempted to search a null array.
   */
  public static int objectArrayIndexOf(Object x, Object[] arr, boolean byRef) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

}
