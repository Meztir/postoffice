package domain.post;

import domain.env.Shape3D;
import lombok.Builder;
import lombok.Getter;

/**
 * класс описывающий посылку
 */
@Builder
public class Package {
    /**
     * мат модель поверхности посылки
     */
    @Getter
    private Shape3D packageDescription;
    /**
     * какие-то поля предметной области
     */
}
