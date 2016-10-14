public class checkSumOfStream {
   public static int checkSumOfStream(InputStream inputStream) throws IOException {
    int input = 0;
    int result = 0;
    while ((input = inputStream.read()) != -1) {
        result = Integer.rotateLeft(result, 1) ^ Math.abs(input);
    };
    return result;
}
