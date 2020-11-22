package Codility;

public class BinaryGap {


    public static void main(String[] args) {
        String s = Long.toBinaryString(1041);
        System.out.println(s);

        String s1 = Long.toBinaryString(3000);
        System.out.println(s1 + " and the max binary gap is: " + maxBinaryGap(s1));

    }

    public static int maxBinaryGap(String s) {

        int modifier = 0;
        if (s.endsWith("0")){
            modifier = 1;
        }

        String[] split = s.split("1");

        int max = 0;
        for (int i = 0; i < split.length - modifier; i++) {
            if (split[i].length() > max) {
                max = i;
            }
        }
        return max;
    }

}
