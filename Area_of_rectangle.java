//Area of the rectangle
import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {

      Scanner legnth = new Scanner(System.in);
      System.out.println("Enter the legnth of the rectangle: ");

    int length = legnth.nextInt();
      //Wighth of the rectangle
    Scanner Width = new Scanner(System.in);
    System.out.println("Enter the width of the rectangle: ");
    int width = Width.nextInt();
    int area = length * width;
    //printing out the area of the rectangle value
    System.out.println("The area of the rectangle is " + area);

  }
}
