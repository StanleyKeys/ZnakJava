package OOP_Seminar01;

import java.util.*;

import static java.lang.String.format;

public class Program {
    public static HumanBase person1 = new HumanBase();
    public static HumanBase person2 = new HumanBase();
    public static HumanBase person3 = new HumanBase();
    public static HumanBase person4 = new HumanBase();
    public static HumanBase person5 = new HumanBase();
    public static HumanBase person6 = new HumanBase();
    public static HumanBase person7 = new HumanBase();
    public static HumanBase person8 = new HumanBase();


    public static void main(String[] args) {

        person1.name = "Станислав";
        person1.sex = 1;
        person1.marriageId = 1;
        person1.brother = "Кирилл";

        person2.name = "Юлия";
        person2.sex = 2;
        person2.marriageId = 1;
        person2.sister = "Лилия";

        person3.name = "Виктор";
        person3.sex = 1;
        person3.marriageId = 2;

        person4.name = "Татьяна";
        person4.sex = 2;
        person4.marriageId = 2;

        person5.name = "Лионард";
        person5.sex = 1;
        person5.marriageId = 3;

        person6.name = "Валентина";
        person6.sex = 2;
        person6.marriageId = 3;

        person7.name = "Кирилл";
        person7.sex = 1;
        person7.marriageId = 0;
        person7.brother = "Станислав";

        person8.name = "Лилия";
        person8.sex = 2;
        person8.marriageId = 0;
        person8.sister = "Юлия";

        System.out.println(person8.getInfo());

        //System.out.println(person1.brother);
    }

    public String createTies(int id) {
        Map<Integer, String> map = new HashMap<>();
        String result = "";
        return result;
    }


}
