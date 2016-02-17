package io.sophialhudson.ads;

/**
 * This class is a simple placeholder to verify that the project builds correctly and
 * the tests run.
 */
public class Greeter {
  
  private String greeting;

  /**
   * Constructor that takes a greeting to initially be set on an instance.
   *
   * NOTE: Normally, I'd verify the constructor arguments but since this is a throwaway
   *       class, I am not going to do that here. Go ahead and hate me.
   */
  public Greeter(String greeting) {
    this.greeting = greeting;
  }

  /**
   * Set the greeting at runtime.
   *
   * @param greeting The greeting to set on the instance.
   */
  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  /**
   * Get the greeting at runtime.
   *
   * @return The greeting currently set on the instance.
   */
  public String getGreeting() {
    return this.greeting;
  }

  /**
   * Generate a string greeting a given person with the greeting.
   * 
   * @param person The person to generate a greeting for.
   * 
   * @return The string greeting the person.
   */
  public String generateGreetingForPerson(String person) {
    return String.format("%s, %s", this.greeting, person);
  }

}
