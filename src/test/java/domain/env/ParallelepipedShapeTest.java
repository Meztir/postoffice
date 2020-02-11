package domain.env;

import org.junit.Test;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.Assert.*;

public class ParallelepipedShapeTest {

    /**
     * размерность массива не нулл
     */
    @Test
    public void orderedDimensionNotNull() {
        int h = 1;
        int l = 2;
        int w = 3;
        ParallelepipedShape parallelepipedShape = ParallelepipedShape.builder().h(h).l(l).w(w).build();
        assertNotNull(parallelepipedShape.orderedDimension());
    }

    /**
     * размерность массива всегда 3
     */
    @Test()
    public void orderedDimensionIs3() {
        int h = 1;
        int l = 2;
        int w = 3;
        ParallelepipedShape parallelepipedShape = ParallelepipedShape.builder().h(h).l(l).w(w).build();
        assertEquals(parallelepipedShape.orderedDimension().length,3);
    }
    /**
     * размерность массив отсортирован
     */
    @Test()
    public void orderedDimensionIsSorted() {
        int h = 3;
        int l = 1;
        int w = 2;
        ParallelepipedShape parallelepipedShape = ParallelepipedShape.builder().h(h).l(l).w(w).build();
        assertEquals(parallelepipedShape.orderedDimension()[0],1);
        assertEquals(parallelepipedShape.orderedDimension()[1],2);
        assertEquals(parallelepipedShape.orderedDimension()[2],3);
    }
    @Test
    public void createAllAsIWant(){
        int h = 1;
        int l = 2;
        int w = 3;
        ParallelepipedShape parallelepipedShape = ParallelepipedShape.builder().h(h).l(l).w(w).build();
        assertEquals(parallelepipedShape.getH(),h);
        assertEquals(parallelepipedShape.getL(),l);
        assertEquals(parallelepipedShape.getW(),w);
    }
    @Test(expected = NotImplementedException.class)
    public void canNotCreateNegativeH(){
        int h = -1;
        int l = 2;
        int w = 3;
        ParallelepipedShape.builder().h(h).l(l).w(w).build();
    }
    @Test(expected = NotImplementedException.class)
    public void canNotCreateNegativeL(){
        int h = 1;
        int l = -2;
        int w = 3;
        ParallelepipedShape.builder().h(h).l(l).w(w).build();
    }
    @Test(expected = NotImplementedException.class)
    public void canNotCreateNegativeW(){
        int h = 1;
        int l = 2;
        int w = -3;
        ParallelepipedShape.builder().h(h).l(l).w(w).build();
    }

    @Test
    public void notInNull(){
        int h = 1;
        int l = 2;
        int w = 3;
        ParallelepipedShape first = ParallelepipedShape.builder().h(h).l(l).w(w).build();
        assertFalse(first.in(null));
    }

    @Test
    public void notInSmall(){
        ParallelepipedShape big = ParallelepipedShape.builder().h(10).l(10).w(10).build();
        ParallelepipedShape small = ParallelepipedShape.builder().h(5).l(5).w(5).build();
        assertFalse(big.in(small));
    }

    @Test
    public void inBig(){
        ParallelepipedShape big = ParallelepipedShape.builder().h(3).l(5).w(4).build();
        ParallelepipedShape small = ParallelepipedShape.builder().h(4).l(1).w(3).build();
        assertTrue(small.in(big));
    }

}
