
//Area of the circle
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner pi = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double Pi = pi.nextDouble();

    Scanner radius = new Scanner(System.in);

    System.out.println("Enter the radius of the redius: ");
    Double Radius = radius.nextDouble();
    Double area = Math.PI * Radius * Radius;
    System.out.println("The area of the circle is " + area);
  }
}
