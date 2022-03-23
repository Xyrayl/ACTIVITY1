package CarolynDelatorre;

public class Removeallwhitespacesfromthegivenstring {

public static void main(String[] args) {
  String str = "  j a va l yn s  ";
  
  String str1 = str.replaceAll("\\s", "");
  System.out.println(str1);
  
  
  
}
}
