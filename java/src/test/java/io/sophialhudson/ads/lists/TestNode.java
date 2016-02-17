package io.sophialhudson.ads.lists;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestNode {

  private String data = "Hello";
  private Node underTest;

  @Before
  public void initializeTestSuite() {
    this.underTest = new Node<String>(this.data);
  }

  @Test
  public void testGetData() {
    assertEquals("Failed to retrieve the appropriate test data from the node", data, this.underTest.getData());
  }

  @Test
  public void testSetData() {
    this.data = "Goodbye";
    this.underTest.setData(this.data);
    assertEquals("Failed to set the appropriate test data for the node", data, this.underTest.getData());
  }

  @Test
  public void testToString() {
    String stringifiedData = this.data.toString();
    assertEquals("The data failed to be appropriately stringified", stringifiedData, this.underTest.toString());
  }

}
