import java.util.Scanner;
public class Switch {
    public static void main(String [] args){
        System.out.println("Enter choice letter:\na) hi\nb) hello\nc) hey");
        Scanner obj = new Scanner(System.in);
        String choice = obj.next();
        switch (choice)
        {
            case "a" : System.out.println("you have selected hi");
            break;
            case "b" : System.out.println("you have selected hello");
            break;
            case "c" : System.out.println("you have selected hey");
            break;
            default : System.out.println("invalid input");
            break;
        }
    }
}
