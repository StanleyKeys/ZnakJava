package OOP_Seminar01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class HumanBase {
    String name;
    int sex;
    String brother;
    String sister;
    int marriageId;

    public String getSex(int id) {
        if (id == 1) {
            return "male";
        } else if (id == 2) {
            return "female";
        } else {
            return "N/A";
        }
    }

    public String getInfo() {
        String sexResult = getSex(sex);
        return format("имя: %s\nПол: %s \n%s \n%s \n%s", name, sexResult, getSpouceName(), getParents(getNamePosition(name)), checkBrotherSister());
    }

    public String getSpouceName() {
        String spouse = "";
        int sexId = sex;

        if (sexId == 2) {
            spouse = "Муж: ";
            sexId = 1;
        } else if (sexId == 1) {
            spouse = "Жена: ";
            sexId = 2;
        } else {
            spouse = "";
        }
        String[][] arrayS = new String[5][3];
        arrayS[0][0] = arrayS[0][1] = arrayS[0][2] = "Не в браке";
        arrayS[1][1] = Program.person1.name;
        arrayS[1][2] = Program.person2.name;
        arrayS[2][1] = Program.person3.name;
        arrayS[2][2] = Program.person4.name;
        arrayS[3][1] = Program.person5.name;
        arrayS[3][2] = Program.person6.name;
        spouse += arrayS[marriageId][sexId];
        return spouse;
    }

    public int getNamePosition(String s) {
        String[] nameBase = new String[]{"0", Program.person1.name, Program.person2.name, Program.person3.name, Program.person4.name,
                Program.person5.name, Program.person6.name, Program.person7.name, Program.person8.name};
        int temp = Arrays.asList(nameBase).indexOf(s);
        return Arrays.asList(nameBase).indexOf(s);
    }

    public String getParents(int x) {
        Map<Integer, String> mapParents = new HashMap<>();
        mapParents.put(1, format("Отец: %s \nМать: %s ", Program.person3.name, Program.person4.name));
        mapParents.put(2, format("Отец: %s \nМать: %s ", Program.person5.name, Program.person6.name));
        mapParents.put(3, "N/A");
        mapParents.put(4, "N/A");
        mapParents.put(5, "N/A");
        mapParents.put(6, "N/A");
        mapParents.put(7, format("Отец: %s \nМать: %s ", Program.person3.name, Program.person4.name));
        mapParents.put(8, format("Отец: %s \nМать: %s ", Program.person5.name, Program.person6.name));
        return mapParents.get(x);
    }
    public String checkBrotherSister() {
        if (sister != null) {
            return format("Сестра: %s", sister);
        } else if (brother != null) {
            return format("Брат: %s", brother);
        } else {
            return "у данного человека нет братьев или систер";
        }

    }
    /* public static String getName(int x) {
        String[] nameArray = new String[]{"0", Program.person1.name, Program.person2.name, Program.person3.name,
                Program.person4.name, Program.person5.name, Program.person6.name, Program.person7.name, Program.person8.name};
        return nameArray[x];
    }*/
}
