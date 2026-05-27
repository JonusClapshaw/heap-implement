import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {

    @Test
    public void testAdd() {
        Heap<Integer> heap = new Heap<>();

        heap.add(10);
        heap.add(20);
        heap.add(5);

        assertEquals(3, heap.newHeap.size());
        assertEquals(Integer.valueOf(5), heap.newHeap.get(0));

        heap.add(15);

        assertEquals(4, heap.newHeap.size());
        assertEquals(Integer.valueOf(15), heap.newHeap.get(1));
    }
}
