public class Student {
   private int age;
   private String firstName;
   private String lastName;
   private int year;
   private Address address;
    public Student(int age, String firstName, String lastName, int year, Address address) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
    }
    public int getAge() {return age;}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public int getYear() {return year;}

    public Address getAddress() {return address;}

    public void setAge(int age) {this.age = age;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    private void addOneAge() {age++;}

    public int birthday() {
        addOneAge();
        return age;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + ", age " + age + ", year " + year + ", " + address.toString();
    }
}
