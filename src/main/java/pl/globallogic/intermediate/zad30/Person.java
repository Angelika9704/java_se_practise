package pl.globallogic.intermediate.zad30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(13);

        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teen: " + person.isTeen());

        person.setFirstName("Jane");
        person.setLastName("Dawson");
        person.setAge(26);

        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teen: " + person.isTeen());
    }
}
