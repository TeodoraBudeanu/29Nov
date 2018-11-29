import java.util.Set;
import java.util.TreeSet;

public class RepoByAge {

    Set<Person> pers = new TreeSet<Person>(new AgeComparator());

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
