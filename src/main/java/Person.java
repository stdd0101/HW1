public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    private PersonBuilder PersonBuilder;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int happyBirthday(int age) {
        age++;
        return age;
    }

    public boolean hasAddress(String address) {
        return address != null;
    }

    public void setAddress(String city) {
        this.address = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(this.surname);
        return childBuilder;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.age + " " + this.address;
    }
}
