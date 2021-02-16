import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first message: ");
    String message01 = input.nextLine();
    System.out.print("Enter your second message: ");
    String message02 = input.nextLine();

    System.out.println(message01 + " " + message02);
  }
}