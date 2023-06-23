//Use Java Object Oriented
//Programming Concepts of Line
//and Point as well as equals and
//compareTo methods. - Using Java compareTo method to compare 2 Lengths is
//preferable.
package linecomparison;
import java.util.Scanner;
public class LineComparison {

    public void equality(double l1,double l2){
        if(l1==l2)
        {
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }
    }
    public void compare1(double l1,double l2) {
        if (l1 == l2) {
            System.out.println("line1 and line2 is equal");
        } else if (l1 > l2) {
            System.out.println("line1 is greater than line2");
        } else {
            System.out.println("line1 is less than line2");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("line1");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("line2");
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double len2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        LineComparison a=new LineComparison();
        a.equality(len1,len2);
        a.compare1(len1,len2);

        }
    }

