package service;

import domain.post.Box;
import domain.post.Package;

/**
 * Сотрудник почты может определять помещается ли посылка коробку
 */
public class PostOfficer {
    /**
     * метод определяет помещается посылка в коробку или нет
     * @param pack посылка
     * @param box коробка
     * @return
     */
    public static boolean isPackageFitInBox(Package pack, Box box){
        // кто - то забыл описать коробку вполне возможно,
        // это нарушает бизнес логику и надо было бы кидать бизнес эксепшн,
        // но не сейчас
        if (box == null || box.getBoxInnerSpaceDescription() == null)
            return false;
        //Считаем что если посылка не существует, то она никуда не помещается
        if(pack == null || pack.getPackageDescription() == null)
            return false;
        return pack.getPackageDescription().in(box.getBoxInnerSpaceDescription());
    }
    public static void main(String[] args) {

    }
}
