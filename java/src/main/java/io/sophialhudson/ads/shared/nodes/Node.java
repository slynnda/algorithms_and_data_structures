package io.sophialhudson.ads.shared.nodes;

/**
 * This class defines a generic node with a data field, and methods
 * for getting and setting.
 */
public class  Node<ItemType> {
  
  private ItemType data;

  /**
   * Constructor that allows for initialization with specified data.
   * 
   * @param data The data to be contained in the node.
   * @return Node
   */
  public Node(ItemType data) {
    this.data = data;  
  }

  /**
   * Get the data from the node.
   *
   * @return The data contained in the node.
   */
  public ItemType getData() {
    return this.data;
  }

  /**
   * Set the data in the node.
   *
   * @param data The data to set on the node.
   */
  public void setData(ItemType data) {
    this.data = data;
  }

  /**
   * Returns stringified data field.
   * 
   * @return The stringified data.
   */
  @Override
  public String toString() {
    return this.data.toString();
  }

  // TODO: Add comparator for nodes

}
