package additional;

public class reverseStringRecur {

    public static void main(String[] args) {
        String substring = "Lukasz".substring(0, 1);
        System.out.println("Lukasz".length());
        System.out.println(substring);

        System.out.println("Now reversing a string");
        String result = reverseStringRecur("Lukasz");
        System.out.println(result);
    }

    public static String reverseStringRecur(String s){

        if(s.length() == 0){
            return "";
        }

        return "" + s.charAt(s.length()-1) + reverseStringRecur(s.substring(0,s.length()-1));
    }

}
