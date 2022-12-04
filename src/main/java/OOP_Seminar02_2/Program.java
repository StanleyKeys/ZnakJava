package OOP_Seminar02_2;


import static java.lang.String.format;

public class Program {
    public static void main(String[] args) {
        GeotreeSystem hb = new GeotreeSystem();
        System.out.println(hb.searchParents("Stanislav"));
    }
}
interface PersonDescription {
    String getFirstName();

}
class Person implements PersonDescription{
    String firstName;
    String parent, grandies, broSis, children;

    public Person(String name) {                        // Метод принимает имя Экзмепляра.
        firstName = name;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

}
/*
interface Search {
    String getParents();
}

class Research implements Search {

    @Override
    public String getParents() {
        return format("Parents: %s", ParentTies.children);
    }
}
*/
interface Tree {
    String searchParents(String personName);
    String searchGrandies(String personName);
    String searchBrotherSister(String personName);
}

class GeotreeSystem implements Tree {

    Person Stanislav = new Person("Stanislav");
    Person Yuliya = new Person("Yuliya");
    Person Kirill = new Person("Kirill");
    Person Tatyana = new Person("Tatyana");
    Person Viktor = new Person("Viktor");
    Person Galina = new Person("Galina");
    Person Vyacheslav = new Person("Vyacheslav");
    Person Aleksandr = new Person("Aleksandr");
    Person Evgeniy = new Person("Evgeniy");
    Person Valeriya = new Person("Valeriya");
    public void fillingGeo() {
        Stanislav.parent = format("%s \nFather: %s \nMother: %s", Stanislav.firstName, Viktor.firstName, Tatyana.firstName);
        Stanislav.grandies = format("%s \nGrandFather: %s \nGrandMother: %s", Stanislav.firstName, Vyacheslav.firstName, Galina.firstName);
        Stanislav.broSis = format("%s \nBrother: %s \nSister: %s", Stanislav.firstName, Kirill.firstName, null);
        Stanislav.children = format("%s \nChildren: %s, %s, %s ", Stanislav.firstName, Aleksandr.firstName, Evgeniy.firstName, Valeriya.firstName);
        Valeriya.parent = format("%s \nFather: %s \nMother: %s", Valeriya.firstName, Stanislav.firstName, Yuliya.firstName);
        Valeriya.grandies = format("%s \nGrandFather: %s \nGrandMother: %s", Valeriya.firstName, Viktor.firstName, Tatyana.firstName);
        Valeriya.broSis = format("%s \nBrothers: %s, %s", Valeriya.firstName, Aleksandr.firstName, Evgeniy.firstName);
        Aleksandr.parent = format("%s \nFather: %s \nMother: %s", Valeriya.firstName, Stanislav.firstName, Yuliya.firstName);
        Aleksandr.grandies = format("%s \nGrandFather: %s \nGrandMother: %s", Valeriya.firstName, Viktor.firstName, Tatyana.firstName);
        Aleksandr.broSis = format("%s \nBrother: %s \nSister: %s", Aleksandr.firstName, Evgeniy.firstName, Valeriya.firstName);
        Evgeniy.parent = format("%s \nFather: %s \nMother: %s", Valeriya.firstName, Stanislav.firstName, Yuliya.firstName);
        Evgeniy.grandies = format("%s \nGrandFather: %s \nGrandMother: %s", Valeriya.firstName, Viktor.firstName, Tatyana.firstName);
        Evgeniy.broSis = format("%s \nBrother: %s \nSister: %s", Evgeniy.firstName, Aleksandr.firstName, Valeriya.firstName);
    }

    @Override
    public String searchParents(String name) {
        fillingGeo();
        if (name == Stanislav.firstName) {
            return Stanislav.parent;
        } else if (name == Valeriya.firstName) {
            return Valeriya.parent;
        } else if (name == Aleksandr.firstName) {
            return Aleksandr.parent;
        } else if (name == Evgeniy.firstName) {
            return Evgeniy.parent;
        }
        return null;
    }

    @Override
    public String searchGrandies(String name) {
        fillingGeo();
        if (name == Stanislav.firstName) {
            return Stanislav.grandies;
        } else if (name == Valeriya.firstName) {
            return Valeriya.grandies;
        } else if (name == Aleksandr.firstName) {
            return Aleksandr.grandies;
        } else if (name == Evgeniy.firstName) {
            return Evgeniy.grandies;
        }
        return null;
    }

    @Override
    public String searchBrotherSister(String name) {
        fillingGeo();
        if (name == Stanislav.firstName) {
            return Stanislav.broSis;
        } else if (name == Valeriya.firstName) {
            return Valeriya.broSis;
        } else if (name == Aleksandr.firstName) {
            return Aleksandr.broSis;
        } else if (name == Evgeniy.firstName) {
            return Evgeniy.broSis;
        }
        return null;
    }
}

