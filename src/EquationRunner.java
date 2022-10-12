import java.util.*;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first coordinate(no spaces, with parenthesis, with comma): ");
        String coord1 = s.nextLine();
        String x = coord1.substring(1,coord1.indexOf(","));
        System.out.println(x);
        int xCoord1 = Integer.parseInt(x);
        System.out.println(xCoord1);
        System.out.println("Enter second coordina" +
                "brororororoorte(no spaces, with parenthesis, with comma): ");

    }
}
