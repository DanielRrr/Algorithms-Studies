public class Main {
   public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    Reader reader = new InputStreamReader(inputStream, charset);
    String result = "";
    int in;
    while ((in = reader.read()) > 0) {
        result += (char)in;
    }
    return result;
}
}
