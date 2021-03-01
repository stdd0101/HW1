public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;
    private Person person;


    public Person build() {
        return this.person = new Person(this.name, this.surname, this.age, this.address);
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