public class Main {

    public static void main(String[] args) {

        /**
         * If you want to build a TreeSet sorted by name, use class RepoByName.
         * If you want to build a TreeSet sorted by age, please use class RepoByAge.
         */

        RepoByName persons = new RepoByName();
//        RepoByAge persons = new RepoByAge();
        Person p1 = new Person("Ana", 25);
        Person p2 = new Person("Maria", 20);
        Person p3 = new Person("Maria", 20);
        Person p4 = new Person("Stefan", 22);
        Person p5 = new Person("Alex", 24);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);


       persons.list();

        HobbyList list1 = new HobbyList();
        list1.addHobby(p1, "Swimming");

        list1.printHobbiesForPerson((p1));
    }
}
