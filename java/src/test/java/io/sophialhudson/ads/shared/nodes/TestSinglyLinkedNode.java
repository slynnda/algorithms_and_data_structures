package io.sophialhudson.ads.shared.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNotNull;

import static org.hamcrest.CoreMatchers.instanceOf;

public class TestSinglyLinkedNode {

  private String data = "Hello";
  private String nextData = "Goodbye";
  private Node<String> nextNode;
  private SinglyLinkedNode<String> underTest;

  @Before
  public void initializeTestSuite() {
    this.nextNode = new Node<String>(this.nextData);
    this.underTest = new SinglyLinkedNode<String>(this.data, this.nextNode);
  }

  @Test
  public void testGetNext() {
    Node<String> next = this.underTest.getNext();
    assertNotNull("Failed to reference the next node", next);
    assertThat("Next node failed to be of the appropriate type", next, instanceOf(Node.class));
  }

  @Test
  public void testSetNext() {
    String newNextData = "What";
    Node<String> newNextNode = new Node<String>(newNextData);
    this.underTest.setNext(newNextNode);
    assertEquals("Failed to reassign next node with appropriate value", newNextData, this.underTest.getNext().getData());
  }

}
