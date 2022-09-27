class Employee{
    String firstName;
    String lastName;
    int age;
    String designation;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }

    Employee(String firstName, String lastName, int age, String designation){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }
    public Employee() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}


public class Qus5 {
    public static void main(String[] args) {

        Employee em = new Employee("Vineet", "Rathi", 21, "Noida");
        System.out.println(em);
    }
}
