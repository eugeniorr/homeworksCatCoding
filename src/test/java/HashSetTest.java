import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    @Test
    void sizeTest() {
        Set<Integer> set = new HashSet<>();
        assertEquals(0, set.size());

        set.add(1);
        set.add(2);
        assertEquals(2, set.size());
    }

    @Test
    void isEmptyTest() {
        Set<Integer> set = new HashSet<>();
        assertTrue(set.isEmpty());

        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    void containsTest() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        assertFalse(set.contains(2));

        set.add(2);
        assertTrue(set.contains(2));
    }

    @Test
    void addTest() {
        Set<Integer> set = new HashSet<>();
        assertTrue(set.add(1));
        assertFalse(set.add(1));
        assertTrue(set.contains(1));
    }

    @Test
    void removeTest() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        assertFalse(set.remove(2));
        assertTrue(set.remove(1));
        assertTrue(set.isEmpty());
    }

    @Test
    void clearTest() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        assertEquals(3, set.size());

        set.clear();
        assertEquals(0, set.size());
    }
}
