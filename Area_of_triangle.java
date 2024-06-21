//The area of a triangle
import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {

      Scanner Base = new Scanner(System.in);
      System.out.println("Enter the legnth of the rectangle: ");

    int base = Base.nextInt();
      //Wighth of the rectangle
    Scanner Width = new Scanner(System.in);
    System.out.println("Enter the width of the rectangle: ");
    int width = Width.nextInt();
    float area = (base * width) / 2.0f;
    //printing out the area of the rectangle value
    System.out.println("The area of the rectangle is " + area);

  }
}
