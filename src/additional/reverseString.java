package additional;

public class reverseString {
    public static void main(String[] args) {
        String name = "Lukasz";
        System.out.println(reverseStringManually(name));

        String name1 = "Lukasz";
        System.out.println(reverseWithStringBuilder(name1));
    }

    public static String reverseStringManually(String s){
        return new StringBuilder(s)
                .reverse()
                .toString();
    }

    private static String reverseWithStringBuilder(String s){
        StringBuilder reversedString = new StringBuilder();

        for (int i=s.length()-1;i>=0;i--){
            reversedString.append(s.charAt(i));
        }

        return reversedString.toString();
    }

}
