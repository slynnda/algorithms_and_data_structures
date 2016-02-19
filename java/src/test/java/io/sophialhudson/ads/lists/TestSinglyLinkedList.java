package io.sophialhudson.ads.lists;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import static org.hamcrest.CoreMatchers.instanceOf;

import io.sophialhudson.ads.shared.nodes.SinglyLinkedNode;


public class TestSinglyLinkedList {

  @Test
  public void testGetHead() {
    SinglyLinkedList<String> underTest = new SinglyLinkedList<String>();
    SinglyLinkedNode<String> testNode = new SinglyLinkedNode<String>("testGetHead-Node", null);
    assertNull("The initial value of the head of the list should be null", underTest.getHead());
    underTest = new SinglyLinkedList<String>(testNode);
    assertNotNull("The initial value of the head of the list should not be null", underTest.getHead());
  }

  @Test
  public void testGetTail() {
    SinglyLinkedList<String> underTest = new SinglyLinkedList<String>();
    SinglyLinkedNode<String> testNode = new SinglyLinkedNode<String>("testGetTail-Node", null);
    assertNull("The initial value of the tail of the list should be null", underTest.getTail());
    underTest = new SinglyLinkedList<String>(testNode);
    assertNotNull("The initial value of the tail of the list should not be null", underTest.getTail());

  }

  @Test
  public void testGetSize() {
    SinglyLinkedList<String> underTest = new SinglyLinkedList<String>();
    SinglyLinkedNode<String> testNode = new SinglyLinkedNode<String>("testGetSize-Node", null);
    assertEquals("The size should be zero if there are not list elements", 0, underTest.getSize());
    underTest = new SinglyLinkedList<String>(testNode);
    assertEquals("The size should be one if there exists a list element", 1, underTest.getSize());
  }

  @Test
  public void testPrepend() {
    SinglyLinkedList<String> underTest = new SinglyLinkedList<String>();
    SinglyLinkedNode<String> testNode1 = new SinglyLinkedNode<String>("testPrepend-Node1", null);
    SinglyLinkedNode<String> testNode2 = new SinglyLinkedNode<String>("testPrepend-Node2", null);
    underTest.prepend(testNode1);
    assertNotNull("After prepending an element to an empty list, the head should not be null", underTest.getHead());
    assertEquals("After prepending an element to an empty list, the head should be that element", testNode1, underTest.getHead());
    assertNotNull("After prepending an element to an empty list, the tail should not be null", underTest.getTail());
    assertEquals("After prepending an element to an empty list, the tail should be that element", testNode1, underTest.getHead());
    assertEquals("After prepending an element to an empty list, the size should be one", 1, underTest.getSize());
    underTest.prepend(testNode2);
    assertNotNull("After prepending an element to a non-empty list, the head should not be null", underTest.getHead());
    assertEquals("After prepending an element to a non-empty list, the head should be that element", testNode2, underTest.getHead());
    assertEquals("After prepending an element to a non-empty list, the node after the head should be the previous head node", testNode1, underTest.getHead().getNext());
    assertEquals("After prepending an element to a non-empty list (of size one), the size should be two", 2, underTest.getSize());
  }

  @Test
  public void testAppend() {
    SinglyLinkedList<String> underTest = new SinglyLinkedList<String>();
    SinglyLinkedNode<String> testNode1 = new SinglyLinkedNode<String>("testAppend-Node1", null);
    SinglyLinkedNode<String> testNode2 = new SinglyLinkedNode<String>("testAppend-Node2", null);
    underTest.append(testNode1);
    assertNotNull("After appending an element to an emtpy list, the head should not be null", underTest.getHead());
    assertEquals("After appending an element to an empty list, the head should be that element", testNode1, underTest.getHead());
    assertNotNull("After appending an element to an empty list, the tail should not be null", underTest.getTail());
    assertEquals("After appending an element to an empty list, the tail should be that element", testNode1, underTest.getTail());
    assertEquals("After appending an element to an empty list, the size should be one", 1, underTest.getSize());
    underTest.append(testNode2);
    assertNotNull("After appending an element to a non-empty list, the tail should not be null", underTest.getTail());
    assertEquals("After appending an element to a non-empty list, the tail should be that element", testNode2, underTest.getTail());
    assertEquals("After appending an element to a non-empty list, the appended node should be the next node of the previous tail node", testNode2, testNode1.getNext());
    assertEquals("After appending an element to a non-empty list (of size one), the size should be two", 2, underTest.getSize());
  }

  @Ignore
  public void testReverse() {
  }

  @Ignore
  public void testInsertBefore() {
  }

  @Ignore
  public void testInsertAfter() {

  }

  @Test
  public void testIsEmpty() {
    SinglyLinkedList<String> underTest = new SinglyLinkedList<String>();
  }

  @Ignore
  public void testContainsNode() {
  }

  @Ignore
  public void testContainsValue() {
  }

  @Ignore
  public void testGetNodeAtPosition() {
  }

  @Ignore
  public void testGetValueAtPosition() {
  }

  @Ignore
  public void testIndexOfNode() {
  }

  @Ignore
  public void testIndexOfValue() {
  }

}
