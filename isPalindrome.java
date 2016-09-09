public static boolean isPalindrome(String text) {
    String cleantext = text.toLowerCase().replaceAll("[^A-Za-z1-9]+","");
    int n = cleantext.length();
    for (int i = 0; i < (n / 2); ++i) {
        if (cleantext.charAt(i) != cleantext.charAt(n - i - 1)) {
            return false;
     }
  }

  return true;
}
