package io.sophialhudson.ads.lists;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNotNull;

import static org.hamcrest.CoreMatchers.instanceOf;


public class TestSinglyLinkedList {

  private SinglyLinkedList<String> underTest;

  @Before
  public void initializeTestSuite() {
    this.underTest = new SinglyLinkedList<String>();  
  }

  @Ignore
  public void testPrepend() {
  }

  @Ignore
  public void testAppend() {
  }

  @Ignore
  public void testReverse() {
  }

  @Ignore
  public void testInsertAt() {
  }

  @Ignore
  public void testIsEmpty() {
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
