package streamkata;

/**
 * Created by BKERL on 28/12/2016.
 */

class Person {
    private String name;
    private int age;
    private String country;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String country) {
        this(name, age);
        this.country = country;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    String getCountry() {
        return country;
    }
}
