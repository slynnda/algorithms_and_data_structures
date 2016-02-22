package io.sophialhudson.ads.arrays;

/**
 * This class provides implementations of the QuickSort algorithm that
 * work on any primitive type and any class that subclasses Comparable.
 *
 * NOTE: These implementations utilize the Hoare partition scheme.
 * NOTE: These implementations do in-place quicksort.
 * 
 * @author Sophia Hudson sophialhudson@gmail.com
 */
public class QuickSort {

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(byte[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(byte[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(byte[] arr, int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(short[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(short[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(short[] arr, int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(int[] arr) throws NullPointerException {
    if (arr == null) {
      throw new NullPointerException("Cannot sort a null array.");
    }
    sort(arr, 0, arr.length - 1);
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(int[] arr, int low, int high) {
    if (arr == null) {
      throw new NullPointerException("Cannot sort a null array.");
    }
      if (arr.length == 0 || low >= high) {
      return;
    }
    int p = partition(arr, low, high);
    sort(arr, low, p);
    sort(arr, p + 1, high);
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low - 1;
    int j = high + 1;
    while (i < j) {
      do { 
        i = i + 1;
      } while (arr[i] < pivot);
      do {
        j = j - 1;
      } while (arr[j] > pivot);
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    } 
    return j;
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(long[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(long[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */

  private static int partition(long[] arr, int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(float[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(float[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(float[] arr, int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(double[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(double[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(double[] arr, int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(boolean[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(boolean[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(boolean[] arr,  int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(char[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(char[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(char[] arr, int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort the entire array and throw an exception if the
   * array is null.
   * 
   * @param arr The array to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(Comparable[] arr) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place sort of the provided array. This method
   * will sort only sort the segment of the array specified
   * by the low and high arguments.
   *
   * @param arr The array to sort.
   * @param low Lower bound of the segment to sort.
   * @param high Upper bound of the segment to sort.
   * @throws NullPointerException Attempted to sort a null array.
   */
  public static void sort(Comparable[] arr, int low, int high) throws NullPointerException, UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

  /**
   * Do an in-place Hoare partitioning of the array segment specified
   * by the low and high arguments. 
   *
   * @param arr The array to partition.
   * @param low Lower bound of the segment to partition.
   * @param high Upper bound of the segment to sort.
   */
  private static int partition(Comparable[] arr, int low, int high) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("This method has yet to be implemented.");
  }

}
