import java.util.Set;
import java.util.TreeSet;

public class RepoByName {

    Set<Person> pers = new TreeSet<Person>(new NameComparator());

    public void add(Person t) {
        pers.add(t);
    }

    public void remove(Person t) {
        pers.remove(t);
    }

    public void list() {
        System.out.println("This set has the following " + pers.size() + " objects:");
        for (Object o : pers) {
            System.out.println(o);
        }
        System.out.println("\n");
    }
}
