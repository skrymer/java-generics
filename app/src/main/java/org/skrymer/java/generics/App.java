/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.skrymer.java.generics;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        var dogTrainer = new DogTrainer();
        var unsafeDogs = new ArrayList();
        unsafeDogs.add(new Dog());
        //dogs.add(new Cat()); - will fail at runtime
        dogTrainer.unsafeTrain(unsafeDogs);

        var safeDogs = new ArrayList<Dog>();
        safeDogs.add(new Dog());
        // safeDogs.add(new Cat()); - will fail at compile time
        dogTrainer.safeTrain(safeDogs);

        // List<T>
        // var bList = new ArrayList<B>();
        // // bList.add(new A()); - not allowed to add A as not a B
        // bList.add(new B());
        // bList.add(new C()); // - ok as C is a B
        // System.out.println(bList.get(0));
        // System.out.println(bList.get(1));

        // List<? extends T>
        var bList = new ArrayList<B>();
        List<? extends A> aList = bList;
        // List<? extends C> cList = bList;
        // bList.add(new A()); -- not possible as the original list contains B's    
        bList.add(new B()); // ok to add B here as the original reference is still in scope
        addToList(bList);
    }

    public static void addToList(List<? extends B> list){
        // list.add(new B()); -- not possible as the original reference is no longer in scope
    }


    
}
