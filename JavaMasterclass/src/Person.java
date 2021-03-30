public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(21);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("is teen = " + person.isTeen());
        person.setLastName("Smith");
        person.setAge(17);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("is teen = " + person.isTeen());
        person.setFirstName("John");
        System.out.println("Full name = " + person.getFullName());

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
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
}