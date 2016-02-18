package io.sophialhudson.ads.lists;

import io.sophialhudson.ads.shared.nodes.SinglyLinkedNode;

/**
 * This class provides a basic implementation of the Singly-Linked list
 * data structure, along with with a subset of operations that attempt 
 * to mirror those of a standard implementation.
 */
public class SinglyLinkedList<ItemType> {

  private SinglyLinkedNode<ItemType> head;
  private SinglyLinkedNode<ItemType> tail;
  private int size;

  /**
   * Default constructor. When no arguments are passed, the head and tail of the
   * linked list are set to null and the size is set to zero. This instantiates an
   * "empty" singly-linked list.
   *
   * @return SinglyLinkedList
   */
  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  /**
   * Prepend a node to the beginning of the linked list, moving the
   * head over and attaching the desired node as the new list head.
   * 
   * @param node The node to prepend to the list.
   */
  public void prepend(SinglyLinkedNode<ItemType> node) {
     
  }

  /**
   * Append a node to the end of the linked list.
   *
   * @param node The node to append to the list.
   */
  public void append(SinglyLinkedNode<ItemType> node) {

  }

  /**
   * Reverse the entire list (not the most optimal of methods).
   */
  public void reverse() {

  }

  /**
   * Insert a node at the given position, provided that position exists in the
   * list. If the provided index is not in the range of valid indexes, an 
   * exception is thrown.
   *
   * @param node The node to insert.
   * @param position The position at which to insert the node.
   * @throws IndexOutOfBoundException The provided position was not within the appropriate bounds.
   */
  public void insertAt(SinglyLinkedNode<ItemType> node, int position) throws IndexOutOfBoundsException {

  }

  /**
   * Gives whether or not the list is empty. Returns true if it is empty and
   * false otherwise.
   *
   * @return Whether or not the list is empty.
   */
  public boolean isEmpty() { 
    return false;
  }

  /**
   * Gives whether or not a particular instance of a node is contained
   * in the list.
   *
   * @param node The node to check the list for.
   * @return Whether or not the provided node is contained in the list.
   */
  public boolean containsNode(SinglyLinkedNode<ItemType> node) {
    return false;
  }

  /**
   * Gives whether or not a particular value is contained in any of the
   * nodes in the list.
   *
   * @param value The value ot check the list for.
   * @return Whether or not any of the nodes in the list contain the provided value
   */
  public boolean containsValue(ItemType value) {
    return false;
  }
  
  /**
   * Returns the node at the given position, provided that position exists in
   * the list. If the provided index is not in the range of valid indexes, an
   * exception is thrown.
   *
   * @param position The position in the list of the node to return.
   * @return The node in the list at the provided position.
   * @throws IndexOutOfBoundsException The provided position was not within the appropriate bounds.
   */
  public SinglyLinkedNode<String> getNodeAtPosition(int position) throws IndexOutOfBoundsException {
    return null;
  }

  /**
   * Returns the value at the given position, provided that position exists in
   * the list. If the provided index is not in the range of valid indexes, an
   * exception is thrown.
   * 
   * @param position The position in the list of the value to return.
   * @return The value in the list at the provided position.
   * @throws IndexOutOfBoundsException The provided position was not within the appropriate bounds.
   */
  public ItemType getValueAtPosition(int position) throws IndexOutOfBoundsException {
    return null;
  }

  /**
   * Gives the index of the first node in the list that matches the provided node. If no
   * such index exists, the method returns -1.
   *
   * @param node The node to scan the list for.
   * @return The position of the node in the list.
   *
   */
  public int indexOfNode(SinglyLinkedNode<ItemType> node) {
    return -1;
  }

  /**
   * Gives the index of the first value in the list that matches the provided value. If no
   * such index exists, the method returns -1.
   * 
   * @param value The value to scan the list for.
   * @return The position of the first occurrence of the value in the list.
   *
   */
  public int indexOfValue(ItemType value) {
    return -1;
  }

}
