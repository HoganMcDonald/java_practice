public class Count {
  public static int[] countPositivesSumNegatives(int[] input) {
    int[] output = new int[]{0, 0};

    for (int i = 0; i <= input.length - 1; i++) {
      if (input[i] >= 0) {
        System.out.println(output[0]);
        output[0]++;
      } else {
        System.out.println(output[1]);
        output[1] += input[i];
      }
    }

    System.out.println(output);
    return output;
  }
}
