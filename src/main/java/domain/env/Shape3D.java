package domain.env;



/**
 * Интерфейс описывает фигуру в пространстве
 */
public interface Shape3D {

    /**
     * Может ли данная фигура пометиться в эту
     *
     * @param otherShape
     * @return
     */
   boolean  in(Shape3D otherShape);

}
