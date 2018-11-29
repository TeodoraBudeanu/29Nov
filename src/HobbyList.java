import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HobbyList {
    /**
     * Creates a HashMap that puts together a Person with his/her hobbies (as a list).
     */

    Map<Person, List<Hobby>> hobbiesByPers = new HashMap<>();

    public void addHobby(Person p, String hobbyName){
        Hobby h = new Hobby(hobbyName);
        List<Hobby> list = hobbiesByPers.get(p);
    //    list.add(h); //TODO: NullPointerException
        hobbiesByPers.remove(p);
        hobbiesByPers.put(p, list);
    }

    public void setHobbyFrequency(Person p, String hobbyName, int freq){
        List<Hobby> list = hobbiesByPers.get(p);
        for (Hobby h: list) {
            if (h.getHobbyName() == hobbyName){
                h.setFrequency(freq);
            }
        }
    }

    public void printHobbiesForPerson(Person p){
        System.out.println(hobbiesByPers.get(p));

    }






}
