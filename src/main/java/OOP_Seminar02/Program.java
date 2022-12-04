package OOP_Seminar02;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
       var Irina = new Person("Irina");
       var Katya = new Person("Katya");

        //System.out.println(Irina);
        GeoTree gt = new GeoTree();
        gt.append(Irina, Katya);

        Research research1 = new Research(gt);
        System.out.println(research1.spend(Katya, ParentTies.parent));
    }
}


interface PersonDescription {
    String getFirstName();
}
class Person implements PersonDescription {
    private String firstName;

    public Person(String name) {                        // Метод принимает имя Экзмепляра.
        firstName = name;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return getFirstName();
    }
}

enum ParentTies {
    parent, children;
}

class Bond {
    Person p1;
    ParentTies pt;
    Person p2;

    public Bond(Person p1, ParentTies pt, Person p2) {
        this.p1 = p1;
        this.pt = pt;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, pt, p2);
    }
}
interface Tree {
    void append(Person parent, Person children);
    ArrayList<Bond> getData();
}

class GeoTree implements Tree {
    private ArrayList<Bond> tree = new ArrayList<>();

    public ArrayList<Bond> getData() {
        return tree;
    }

    public void append(Person parent, Person children) {

        tree.add(new Bond(parent, ParentTies.parent, children));
        tree.add(new Bond(children, ParentTies.children, parent));
    }
}

class Research {
    ArrayList<Bond> tree;

    public Research(Tree pd) {
        tree = pd.getData();
    }

    public ArrayList<Person> spend(Person p, ParentTies pt) {

        var result = new ArrayList<Person>();

        // tree.forEach((t) -> {
        // if (t.p1.fullName == p.fullName
        // && t.re == re) {
        // result.add(t.p2);
        // }
        // });

        for (Bond t : tree) {
            if (t.p1.getFirstName() == p.getFirstName()
                    && t.pt == pt) {
                result.add(t.p2);
            }
        }

        return result;
    }
}
enum GrandTies {
    grandFather, grandMother;
}

enum Sex {
    male, female;
}
