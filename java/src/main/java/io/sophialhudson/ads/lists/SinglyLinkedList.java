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
   * Constructor with single node. This constructor allows the caller to instantiate
   * a linked list with an initial node. 
   *
   * @return SinglyLinkedList
   */
  public SinglyLinkedList(SinglyLinkedNode<ItemType> node) {
    this.head = node;
    this.tail = node;
    this.size = 1;
  }

  /**
   * Get a reference to the head of the list.
   *
   * @return The head of the list.
   */
  public SinglyLinkedNode<ItemType> getHead() {
    return this.head;
  }

  /**
   * Get a reference to the tail of the list.
   *
   * @return The tail of the list.
   */
  public SinglyLinkedNode<ItemType> getTail() {
    return this.tail;
  }

  /**
   * Get the size of the list.
   *
   * @return The number of elements in the list.
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Prepend a node to the beginning of the linked list, moving the
   * head over and attaching the desired node as the new list head.
   *
   * TODO: Throw exception if the argument is null.
   * 
   * @param node The node to prepend to the list.
   */
  public void prepend(SinglyLinkedNode<ItemType> node) {
    if (this.isEmpty()) {
      this.head = node;
      this.tail = node;
    } else {
      node.setNext(this.head);
      this.head.setNext(node);
      this.head = node;
    }
    this.size = this.size + 1;
  }

  /**
   * Append a node to the end of the linked list.
   *
   * TODO: Throw exception if the argument is null.
   *
   * @param node The node to append to the list.
   */
  public void append(SinglyLinkedNode<ItemType> node) {
    if (this.isEmpty()) {
      this.head = node;
      this.tail = node;
    } else {
      node.setNext(null);
      this.tail.setNext(node);
      this.tail = node;
    }
    this.size = this.size + 1;
  }

  /**
   * Reverse the entire list (not the most optimal of methods).
   */
  public void reverse() {

  }

  /**
   * Insert a node before the given position, provided that position exists in the
   * list. If the provided index is not in the range of valid indexes, an exception
   * is thrown.
   *
   * @param node The node to insert.
   * @param position The position before which to insert the node.
   * @throws IndexOutOfBoundsException The provided position was not within the appropriate bounds.
   */
  public void insertBefore(SinglyLinkedNode<ItemType> node, int position) throws IndexOutOfBoundsException {

  }

  /**
   * Insert a node after the given position, provided that position exists in the
   * list. If the provided index is not in the range of valid indexes, an exception
   * is thrown.
   *
   * @param node The node to insert.
   * @param position The position after which to insert the node.
   * @throws IndexOutOfBoundsException The provided position was not within the appropriate bounds.
   */
  public void insertAfter(SinglyLinkedNode<ItemType> node, int position) throws IndexOutOfBoundsException {

  }

  /**
   * Gives whether or not the list is empty. Returns true if it is empty and
   * false otherwise.
   *
   * @return Whether or not the list is empty.
   */
  public boolean isEmpty() { 
    return this.size == 0;
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
