public static int[] mergeArrays(int[] a1, int[] a2) {
    int res[] = new int[a1.length + a2.length];
    System.arraycopy(a1, 0, res, 0, a1.length);
    System.arraycopy(a2, 0, res, a1.length, a2.length);
    Arrays.sort(res);
    return res; // your implementation here
}
