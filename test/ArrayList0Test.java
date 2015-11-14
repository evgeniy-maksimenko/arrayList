import com.company.ArrayList0;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayList0Test {
    
    @Test (expected = IllegalArgumentException.class)
    public void testMinExc() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(null);
        assertEquals(24, arrayList0.min());
    }

    @Test
    public void testInit() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[0]);
    }

    @Test
    public void testMin() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        assertEquals(24, arrayList0.min());
    }
    
    @Test
    public void testMax() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        assertEquals(340, arrayList0.max());
    }

    @Test
    public void testMinInd() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        assertEquals(4, arrayList0.minInd());
    }

    @Test
    public void testMaxInd() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        assertEquals(2, arrayList0.maxInd());
    }

    @Test
    public void testSort() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {24, 33, 120, 292, 340};
        arrayList0.sort();
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRevers() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {24, 33, 292, 340, 120};
        arrayList0.reverse();
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testHalfReverse() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {33, 24, 292, 120, 340};
        arrayList0.halfReverse();
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSize() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        assertEquals(5, arrayList0.size());
    }

    @Test
    public void testSet() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {120, 200, 292, 33, 24};
        arrayList0.set(1, 200);
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGet() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        assertEquals(340, arrayList0.get(1));
    }

    @Test
    public void testClear() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        arrayList0.clear();
        assertEquals("Empty list should have 0 elements", 0, arrayList0.size());
    }

    @Test
    public void testAddPush() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {200, 120, 340, 292, 33, 24};
        assertEquals(5, arrayList0.size());
        arrayList0.addPush(200);
        assertEquals(6, arrayList0.size());
        assertEquals(200, arrayList0.get(0));
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddPop() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {120, 340, 292, 33, 24, 200};
        assertEquals(5, arrayList0.size());
        arrayList0.addPop(200);
        assertEquals(6, arrayList0.size());
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {200, 120, 340, 292, 33, 24};
        assertEquals(5, arrayList0.size());
        arrayList0.add(0, 200);
        assertEquals(6, arrayList0.size());
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDelStart() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {340, 292, 33, 24};
        assertEquals(5, arrayList0.size());
        int delStart = arrayList0.delStart();
        assertEquals(4, arrayList0.size());
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
        assertEquals(120, delStart);
    }

    @Test
    public void testDelEnd() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {120, 340, 292, 33};
        assertEquals(5, arrayList0.size());
        int delEnd = arrayList0.delEnd();
        assertEquals(4, arrayList0.size());
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
        assertEquals(24, delEnd);
    }

    @Test
    public void testDelIndex() {
        ArrayList0 arrayList0 = new ArrayList0();
        arrayList0.init(new int[]{120, 340, 292, 33, 24});
        int[] expected = {120, 340, 292, 33};
        assertEquals(5, arrayList0.size());
        int delIndex = arrayList0.delIndex(4);
        assertEquals(4, arrayList0.size());
        int[] actual = arrayList0.getList();
        assertArrayEquals(expected, actual);
        assertEquals(24, delIndex);
    }
}
