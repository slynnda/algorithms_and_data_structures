package io.sophialhudson.ads.shared.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNotNull;

import static org.hamcrest.CoreMatchers.instanceOf;

public class TestDoublyLinkedNode {
  
  private String data = "Hello";
  private String previousData = "Previous";
  private String nextData = "Next";
  private Node<String> nextNode;
  private Node<String> previousNode;
  private DoublyLinkedNode<String> underTest;

  @Before
  public void initializeTestSuite() {
    this.previousNode = new Node<String>(this.previousData);
    this.nextNode = new Node<String>(this.nextData);
    this.underTest = new DoublyLinkedNode<String>(this.data, this.previousNode, this.nextNode);
  }

  @Test
  public void testGetPrevious() {
    Node<String> previous = this.underTest.getPrevious();
    assertNotNull("Failed to reference previous node", previous);
    assertThat("Next node failed to be of the appropriate type", previous, instanceOf(Node.class));
  }

  @Test
  public void testSetPrevious() {
    String newPreviousData = "What";
    Node<String> newPreviousNode = new Node<String>(newPreviousData);
    this.underTest.setPrevious(newPreviousNode);
    assertEquals("Failed to reassign next node with appropriate value", newPreviousData, this.underTest.getPrevious().getData());
  }

}
