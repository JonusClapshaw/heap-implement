import java.util.ArrayList;

/**
 * A min-heap. 
 * 
 * Must contain functionality for the following: (n = # of elements in heap)
 * 
 * Adding a new value to the heap  O(log(n))
 * Popping the front of the heap O(log(n))
 * Peeking at the front of the heap without removing the element O(1)
 * Getting the size of the heap O(1)
 * Checking whether the heap is empty O(1)
 * 
 * 
 * The Heap must hold ints
 * 
 * Use List/ArrayList as a backing array, but DO NOT use the 
 * PriorityQueue class. Do not make Node objects, use array
 * indexing instead.
 * 
 * It is up to you to make design decisions about how to:
 *  - name methods
 *  - determine return value and argument types
 *  - hold private instance variables
 */
public class Heap <T extends Comparable<T>> {

    ArrayList<T> newHeap = new ArrayList<>();

    private int ParentIndex(int currentIndex) {
        return (currentIndex - 1) / 2;
    }

    public void add(T data) {
        newHeap.add(data);
        int currentIndex = newHeap.size() - 1;

        while(currentIndex > 0) {
            int parent = ParentIndex(currentIndex);

            if(newHeap.get(currentIndex).compareTo(newHeap.get(parent)) < 0){
                T temp = newHeap.get(parent);

                newHeap.set(parent, newHeap.get(currentIndex));

                newHeap.set(currentIndex, temp);

                currentIndex = parent;
            } else {
                break;
            }
        }
    }
}