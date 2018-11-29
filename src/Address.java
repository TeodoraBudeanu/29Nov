public class Address {

    /**
     * Addresses for each Hobby.
     */

    private String street;
    private int no;
    private String country;
    private String zipCode;

    public Address(String street, int no, String country, String zipCode) {
        this.street = street;
        this.no = no;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", no=" + no +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
