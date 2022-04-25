package org.skrymer.java.generics;

import java.util.Collection;
import java.util.Iterator;

public class DogTrainer {
  public void unsafeTrain(Collection dogs) {
    Iterator dogIterator = dogs.iterator();
    
    while(dogIterator.hasNext()){
      var dog = (Dog)dogIterator.next();
      dog.sit();
    }    
  }

  public void safeTrain(Collection<Dog> dogs) {
    Iterator<Dog> dogIterator = dogs.iterator();
    
    while(dogIterator.hasNext()){
      var dog = (Dog)dogIterator.next();
      dog.sit();
    }        
  }
}
