package VeterinaryClinicSystem;

import java.util.HashSet;
import java.util.Set;

public class VeterinaryClinic {
    public static CatInfo cat1 = new CatInfo();
    public static CatInfo cat2 = new CatInfo();
    public static CatInfo cat3 = new CatInfo();

    public static void main(String[] args) {
        //cat #1
        cat1.nickname = "Барсик";
        cat1.color = CatInfo.getColor(1);
        cat1.breed = CatInfo.getBreed(1);
        cat1.age = 5;
        cat1.id = 752;
        cat1.masterSurname = "Есенин";
        cat1.masterName = "Сергей";
        cat1.masterEmail = "pisatel@yandex.ru";
        cat1.masterPhoneNumber = 0;
        //cat #2
        cat2.nickname = "Рыжик";
        cat2.color = CatInfo.getColor(4);
        cat2.breed = CatInfo.getBreed(5);
        cat2.age = 8;
        cat2.id = 143;
        cat2.masterSurname = "Суворов";
        cat2.masterName = "Александр";
        cat2.masterEmail = "polkovodec@gmail.com";
        cat2.masterPhoneNumber = 17301800;
        //cat #3
        cat3.nickname = "Трамп";
        cat3.color = CatInfo.getColor(3);
        cat3.breed = CatInfo.getBreed(4);
        cat3.age = 15;
        cat3.id = 777;
        cat3.masterSurname = "Путин";
        cat3.masterName = "Владимир";
        cat3.masterEmail = "президентвсеяруси.рф";
        cat3.masterPhoneNumber = 2002316;

        //"Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество."
        CatInfo catTest1 = new CatInfo();
        catTest1.id = 100;
        catTest1.nickname = "Феликс";
        catTest1.age = 10;
        catTest1.breed = CatInfo.getBreed(02);

        CatInfo catTest2 = new CatInfo();
        catTest2.id = 100;
        catTest2.nickname = "Феликс";
        catTest2.age = 10;
        catTest2.breed = CatInfo.getBreed(02);


        //"Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов."
        Set<CatInfo> catBase = new HashSet<>();
        catBase.add(cat1);
        catBase.add(cat2);
        catBase.add(cat3);
        catBase.add(catTest1);
        catBase.add(catTest2);

        System.out.println(catBase);
        //System.out.println(createCatHashSet());
        System.out.println("equals: " + catTest1.equals(catTest2));


        // "Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились." - Кот Феликс хранится в базе в одном экземпляре!
    }


}
