package domain.env;

import lombok.Builder;
import lombok.Getter;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

/**
 * параллелипипед
 */
@Getter
public class ParallelepipedShape  implements Shape3D {

    /**
     * длинна
     */
    private int l;
    /**
     * высота
     */
    private int h;
    /**
     * ширина
     */
    private int w;

    @Builder
    public ParallelepipedShape(int l,int h,int w){
        if(l < 0 || h <0 || w <0){
            throw new NotImplementedException();
        }
        this.l = l;
        this.h = h;
        this.w = w;
    }

    protected int[] orderedDimension(){
        int[] dimension = new int[3];
        dimension[0] = h;
        dimension[1] = l;
        dimension[2] = w;
        Arrays.sort(dimension);
        return dimension;
    }


    public boolean in(Shape3D otherShape){
        if (otherShape == null)
            return false;
        if (otherShape instanceof ParallelepipedShape){
            int[] dimension1 = orderedDimension();
            int[] dimension2 = ((ParallelepipedShape)otherShape).orderedDimension();
            //dimension1 и dimension2 не могут быть разной размерности или нулл для этого есть тесты
            return dimension1[0] < dimension2[0] && dimension1[1] < dimension2[1] && dimension1[2] < dimension2[2];
        }
        return false;
    }
}
