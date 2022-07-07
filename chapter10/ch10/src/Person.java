// Name: Hansel Doan
// Date: add date here
// Assignment: Chapter 10
// Description:
// Create a default as well as overloaded constructor.
// Default constructor will initialize all fields to empty.
// Create all Setters and Getters for all instance variables.
// Use toString method that will show the info of the Person.
// As specified in statement, add a method to show spouse.
// If spouse is null, return "Not Married."
// other wise, call toString method.
// The method getMarried which is the only place to instantiate spouse.
// Taking name, birthDate and sex as parameters.
// Inside main, creating a Person and display his info.
// As demonstrated, calling showSpouse to show that person is not married.
// Then--calling the getMarried method to get marry and then display Spouse info.
// Finally call showSpouse function.

public class Person {

    private String name;
    private String birthDate;
    private String sex;
    private Person spouse;

    public Person() {
        this.name = "";
        this.birthDate = "";
        this.sex = "";
    }

    public Person(String name, String birthDate, String sex) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Birth Date: " + birthDate + "\n"
                + "Sex: " + sex;
    }

    public String showSpouse() {
        if (this.spouse == null) {
            return "Not Married";
        } else {
            return spouse.toString();
        }
    }

    public void getMarried(String name, String birthDate, String sex) {

        this.spouse = new Person();
        this.spouse.setName(name);
        this.spouse.setBirthDate(birthDate);
        this.spouse.setSex(sex);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", "1993-02-12", "Male");

        System.out.println("\n----- Person's info -----");
        System.out.println(p1.toString());
        System.out.println("\n_____ Spouse's info _____");
        System.out.println(p1.showSpouse());

        System.out.println("\n----- After getting married ----");
        System.out.println("\n_____ Spouse's info _____");
        p1.getMarried("Jane", "1997-04-15", "Female");
        System.out.println(p1.showSpouse());
    }
}
