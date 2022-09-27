import java.util.Scanner;

public class Qus3 {
    static void area(int r){
        float ar = (float) (3.14159 * r * r);
        System.out.println("Area of circle : " + ar);
    }

    static void circum(int r){
        float c = (float)(2 * 3.14159 * r);
        System.out.println("Circumference of circle : " + c);
    }

    public static void main(String[] args) {
        System.out.println("****MENU**** \n1.Calculate area of circle." +
                "\n2.Calculate circumference of circle. " +
                "\n3.Exit" );

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("Choose an option (1-3):");
            option = sc.nextInt();
            int radius = 0;
            if(option == 3){
                System.out.println("Exited");
            }
            else{
                System.out.println("Enter the Radius");
                radius = sc.nextInt();
            }


            switch (option){
                case 1: area(radius);
                    break;
                case 2: circum(radius);
            }
        }while(option != 3);

    }
}
