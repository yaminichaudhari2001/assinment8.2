//As a fan of geometry, I want to
//model a line based on a point
//consisting of (x, y) co-ordinates
//using the Cartesian system,
//So that I can calculate its
//length. - A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2
//
//- y1) ^ 2)
package linecomparison;
import java.util.Scanner;
public class LineComparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of the given Line is : " + len + " units" );
    }
}
