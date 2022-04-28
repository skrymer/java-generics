package org.skrymer.java.generics;

public class C extends B {

  public void cBehaviour() {
    System.out.println("Somthing only C can do");
  }

  @Override
  public String toString() {
    return "I'm C";
  }
}
