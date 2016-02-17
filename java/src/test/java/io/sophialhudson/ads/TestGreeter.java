package io.sophialhudson.ads;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestGreeter {

  private String greeting = "Gutentag";
  private Greeter underTest;

  @Before
  public void initializeTestSuite() {
    this.underTest = new Greeter(this.greeting);
  }

  @Test
  public void testGetGreeting() {
    assertEquals("Failed to return greeting with appropriate test value", this.greeting, this.underTest.getGreeting());
  }

  @Test
  public void testSetGreeting() {
    this.greeting = "Hello";
    this.underTest.setGreeting(this.greeting);
    assertEquals("Failed to set greeting to appropriate test value", this.greeting, this.underTest.getGreeting());
  }

  @Test
  public void testGenerateGreetingForPerson() {
    String person = "Dave";
    String expected = String.format("%s, %s", this.greeting, person); 
    assertEquals("Failed to generate greeting for person", expected, this.underTest.generateGreetingForPerson(person));
  }


}
