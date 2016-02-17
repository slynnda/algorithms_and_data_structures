package io.sophialhudson.ads.shared.nodes;

/**
 * This class defines a node that supports a "next" node, and
 * therefore supports singly-linked data structures.
 */
public class SinglyLinkedNode<ItemType> extends Node<ItemType> {

  private Node<ItemType> next;

  /**
   * Constructor that allows for instantiation with a reference to the
   * next node and data for the current node.
   * 
   * @param data Data to assign to the node.
   * @param next Reference to the next node.
   * @return SinglyLinkedNode
   */
  public SinglyLinkedNode(ItemType data, Node<ItemType> next) {
    super(data);
    this.next = next;
  }

  /**
   * Get the next node.
   *
   * @return The next node of the current node.
   */
  public Node<ItemType> getNext() {
    return this.next;
  }

  /**
   * Set the next node.
   *
   * @param next The reference to the desired next node.
   */
  public void setNext(Node<ItemType> next) {
    this.next = next;
  }

}
