package data_structures.arrays;

public class ReverseString {

  public static String reverseString(String string) {
    String result = ""; //It's more recommended to use "StringBuilder" object when manipulating strings
    final int length = string.length();
    for (int i = length - 1; i >= 0; i--) {
      result += string.charAt(i);
    }
    return result;
  }

  public static String reverseStringWithReelJava(String string) {
    return new StringBuilder(string).reverse().toString();
  }

  public static String recursiveReversal (String str) {
    if (str.length() == 0)  //breakpoint for recursion
       return "";
    return recursiveReversal(str.substring(1)) + str.charAt(0);
  }

  public static void main(String[] args) {
    System.out.println(reverseString("123456"));
    System.out.println(reverseStringWithReelJava("123456"));
    System.out.println(recursiveReversal("123456"));
  }
}
