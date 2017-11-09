public class ReverseOrder {
    public static String reverse(final String str) {

        int len = str.length();
        StringBuilder reversed = new StringBuilder(len);

        for (int i = (len - 1); i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println(reversed);
        return reversed.toString();
    }
}
