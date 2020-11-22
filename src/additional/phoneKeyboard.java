package additional;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class phoneKeyboard {

    private static final Map<String,String> mapper = new HashMap() {{
        put("A","2");
        put("B","22");
        put("C","222");
        put("D","3");
        put("E","33");
        put("F","333");
        put("G","4");
        put("H","44");
        put("I","444");
        put("J","5");
        put("K","55");
        put("L","555");
        put("M","6");
        put("N","66");
        put("O","666");
        put("P","7");
        put("Q","77");
        put("R","777");
        put("S","7777");
        put("T","8");
        put("U","88");
        put("V","888");
        put("W","9");
        put("X","99");
        put("Y","999");
        put("Z","9999");
    }};

    public  String fromMapper(String letter){
        return mapper.getOrDefault(letter,"");
    }

    public String encodeSimple(String word){
        String result = "";
        if(Objects.nonNull(word)) {
            for (int i=0;i < word.length(); i++){
                String letter = String.valueOf(word.charAt(i));
                result += fromMapper(letter);
            }
        }
        return result;
    }

    public String encodeWithReduce(String word){
        if(Objects.nonNull(word)) {
            String result = word.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .reduce("",(accumulator,element) -> accumulator + fromMapper(element));
            return result;
        }
        return "";
    }

    public String encodeWithRecursion(String word) {
        if (Objects.nonNull(word) && word.length() > 0) { // sorry, nie wiem czemu tutaj higlighter uparł się na wstawienie encji HTML
            String mapped = fromMapper(String.valueOf(word.charAt(0)));
            return mapped + encodeWithRecursion(word.substring(1));
        }
        return "";
    }

    public static void main(String[] args) {
        phoneKeyboard phoneKeyboard = new phoneKeyboard();
        System.out.println(phoneKeyboard.encodeSimple("Lukasz"));

        System.out.println(phoneKeyboard.encodeWithReduce("Lukasz"));

        System.out.println(phoneKeyboard.encodeWithReduce("Lukasz"));
    }

}
