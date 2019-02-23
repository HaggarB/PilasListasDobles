package Stack;

import Excepciones.isEmptyException;
import Excepciones.isFullException;
import List.DoubleLinkedList;

import java.util.Comparator;

public interface Stacks<T extends Comparable <T>> extends Iterable<T>, Comparator<Stacks>, Comparable<Stacks> {

    int getTop();

    int getLength();

    boolean isEmpty() throws isEmptyException;

    boolean isFull() throws isFullException;

    boolean push(T value);

    T pop() throws isEmptyException;

    T peak();

    DoubleLinkedList<T> getPila();
}
