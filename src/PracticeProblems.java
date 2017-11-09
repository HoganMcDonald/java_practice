public class PracticeProblems {

  public static void main(String[] args) {

  }

  // checks if a string contains
  public static boolean getXO (String str) {
    int xCount = 0;
    int oCount = 0;

    for (int i = 0; i <= str.length() - 1; i++) {
      String sub = str.substring(i, i + 1).toLowerCase();
      if (sub.equals("x")) {
        xCount++;
      } else if (sub.equals("o")) {
        oCount++;
      }
    }

    return xCount == oCount;
  } // end getXO

  // return the number of vowels in a string
  public static int getCount(String str) {
    int vowelCount = 0;
    final String vowels = "aeiou";

    for (int i = 0; i <= str.length() - 1; i++) {
      String c = str.substring(i, i + 1);
      if (vowels.contains(c.toLowerCase())) {
        vowelCount++;
      }
    }

    return vowelCount;
  } // end getCount

  // reverse the order of a String
  public static String reverse(final String str) {

      int len = str.length();
      StringBuilder reversed = new StringBuilder(len);

      for (int i = (len - 1); i >= 0; i--) {
          reversed.append(str.charAt(i));
      }

      return reversed.toString();
  } // end reverse

}
