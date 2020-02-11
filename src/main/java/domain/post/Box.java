package domain.post;

import domain.env.Shape3D;
import lombok.Builder;
import lombok.Getter;

/**
 * описывает коробку
 */
 @Builder
public class Box{
    /**
     * мат модель внутреннего пространства коробки
     */
    @Getter
    private Shape3D boxInnerSpaceDescription;

    /**
     * какие-то поля предметной области
     */
}
