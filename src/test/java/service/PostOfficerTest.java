package service;


import domain.env.ParallelepipedShape;
import domain.post.Box;
import org.junit.Test;
import domain.post.Package;

import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class PostOfficerTest {


    @Test
    public void isPackageFitInBoxNull() {
        assertFalse(PostOfficer.isPackageFitInBox(null,null));
    }

    @Test
    public void isPackageFitInBoxNullBox() {
        ParallelepipedShape big = ParallelepipedShape.builder().h(3).l(5).w(4).build();
        Box box = Box.builder().boxInnerSpaceDescription(big).build();
        assertFalse(PostOfficer.isPackageFitInBox(null,box));
    }

    @Test
    public void isPackageFitInBox() {
        ParallelepipedShape boxShape = mock(ParallelepipedShape.class);
        ParallelepipedShape packShape = mock(ParallelepipedShape.class);
        Box box = Box.builder().boxInnerSpaceDescription(boxShape).build();
        Package pack = Package.builder().packageDescription(packShape).build();
        when(packShape.in(eq(boxShape))).thenReturn(true);
        assertTrue(PostOfficer.isPackageFitInBox(pack,box));
    }

}
