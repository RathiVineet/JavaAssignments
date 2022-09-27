public class Qus1 {
    static String FirstName;
    static String LastName;
    static int age;

    static {
        FirstName = "Vineet";
        LastName = "Rathi";
        age = 22;
    }
    static void printData(){
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(age);
    }

    public static void main(String[] args) {

        printData();

    }
}
