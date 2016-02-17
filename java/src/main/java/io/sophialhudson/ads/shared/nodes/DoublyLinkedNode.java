package io.sophialhudson.ads.shared.nodes;

public class DoublyLinkedNode<ItemType> extends SinglyLinkedNode<ItemType> {

  private Node<ItemType> previous;

  /**
   * Constructor that allows for instantiation with a reference to the next node, previous node,
   * and data for the current node.
   * 
   * @param data Data to assign to the node.
   * @param previous Reference to the previous node.
   * @param next Reference to the next node.
   * @return DoublyLinkedNode
   *
   */
  public DoublyLinkedNode(ItemType data, Node<ItemType> previous, Node<ItemType> next) {
    super(data, next);
    this.previous = previous;
  }

  /**
   * Get the previous node.
   *
   * @return The previous node of the current node.
   */
  public Node<ItemType> getPrevious() {
    return this.previous;
  }

  /**
   * Set the previous node.
   *
   * @param previous The reference to the desired previous node.
   */
  public void setPrevious(Node<ItemType> previous) {
    this.previous = previous;
  }

}
