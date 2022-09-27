import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text : ");
        List<String> text = new ArrayList<>();

        while(true){
            String str = sc.nextLine();
            if("XDONE".equalsIgnoreCase(str)){
                break;
            }
            text.add(str);
        }
        System.out.println(text);
    }
}
