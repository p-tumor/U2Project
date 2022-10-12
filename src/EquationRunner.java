import java.util.*;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double xCoord1;
        double yCoord1;
        double xCoord2;
        double yCoord2;

        System.out.print("Enter first coordinate(no spaces, with parenthesis, with comma): ");
        String coord1 = s.nextLine();
        String x = coord1.substring(1,coord1.indexOf(","));
        try{xCoord1 = Double.parseDouble(x);}catch(Exception e){xCoord1 = Integer.parseInt(x);}
        String y = coord1.substring(coord1.indexOf(",")+1,coord1.length()-1);
        try{yCoord1 = Double.parseDouble(y);}catch(Exception e){yCoord1 = Integer.parseInt(y);}

        System.out.print("Enter second coordinate(with parenthesis, with comma): ");
        String coord2 = s.nextLine();
        String x2 = coord2.substring(1,coord2.indexOf(","));
        try{xCoord2 = Double.parseDouble(x2);}catch(Exception e){xCoord2 = Integer.parseInt(x2);}
        String y2 = coord2.substring(coord2.indexOf(",")+1,coord2.length()-1);
        try{yCoord2 = Double.parseDouble(y2);}catch(Exception e){yCoord2 = Integer.parseInt(y2);}

        LinearEquation l = new LinearEquation(xCoord1,yCoord1,xCoord2,yCoord2,0);

        System.out.println(l.toString());

        System.out.println("Input your own x-value! ");
        double newX = s.nextDouble();
        l.customx(newX);

        System.out.println(l.solveY());


    }
}
