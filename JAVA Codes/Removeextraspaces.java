public class Removeextraspaces {
    public static void main(String[] args) {
        String text= "String   with multiple Spaces";
        String result=text.replaceAll("\\s+"," ");

        result= result.trim();

        System.err.println(result);
    }
}
