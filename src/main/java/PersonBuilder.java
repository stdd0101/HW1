public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;
    private Person Person;


    public Person build() {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setAddress(address);
        return Person;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
}