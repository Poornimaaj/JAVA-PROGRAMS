import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 
  String languages[] = { "C", "C++", "Java", "Perl", "Python" };
 
  try {
    for (int c = 0; c <= 5; c++) {
      System.out.println(languages[c]);
    }
  }
  catch (Exception e) {
    System.out.println(e);
  }
  }
}
