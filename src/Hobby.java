import java.util.List;

public class Hobby {

    private String hobbyName;
    private int frequency;
    private List<Address> adresses;

    public Hobby(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", adresses=" + adresses +
                '}';
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void addNewAdress(Address a) {
        adresses.add(a);
    }


}
